package bai10;
import java.util.*;
public class SoLuongTuLanhComparator implements Comparator<TuLanh>{
	public int compare(TuLanh o1, TuLanh o2) {
		if (o1.getSoLuong()==o2.getSoLuong()) {
			return 0;
		}
		if(o1.getSoLuong()<o2.getSoLuong()) {
			return 1;
		}
		else return -1;
	}
}
