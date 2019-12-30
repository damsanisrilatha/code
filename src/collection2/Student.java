package collection2;

public class Student {
   private int id;
   private String name;
   private int marks;
   
	@Override
	public int hashCode() {
		int h= 31 * id * name.hashCode();
		return h;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if(this.id==other.id && this.name.equals(other.name)){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [ id="+ this.id + ", name="+this.name+" ]";
	}
   
   
}
