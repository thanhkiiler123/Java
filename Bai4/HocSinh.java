package bai4;

import java.util.Scanner;

public class HocSinh {
	private String mahs;
	private String hoten;
	private String lop;
	private int soba;
	
	public HocSinh() {
	
	}
		
	public HocSinh(String mahs, String hoten, String lop, int soba) {
		this.mahs = mahs;
		this.hoten = hoten;
		this.lop = lop;
		this.soba = soba;
	}

	public void setMahs(String mahs) {
		this.mahs = mahs;
	}
	public String getMahs() {
		return mahs;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getHoten() {
		return hoten;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getLop() {
		return lop;
	}
	public void setSoba(int soba) {
		this.soba = soba;
	}
	public int getSoba() {
		return soba;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ma hoc sinh:");
		setMahs(sc.nextLine());
		System.out.print("ho ten:");
		setHoten(sc.nextLine());
		System.out.print("lop:");
		setLop(sc.nextLine());
		System.out.print("so buoi an:");
		setSoba(sc.nextInt());
	}
	public void xuat()
	{
		System.out.printf("\n%-20s%-20s%-20s%-20s",getMahs(),getHoten(),getLop(),getSoba());
	}
	
	public String toString() {
		return "HocSinh [mahs=" + getMahs() + ", hoten=" + getHoten() + ", lop=" +getLop() + ", soba=" + getSoba() + "]";
	}
	public int tienbantru()
	{
		return soba*30000;
	}
}