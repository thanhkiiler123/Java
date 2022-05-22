package bai10;
import java.util.*;
public class DSTuLanh {
	ArrayList<TuLanh>listtl;
	public DSTuLanh() {
		listtl = new ArrayList();
	}
	public void nhap() {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap so tu lanh trong danh sach: ");
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			TuLanh a = new TuLanh();
			System.out.println("Nhap thong tin tu lanh thu "+i);
			a.nhap();
			listtl.add(a);
		}
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ten Hang","Ma Hang","Nuoc San Xuat","Dung Tich","Mau Sac","Hang San Xuat","So Luong","Don Gia");
		for (TuLanh a : listtl) {
			a.xuat();
		}
	}
	public void DSTuLanhHangSX() {
		String b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hang san xuat: ");
		b=sc.nextLine();
		System.out.println("Danh sach tu lanh theo hang vua nhap la: ");
		for(TuLanh a : listtl) {
			if(a.getHangSX().equalsIgnoreCase(b)) {
				a.xuat();
			}
		}
	}
	public void tongTien() {
		double s=0;
		for(TuLanh a: listtl) {
			s=s+a.thanhTien();
		}
		System.out.printf("Tong tien cac tu lanh co trong danh sach: "+s);
	}
	public void tuLanh200lit() {
		System.out.println("\nDanh sach tu lanh co dung tich tren 200 lit: ");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ten Hang","Ma Hang","Nuoc San Xuat","Dung Tich","Mau Sac","Hang San Xuat","So Luong","Don Gia");
		for (TuLanh a: listtl) {
			if(a.getDungTich()>=200) {
				a.xuat();
			}
		}
	}
	public void sapXepSoLuongGiamDan() {
		Collections.sort(listtl, new SoLuongTuLanhComparator());
		System.out.println("Danh sach tu lanh da sap xep: ");
		xuat();
	}
	
}
					
