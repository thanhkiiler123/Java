package bai10;

public class ApDung {
	public static void main (String args[]) {
		DSTuLanh ds = new DSTuLanh();
		ds.nhap();
		System.out.println("\nDanh sach tu lanh: ");
		ds.xuat();
		ds.DSTuLanhHangSX();
		ds.tongTien();
		ds.tuLanh200lit();
		ds.sapXepSoLuongGiamDan();
	}

}
