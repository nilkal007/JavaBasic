import java.awt.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class mapitra {
 
	public static void main(String[] args) {
		masteremp emp1 = new masteremp("nilesh", 1);
		masteremp emp2 = new masteremp("nilesh", 1);
		masteremp emp3 = new masteremp("prasad", 1);
		masteremp emp4 = new masteremp("prasad2", 15);
		masteremp emp5 = new masteremp("yzprasad", 14);
		masteremp emp6 = new masteremp("rishikesh", 16);
		HashMap<masteremp, Integer> e = new HashMap<>();
		System.out.println(e.put(emp1, 1));
		System.out.println(e.put(emp2, 2));
		System.out.println(e.put(emp3, 3));
		System.out.println(e.put(emp4, 4));
		System.out.println(e.put(emp5, 5));
		System.out.println(e.put(emp6, null));
		//by using set & iterator
		Set<masteremp> m1 =e.keySet();
		Iterator<masteremp> m2 = m1.iterator();
		while (m2.hasNext()) {
			masteremp masteremp = (masteremp) m2.next();
			System.out.print(masteremp.id);
			System.out.println(" "+masteremp.mn);
			System.out.println(masteremp);
				
		}
		//by using 
	}
}
class masteremp{
	String mn;
	int id;
	public masteremp(String mn, int id) {
		super();
		this.mn = mn;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((mn == null) ? 0 : mn.hashCode());
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
		masteremp other = (masteremp) obj;
		if (id != other.id)
			return false;
		if (mn == null) {
			if (other.mn != null)
				return false;
		} else if (!mn.equals(other.mn))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "masteremp [mn=" + mn + ", id=" + id + "]";
	}
	
	
}