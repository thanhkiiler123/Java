package bai13;
import java.util.*;
public abstract class CanBo{
	protected String hoten,khoa;
	protected int tuoi;
	protected double hsl,luong;
	public CanBo() {
	}
	public CanBo(String hoten,int tuoi,double hsl,double luong) {
		this.hoten=hoten;
		this.tuoi=tuoi;
		this.hsl=hsl;
		this.luong=luong;
	}
	public void setHoTen(String hoten) {
		this.hoten=hoten;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi=tuoi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setHsl(double hsl) {
		this.hsl=hsl;
	}
	public double getHsl() {
		return hsl;
	}
	public void setLuong(double luong) {
		this.luong=luong;
	}
	public double getLuong() {
		return luong;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap he so luong: ");
		hsl = Double.parseDouble(sc.nextLine());	
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s",hoten,tuoi,hsl);
	}
	public String toString() {
		return "Ho ten: "+hoten+", tuoi: "+tuoi+",he so luong: "+hsl+".";
	}
}