package bai6;
import java.util.*;
public class DSCongNhan {
	ArrayList<CongNhan>listcn;
	public DSCongNhan(){
		listcn = new ArrayList<>();
	}
	public void nhap() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong cong nhan: ");
		n=sc.nextInt();
		if (0<n&&n<20) {
			for (int i=0;i<n;i++) {
				CongNhan a = new CongNhan();
				System.out.print("Nhap thong tin cong nhan thu: "+(i+1));
				a.nhap();
				listcn.add(a);
				}
		}
		else 
			System.out.print("So luong cong nhan khong vuot qua 20. Xin moi nhap lai: ");
	}
	public void xuat() {
		System.out.println("Danh sach cong nhan la: ");
		System.out.printf("%-20s%-20s%-20s","HSLuong","HoTen","Luong");
		for (CongNhan a: listcn) {
			a.xuat();
		}
	}
	public void nhapS() {
		float s;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so thuc S: ");
		s=sc.nextFloat();
		System.out.println("Danh sach cong nhan co luong > S la: ");
		System.out.printf("%-20s%-20s%-20s","HSLuong","HoTen","Luong");
		for (CongNhan a: listcn) {
			if (a.getLuong()>s) {
				a.xuat();
			}
		}
	}
}
