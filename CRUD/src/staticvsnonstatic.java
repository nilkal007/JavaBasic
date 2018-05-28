

class  a{
	
	int a ;		//non-static variable 
	int aa =10;
	void m1() //non-static method 
	{
		System.out.println(a); //non-static variable in non-static method same class
	}
	void m2() {
		System.out.println(a);
		m1();//non static method in non static method same class
	}
	static int aaa = 30;
	static int aaaa =40;
	static void a() //static method
	{
		System.out.println();
		
		a a1 = new a(); //create object for non static variable in static method
		System.out.println(a1.a); //non-static variable
		a1.a();//non static method
	}
	static void a1() {
		
		System.out.println(aaa);
		a();//same class static method in static
	}
	void ns() {
		a();
		System.out.println(aaaa);
		
	}
}

class b{
	
	static int b = 10;
	static void m2() {
		System.out.println();
		
	}
	static void b2() {
		System.out.println(a.aaa); //static in other class static method
		System.out.println(a.aaaa);
		a.a();
		a a1 = new A(); //create non static object in other class static method
		System.out.println(a1.a);
		System.out.println(a1.aa);
		a1.m1();
		
	}
	void b(){
		System.out.println(a.aaaa);//static member of other class in non static method
		System.out.println(a.aaa);
		a.A();
		a a1 = new a(); //non static member of other class in non static method
		System.out.println(a1.A);
		System.out.println(a1.aa);
		a1.m1();
		System.out.println(b);
		m2();
		
	}
	
	
}
public class staticvsnonstatic {

}
