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
		khoa = sc.nextLine();
		System.out.print("Nhap ten phong ban: ");
		phongban=sc.nextLine();
		System.out.print("Nhap he so phu cap: ");
		hspc = sc.nextDouble();
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Ho Ten","Tuoi","He So Luong","Phong ban","Khoa");
		super.xuat();
		System.out.printf("%-20s%-20s\n",phongban,khoa);
	}
	public String toString() {
		return super.toString()+"Phong ban: "+phongban+", khoa: "+khoa+", he so phu cap: "+hspc+".";
	}
	@Override
	public double tinhLuong() {
		luong = (hsl+hspc)*1350000;
		System.out.printf("Luong cua quan ly la: "+luong+"\n");
		return 0;
	}
}
