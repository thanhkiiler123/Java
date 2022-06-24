package bai7;
public class DoanThang extends Diem {
	Diem A = new Diem();
	Diem B = new Diem();
	float chieudai;
	public DoanThang() {
	}
	public DoanThang(Diem a, Diem b) {
		A=a;
		B=b;
	}
	public void nhapDoanThang() {
		System.out.println("Nhap Diem dau: ");
		A.nhap();
		System.out.println("Nhap Diem cuoi: ");
		B.nhap();
	}
	public void xuatDoanThang() {
		System.out.print("\nDoan Thang: ");
		A.xuat();
		B.xuat();
	}
	public float chieuDai() {
		return chieudai = (float)Math.sqrt((Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2)));
	}
}
