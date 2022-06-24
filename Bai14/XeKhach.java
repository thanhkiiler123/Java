package bai14;
import java.util.*;
public class XeKhach extends Xe implements iXe{
	protected double ttt,vat,ttb;
	protected int socho;
	public XeKhach() {
	}
	public XeKhach(String tenxe,String hangsx,int namsx,int gia,double ttt,double vat,double ttb,int socho) {
		super();
		this.ttt=ttt;
		this.vat=vat;
		this.ttb=ttb;
		this.socho=socho;
	}
	public void setTtt(double ttt) {
		this.ttt=ttt;
	}
	public double getTtt() {
		return ttt;
	}
	public void setVat(double vat) {
		this.vat=vat;
	}
	public double getVat() {
		return vat;
	}
	public void setTtb(double ttb) {
		this.ttb=ttb;
	}
	public double getTtb() {
		return ttb;
	}
	public void setSoCho(int socho) {
		this.socho=socho;
	}
	public int getSoCho() {
		return socho;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so cho: ");
		setSoCho(Integer.parseInt(sc.nextLine()));
	}
	public void xuat() {
		super.xuat();
		System.out.printf("So cho cua xe la: "+getSoCho()+"\n");
	}
	public String toString() {
		return super.toString()+"So cho: "+getSoCho()+".";
	}
	public double tinhThue() {
		vat=gia*10/100;
		ttb=gia*20/100;
		if (socho>=5) {
			ttt=gia*30/100;
			System.out.printf("\nThue tieu thu dac biet la: "+ttt);
		}
		else if (socho<5) {
			ttt=gia*50/100;
			System.out.printf("Thue tieu thu dac biet la: "+ttt);
		}
		System.out.printf("\nThue VAT la: "+vat);
		System.out.printf("\nThue truoc ba la: "+ttb+"\n");
		return 0;
	}
}
