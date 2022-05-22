package bai7;
public class DoanThang {
	Diem A; Diem B;
	float chieudai;
	public DoanThang() {
	}
	public DoanThang(Diem a, Diem b) {
		A=a;
		B=b;
	}
	public void nhapDoanThang() {
		System.out.println("Nhap Diem dau: ");
		A=new Diem();
		A.nhap();
		System.out.println("Nhap Diem cuoi: ");
		B=new Diem();
		B.nhap();
	}
	public void xuatDoanThang() {
		System.out.print("\nDoan Thang: ");
		A.xuat();B.xuat();
	}
	public float chieuDai() {
		return (float)Math.sqrt((Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2)));
	}
}
