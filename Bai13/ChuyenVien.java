package bai13;
import java.util.*;
public class ChuyenVien extends CanBo implements iCanBo {
	protected String phong;
	public ChuyenVien() {
	}

	public ChuyenVien(String hoten, int tuoi, double hsl, double luong, String phong) {
		super(hoten, tuoi, hsl, luong);
		this.phong = phong;
	}

	public void setPhong(String phong) {
		this.phong=phong;
	}
	public String getPhong() {
		return phong;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phong: ");
		setPhong(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s\n","Ho Ten","Tuoi","He So Luong","Phong");
		super.xuat();
		System.out.printf("%-20s\n",getPhong());
	}
	public String toString() {
		return super.toString()+"Phong: "+getPhong()+".";
	}
	@Override
	public double tinhLuong() {
		luong = hsl*1350000;
		System.out.print("Luong cua Chuyen vien la: "+luong+"\n");
		return 0;
	}
}
