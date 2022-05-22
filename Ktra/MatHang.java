package baiktra;
import java.util.*;
import java.io.*;
public class MatHang implements Serializable{
	protected String mahang,tenhang,nhomhang;
	protected double giaban;
	public MatHang() {
	}
	public MatHang(String mahang,String tenhang,String nhomhang, double giaban) {
		this.mahang=mahang;
		this.tenhang=tenhang;
		this.nhomhang=nhomhang;
		this.giaban=giaban;
	}
	public void setMaHang(String mahang) {
		this.mahang=mahang;
	}
	public String getMaHang() {
		return mahang;
	}
	public void setTenHang(String tenhang) {
		this.tenhang=tenhang;
	}
	public String getTenHang() {
		return tenhang;
	}
	public void setNhomHang(String nhomhang) {
		this.nhomhang=nhomhang;
	}
	public String getNhomHang() {
		return nhomhang;
	}
	public void setGiaBan(double giaban) {
		this.giaban=giaban;
	}
	public double getGiaBan() {
		return giaban;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		mahang = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		tenhang=sc.nextLine();
		System.out.print("Nhap nhom hang: ");
		nhomhang=sc.nextLine();
		System.out.print("Nhap gia ban: ");
		giaban=sc.nextDouble();
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s",mahang,tenhang,giaban);
	}
	@Override
	public String toString() {
		return "Mat Hang(Ma hang: "+mahang+", Ten hang: "+tenhang+", Nhom hang: "+nhomhang+", Gia ban: "+giaban+".";
	}
}
