
import java.util.Arrays;

class a{
	int i =10;
	
	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}

	
}
class b extends a{
	
	int j=20;

	

	@Override
	public String toString() {
		return "B [j=" + j + "]";
	}
	
}
class c extends b{
	int k = 30;
	
	@Override
	public String toString() {
		return "c [k=" + k + "]";
	}

	
	
}
public class xyz {

	public static void main(String[] args) {
	

		a[] obj =new a[10];
		obj[0] = new a();
		obj[1] =new b();
		obj[2] =new c();
		obj[3]= new a();
		obj[4] =new b();
		obj[5] = new c();
		obj[6] = new a();
		obj[7] =new b();
		obj[8] =new c();
		obj[9] = new a();
		
		
		System.out.println(Arrays.toString(obj));
		
		for (a a1 : obj) {
			if (a1 instanceof c) {
				c c1 = (c)a1;
				System.out.println("c s object");
				System.out.println(c1.i);
				System.out.println(c1.j);
				System.out.println(c1.k);
			}
			else if (a1 instanceof b) {
				b b1 =(b) a1;
				System.out.println("b s object");
				System.out.println(b1.i);
				System.out.println(b1.j);
				
			}
			else {
				System.out.println("a is object");
				System.out.println(a1.i);
			}
		}
	}
		
	
		
		
	}

