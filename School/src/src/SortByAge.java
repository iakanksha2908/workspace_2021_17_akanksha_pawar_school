package src;

import java.util.Comparator;

public class SortByAge implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		
		return p1.getAge()-p2.getAge();
		 
	}

	
	
}
