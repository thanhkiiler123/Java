package bai11;
import java.util.*;
public class ComparatorHoTen implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		return o1.getHoTen().compareTo(o2.getHoTen());
	}
}
