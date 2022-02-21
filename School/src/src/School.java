package src;

import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School{


		List<Student> studentRoster= new ArrayList<>();
		List<Person> personRoster= new ArrayList<>();
		
	
		public void addStudent(Student[] s) {
			
			for(int i=0;i<s.length;i++)
			{
				studentRoster.add(s[i]);
			}
			
			//System.out.println(studentRoster);
			
		}
		public void addStudentToPerson(Student[] s) {
			
			for(int i=0;i<s.length;i++)
			{
				personRoster.add(s[i]);
			}
			
		}		
		
		public void sortStudents(){
		
			System.out.println("**********************************************************");
			 System.out.println("\t Sorting Person List\t\n");
			System.out.println("1. Sorting students using their IDs");
			Collections.sort(studentRoster,new SortById());
			//System.out.println("ID\t"+"Last Name\t"+"GPA");
			for(int i=0;i<studentRoster.size();i++)
			System.out.println(studentRoster.get(i));
			
			System.out.println("**********************************************************");
			System.out.println("2. Sorting students using their GPA");
			Collections.sort(studentRoster,new SortByGPA());
		//	System.out.println("ID\t"+"Last Name\t"+"GPA");
			for(int i=0;i<studentRoster.size();i++)
			System.out.println(studentRoster.get(i));
			
			System.out.println("**********************************************************");
			System.out.println("3. Sorting students using their Last Names");
			Collections.sort(studentRoster,new SortByLastName());
		//	System.out.println("ID\t"+"Last Name\t"+"GPA");
			for(int i=0;i<studentRoster.size();i++)
			System.out.println(studentRoster.get(i));
			
			
			System.out.println("**********************************************************");
			System.out.println("4. Sorting students using their Age");
			Collections.sort(studentRoster,new SortByAge());
		//	System.out.println("ID\t"+"Last Name\t"+"Age");
			for(int i=0;i<studentRoster.size();i++)
			System.out.println(studentRoster.get(i));
			
		}
		
		public void sortPerson()
		{
			System.out.println("**********************************************************");
			System.out.println("**********************************************************");
			  System.out.println("\tSorting Person List\t");
			  System.out.println("Sorting people using Last Names");
			Collections.sort(personRoster,new SortPersonByLastName());
			
		//	System.out.println("Last Name\t"+"Age\t");
			for(int i=0;i<personRoster.size();i++)
			System.out.println(personRoster.get(i));
			
			
			
			System.out.println("**********************************************************");
			
			  System.out.println("Sorting people using Age");
			  Collections.sort(studentRoster,new SortPersonByAge()); 
		//	  System.out.println("Last Name\t"+"Age\t");
				for(int i=0;i<studentRoster.size();i++)
				System.out.println(personRoster.get(i));
				 
			
			System.out.println("**********************************************************");
			System.out.println("Sorting people using GPA");
			
			
			Collections.sort(personRoster, new SortPersonByGPA());
							
			//System.out.println("ID\t"+"Last Name\t"+"Age");
			for(int i=0;i<personRoster.size();i++)
				System.out.println(personRoster.get(i));
				 
			
			System.out.println("**********************************************************");
			System.out.println("Sorting people using ID");
			
			
			Collections.sort(personRoster, new SortPersonById());
							
			//System.out.println("ID\t"+"Last Name\t"+"Age");
			for(int i=0;i<personRoster.size();i++)
				System.out.println(personRoster.get(i));

		}
		@Override
		public String toString() {
			return "School [studentRoster=" + studentRoster + ", personRoster=" + personRoster + "]";
		}
		
		
		
		
		void Demo()
		{
			
			Student stArray[] = new Student[5];
			Student s1=new Student("Pawar",25,1,3.86);
			Student s2=new Student("Sawant",21,2,4);
			Student s3=new Student("Joshi",24,4,2.8);
			Student s4=new Student("Wagh",21,7,3.34);
			Student s5=new Student("Shetye",23,6,4);
			
			stArray[0]=s1;
			stArray[1]=s2;
			stArray[2]=s3;
			stArray[3]=s4;
			stArray[4]=s5;
			
			
			Student person[]=new Student[5];
			Student p1=new Student("David",21,149,3.86);
			Student p2=new Student("Julia",23,131,3.4);
			Student p3=new Student("Charles",19,110,4);
			Student p4=new Student("Ben",24,114,2.49);
			Student p5=new Student("Nick",33,120,3.89);
			
			person[0]=p1;
			person[1]=p2;
			person[2]=p3;
			person[3]=p4;
			person[4]=p5;
			
			
			
			School s=new School();
			s.addStudent(stArray);
			s.addStudentToPerson(person);
			
			System.out.println("********Sorting the lists******");	
			
			s.sortStudents();
			
			s.sortPerson();
			
		}
			
			
			
		}
	

