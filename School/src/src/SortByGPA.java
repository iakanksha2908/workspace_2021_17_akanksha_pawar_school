package src;


import java.util.Comparator;

public class SortByGPA implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o1.getGPA()).compareTo(Double.valueOf(o2.getGPA()));
	}



}
