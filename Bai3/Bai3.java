package bai3;
import java.util.*;
public class Bai3 {
	private int a,b,c;
	private double p,dt;
	public void tamGiac() {
	}
	public void tamGiac(int a, int b, int c,double p,double dt) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.p=p;
		this.dt=dt;
	}
	public void setA(int a) {
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return b;
	}
	public void setC(int c) {
		this.c=c;
	}
	public int getC() {
		return c;
	}
	public void setP(double p) {
		this.p=p;
	}
	public double getP() {
		return p;
	}
	public void setDt(double dt) {
		this.dt=dt;
	}
	public double getDt() {
		return dt;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai canh thu nhat cua tam giac: ");
		a=sc.nextInt();
		System.out.print("\nNhap do dai canh thu hai cua tam giac: ");
		b=sc.nextInt();
		System.out.print("\nNhap do dai canh thu ba cua tam giac: ");
		c=sc.nextInt();
	}
	public void dienTich() {
		if(a+b>c||a+c>b||b+c>a) {
			p=(a+b+c)/2.0;
			dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.printf("\nDien tich tam giac da nhap la: "+dt);
		}
		else if (a+b<=c||a+c<=b||b+c<=a)
			System.out.print("Nhap sai dien tich tam giac, moi nhap lai.");
	}
	public static void main (String[] args) {
		Bai3 x = new Bai3();
		x.nhap();
		x.dienTich();
	}
}
