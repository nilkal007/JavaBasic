
public class equalscp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1= new stud(1, "nil");
		stud s2= new stud(1, "nil");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        stud s3=s2;
        System.out.println(s3.hashCode());
        System.out.println(s3.equals(s2));
	}

}
class stud{
	int id;
	String nm;
	public stud(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "stud [id=" + id + ", nm=" + nm + "]";
	}
	@Override
	public int hashCode() {
		final int prime =31;
		int result =1;
		result =prime *result+id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this ==obj) 
			return true;
		 if (obj==null) 
			return false;
		if (getClass()!=obj.getClass()) 
			return false;
		stud st	= (stud)obj;
		 if (id !=st.id) 
			return false;
		if(nm .equals(st.nm))
			return false;
		return true;
	}
	
}