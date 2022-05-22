package bai14;
public class XeDap extends Xe implements iXe {
	public XeDap() {
	}
	public XeDap(String tenxe, String hangsx, int namsx, int gia) {
		super();
	}
	public void nhap() {
		super.nhap();
	}
	public void xuat() {
		super.xuat();
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public double tinhThue() {
		System.out.print("Xe dap khong can dong thue\n");
		return 0;
	}
}
