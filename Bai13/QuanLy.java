package bai13;
import java.util.*;
public class QuanLy extends CanBo implements iCanBo {
	protected String khoa,phongban;
	protected double hspc;
	public QuanLy() {
	}
	public QuanLy(String hoten, int tuoi, double hsl, double luong, double hspc, String khoa, String phongban) {
		super();
		this.khoa=khoa;
		this.phongban=phongban;
		this.hspc=hspc;
	}
	public void setKhoa(String khoa) {
		this.khoa=khoa;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setPhongBan(String phongban) {
		this.phongban=phongban;
	}
	public String getPhongBan() {
		return phongban;
	}
	public void setHspc(double hspc) {
		this.hspc=hspc;
	}
	public double getHspc() {
		return hspc;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten khoa: ");
		setKhoa(sc.nextLine());
		System.out.print("Nhap ten phong ban: ");
		setPhongBan(sc.nextLine());
		System.out.print("Nhap he so phu cap: ");
		setHspc(Double.parseDouble(sc.nextLine()));
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Ho Ten","Tuoi","He So Luong","Phong ban","Khoa");
		super.xuat();
		System.out.printf("%-20s%-20s\n",getPhongBan(),getKhoa());
	}
	public String toString() {
		return super.toString()+"Phong ban: "+getPhongBan()+", khoa: "+getKhoa()+", he so phu cap: "+getHspc()+".";
	}
	@Override
	public double tinhLuong() {
		luong = (hsl+hspc)*1350000;
		System.out.printf("Luong cua quan ly la: "+luong+"\n");
		return 0;
	}
}
