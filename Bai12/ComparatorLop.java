package bai12;
import java.util.*;
public class ComparatorLop implements Comparator<HocSinh>{
	public int compare(HocSinh o1, HocSinh o2) {
		return o1.getLop().compareTo(o2.getLop());
	}
}
