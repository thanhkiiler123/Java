package bai15;
import java.util.*;
import java.io.*;
public abstract class Nguoi implements Serializable{
	protected String hoten;
	protected int ns;
	protected boolean gt;
	public Nguoi() {
	}
	public Nguoi(String hoten,int ns,boolean gt) {
		this.hoten=hoten;
		this.ns=ns;
		this.gt=gt;
	}
	public void setHoTen(String hoten) {
		this.hoten=hoten;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setNs(int ns) {
		this.ns=ns;
	}
	public int getNs() {
		return ns;
	}
	public void setGt(boolean gt) {
		this.gt=gt;
	}
	public boolean getGt() {
		return gt;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoten=sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		ns=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap gioi tinh: ");
		gt=sc.nextBoolean();
	}
	public void xuat() {
		System.out.print("Ho ten: "+hoten+"\n");
		System.out.print("Nam sinh: "+ns+"\n");
		System.out.print("Gioi tinh: ");
		if(gt==true) {
			System.out.print("Nam\n");
		}
		else {
			System.out.print("Nu\n");
		}
	}
	public String toString() {
		return "Nguoi: Ho ten: "+hoten+", Nam sinh: "+ns+", Gioi tinh: "+gt+",";
	}
}
