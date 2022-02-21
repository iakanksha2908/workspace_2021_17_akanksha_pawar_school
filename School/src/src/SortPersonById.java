package src;

import java.util.*;

public class SortPersonById implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		
		// TODO Auto-generated method stub
		return s1.getId()-s2.getId();
	}

}
