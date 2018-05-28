import java.io.Externalizable;

public class Excepimple {

	public static void main(String[] args) throws Exception {
		
		place p =new place("mumbai", 400059);
		Employee e = new Employee("nilesh", 50000, 26, p);
		//Employee e =null;
		System.out.println(e);
		
		boolean flag = false; 
		try {
			
			flag = verifyempdet(e);
			
		} catch (invadd|invsal|invage e2) {
			e2.printStackTrace();// TODO: handle exception
		}
			String option = flag ? "Yes" : "No";
			System.out.println("Employee Details are correct  :-"+option);
	}

	private static boolean verifyempdet(Employee e) throws invage,invsal,invadd,Exception {
		if(e == null||e.getAdd()==null)//if e is null or e.getadd null then false
		{
			throw new Exception("object cant null");
		}else if (e.getAge()<21)//if age is less 21 then false
		{
			throw new invage("less than age");
		}else if (e.getSal()<10000) //if sallary is less than10000 then false
		{
			throw new invsal("less salary");
		}else  {
			String s =e.getAdd().getCity();
			String i =String.valueOf(e.getAdd().getPin());
			if (!(s!=null && i.length()>=6))//city is not null and pin is gretar than 6 false but !false = true  
			{
				throw new invadd("ami mumbaikar");
			}
		}
		
		
		// TODO Auto-generated method stub
		return true;
	}

}
class place{
	
	private String city;
	private int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public place(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "place [city=" + city + ", pin=" + pin + "]";
	}
	
}
class Employee{
	private String empnm;
	private double sal;
	private int age;
	private  place Add;
	public String getEmpnm() {
		return empnm;
	}
	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public place getAdd() {
		return Add;
	}
	public void setAdd(place add) {
		Add = add;
	}
	public Employee(String empnm, double sal, int age, place add) {
		super();
		this.empnm = empnm;
		this.sal = sal;
		this.age = age;
		Add = add;
	}
	@Override
	public String toString() {
		return "Employee [empnm=" + empnm + ", sal=" + sal + ", age=" + age + ", Add=" + Add + "]";
	}
	
	
}