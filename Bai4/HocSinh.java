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
		mahs=sc.nextLine();
		System.out.print("ho ten:");
		hoten=sc.nextLine();
		System.out.print("lop:");
		lop=sc.nextLine();
		System.out.print("so buoi an:");
		soba=sc.nextInt();
	}
	public void xuat()
	{
		System.out.printf("\n%-20s%-20s%-20s%-20s",mahs,hoten,lop,soba);
	}
	
	public String toString() {
		return "HocSinh [mahs=" + mahs + ", hoten=" + hoten + ", lop=" + lop + ", soba=" + soba + "]";
	}
	public int tienbantru()
	{
		return soba*30000;
	}
}