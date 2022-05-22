package bai9;

public class ApDung {
public static void main(String args[]) {
	DSCongNhan ds = new DSCongNhan();
	ds.nhap();
	System.out.println("Danh sach cong nhan: ");
	ds.xuat();
	ds.tinhTongLuongS();
	ds.tinhTongLuongT();
	ds.sapXep();
}
}
