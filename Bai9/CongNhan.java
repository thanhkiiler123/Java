package bai9;
import java.util.*;
public class CongNhan {
	private static float lcb = 1150;
	private float hsl,pc,luongt,luongs;
	private String hoten;
	public CongNhan() {
	}
	public CongNhan(float hsl,String hoten,float pc,float luongt, float luongs) {
	this.hsl=hsl;
	this.hoten=hoten;
	this.pc=pc;
	this.luongs=luongs;
	this.luongt=luongt;
	}
	public void setHsl(float hsl) {
		this.hsl=hsl;
	}
	public float getHsl() {
		return hsl;
	}
	public void setHoTen(String hoten) {
		this.hoten=hoten;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setLuongT(float luongt) {
		this.luongt=luongt;
	}
	public float getLuongT() {
		return luongt;
	}
	public void setLuongS(float luongs) {
		this.luongs=luongs;
	}
	public float getLuongS() {
		return luongs;
	}
	public void setPc(float pc) {
		this.pc=pc;
	}
	public float getPc() {
		return pc;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap He so luong: ");
		hsl=sc.nextFloat();
		sc.nextLine();
		System.out.print("Nhap Ho ten: ");
		hoten=sc.nextLine();
		System.out.print("Nhap muc phu cap: ");
		pc=sc.nextFloat();
	}
	public float luongT() {
		return luongt=lcb*hsl;
	}
	public float luongS() {
		return luongs=hsl*lcb*(1+pc);
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s\n",hsl,hoten,luongT(),luongS());
	}
	public String toString() {
		return "CongNhan(Ho ten: "+hoten+", He so luong: "+hsl+", LuongT: "+luongT()+", LuongS: "+luongS()+")\n";
	}
	
}