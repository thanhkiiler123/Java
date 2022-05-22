package bai13;
import java.util.*;
public class GiangVien extends CanBo implements iCanBo {
	protected double pc;
	protected String khoa;
	public GiangVien() {
	}
	public GiangVien(String hoten, int tuoi, double hsl, double luong,double pc,String khoa) {
		super();
		this.pc=pc;
		this.khoa=khoa;
	}
	public void setPC(double pc) {
		this.pc=pc;
	}
	public double getPC() {
		return pc;
	}
	public void setKhoa(String khoa) {
		this.khoa=khoa;
	}
	public String getKhoa() {
		return khoa;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap muc phu cap: ");
		pc = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap ten khoa: ");
		khoa = sc.nextLine();
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Ho Ten","Tuoi","He So Luong","Phu cap","Khoa");
		super.xuat();
		System.out.printf("%-20s%-20s\n",pc,khoa);
	}
	public String toString() {
		return super.toString()+"Khoa: "+khoa+", phu cap: "+pc+".";
	}
	@Override
	public double tinhLuong() {
		luong = hsl*135000;
		pc = (luong*20)/100;
		luong = (hsl*135000)+pc;
		System.out.print("Luong cua giang vien la: "+luong+"\n");
		return 0;
	}
}
