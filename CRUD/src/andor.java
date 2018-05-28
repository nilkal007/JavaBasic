import java.util.HashMap;

class student{
	int id;
	String nm;
	public student(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nm == null) ? 0 : nm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		if (nm == null) {
			if (other.nm != null)
				return false;
		} 
		else if (!nm.equals(other.nm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", nm=" + nm + "]";
	}
	
}

public class andor {
	
public static void main(String[] args) {

	student e1 =new student(1, "nilesh");
	student e2 = new student(1, "nilesh");
	student e3 = new student(2, "prasad");
	student e4 = new student(2, "ganesh");
	student e5 = new student(4, "kuldeep");
	student e6 =e5;
	HashMap<student, String> hm =new HashMap<>();
	System.out.println(hm.put(e1, "emp1"));
	System.out.println(hm.put(e2, "emp2"));
	System.out.println(hm.put(e3, "emp3"));
	System.out.println(hm.put(e4, "emp4"));
	System.out.println(hm.put(e5, "emp5"));
	System.out.println(hm.put(e6, "emp6"));
	System.out.println(hm);
	
	
}
}
