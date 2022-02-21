package src;

import java.util.Comparator;

public class SortPersonByLastName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getLname().compareTo(o2.getLname());
	}

}
