package bai12;
import java.util.*;
public class DanhSachHS {
	ArrayList<HocSinh>lisths;
	public DanhSachHS() {
		lisths = new ArrayList();
	}
	public void nhapDS() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hoc sinh: ");
		n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
		HocSinh a = new HocSinh();
		System.out.println("\nNhap thong tin hoc sinh thu "+i);
		a.nhap();
		lisths.add(a);
		}
	}
	public void xuatDS() {
		System.out.println("\nDanh sach hoc sinh: ");
		for (HocSinh a : lisths) {
			a.xuat();
		}
	}
	public void sapXep() {
		Collections.sort(lisths,new ComparatorLop());
		System.out.println("\nDanh sach hoc sinh sau khi sap xep la: ");
		xuatDS();
	}
}
