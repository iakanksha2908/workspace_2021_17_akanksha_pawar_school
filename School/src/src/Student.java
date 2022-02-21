package src;
public class Student extends Person{

	
	private int id;
	private double  GPA;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String lname, int age, int id, double gPA) {
		super(lname, age);
		this.id = id;
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [lname=" + super.getLname() + ",age=" + super.getAge() + ",id=" + id + ", GPA=" + GPA + "]";
	}
	
	
	
}	