package bai4;
import java.util.*;
public class TienBanTruComparator implements Comparator<HocSinh>{
	@Override
	public int compare(HocSinh o1, HocSinh o2) {
		if (o1.tienbantru()==o2.tienbantru())
			return 0;
		else if (o1.tienbantru()>o2.tienbantru())
			return 1;
		else return -1;
	}
}
