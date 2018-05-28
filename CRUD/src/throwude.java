import java.util.Scanner;

public class throwude {
	
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int age =s.nextInt();
	try {
		if(age<18) {
			throw new agenotfound("not audlt");
		}
	} catch (agenotfound e) {
		System.out.println(e);// TODO: handle exception
	}
}
}
class agenotfound extends Exception{

	public agenotfound(String string) {
		super(string);// TODO Auto-generated constructor stub
	}
	
}