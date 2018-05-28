import java.util.HashSet;

public class set {
public static void main(String[] args) {
	HashSet<emp> s= new HashSet<emp>();
	emp e1=new emp("nilesh", 20);
	emp e2=new emp("nilesh", 20);
	emp e3=new emp("nilesh1", 200);
	emp e4=new emp("nilesh2", 200);
	emp e5 = e1;
	
	s.add(e1);
	s.add(e2);
	s.add(e3);
	s.add(e4);
	s.add(e5);
	System.out.println(s);
}
}
class emp{
	
	private String nm;
	private int id;
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public emp(String nm, int id) {
		super();
		this.nm = nm;
		this.id = id;
	}
	@Override
	public String toString() {
		return "emp [nm=" + nm + ", id=" + id + "]";
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
		emp other = (emp) obj;
		if (id != other.id)
			return false;
		if (nm == null) {
			if (other.nm != null)
				return false;
		} else if (!nm.equals(other.nm))
			return false;
		return true;
	}
	
	
}