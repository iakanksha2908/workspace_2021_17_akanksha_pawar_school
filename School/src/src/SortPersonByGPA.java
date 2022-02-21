package src;

import java.util.*;

public class SortPersonByGPA implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return Double.valueOf(s1.getGPA()).compareTo(Double.valueOf(s2.getGPA()));
	}

}
