package src;

public class Person{

		@Override
	public String toString() {
		return "Person [Lname=" + Lname + ", age=" + age + "]";
	}
		private String Lname;
		private int age;
		public String getLname() {
			return Lname;
		}
		public void setLname(String lname) {
			Lname = lname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Person(String lname, int age) {
			super();
			Lname = lname;
			this.age = age;
		}
	
		
		

}
