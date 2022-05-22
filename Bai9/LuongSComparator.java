package bai9;
import java.util.*;
public class LuongSComparator implements Comparator<CongNhan> {
		@Override
		public int compare (CongNhan o1, CongNhan o2) {
			if (o1.luongS()==o2.luongS()) {
				return 0;
			}
			else if (o1.luongS()>o2.luongS()) {
				return 1;
			}
			else return -1;
		}
}
