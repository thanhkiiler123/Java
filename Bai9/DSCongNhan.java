package bai9;
import java.util.*;
public class DSCongNhan {
	ArrayList<CongNhan>listcn;
	public DSCongNhan() {
		listcn=new ArrayList();
	}
	public void nhap() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong cong nhan: ");
		n=sc.nextInt();
		if(0<n&&n<20) {
			for (int i=0;i<n;i++) {
				CongNhan a = new CongNhan();
				System.out.print("Nhap thong tin cong nhan thu "+i+"\n");
				a.nhap();
				listcn.add(a);
			}
		}
		else {
			System.out.print("So luong cong nhan khong duoc vuot qua 20. Xin moi nhap lai.");
		}
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s\n","He so luong","Ho ten","Luong khong phu cap","Luong co phu cap");
		for (CongNhan a:listcn) {
			a.xuat();
		}
	}
	public void tinhTongLuongT() {
		float s=0;
		for (CongNhan a: listcn) {
			s=s+a.luongT();
		}
		System.out.println("Tong luong T cua cac cong nhan la: "+s);
	}
	public void tinhTongLuongS() {
		float t=0;
		for (CongNhan a: listcn) {
			t=t+a.luongS();
		}
		System.out.println("Tong luong S cua cac cong nhan la: "+t);
	}
	public void sapXep() {
		Collections.sort(listcn,new LuongSComparator());
		System.out.println("Danh sach cong nhan da sap xep: ");
		xuat();
	}
}