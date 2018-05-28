package com.scp.emp.bean;
class a {
	int a =10;

	@Override
	public String toString() {
		return "a [a=" + a + "]";
	}
	
}
class b extends a{
	
	int b =20;

	@Override
	public String toString() {
		return "b [b=" + b + "]";
	}
} 
class c extends b{
	int c =30;

	@Override
	public String toString() {
		return "c [c=" + c + "]";
	}
}


public class olor   {
	public static void main(String[] args) {
		c a =new c();
		System.out.println(a.a+" "+a.b +" "+a.c);
	}
}