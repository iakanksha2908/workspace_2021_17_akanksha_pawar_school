package src;
import java.util.*;

public class SortByLastName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getLname().compareTo(o2.getLname());
	}

}
