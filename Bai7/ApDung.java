package bai7;

public class ApDung {
	public static void main(String args[]) {
		DSDoanThang ds = new DSDoanThang();
		ds.nhap();
		System.out.printf("Danh sach doan thang: ");
		ds.xuat();
		ds.tinhTongChieuDai();
		ds.tinhMax();
	}
}
