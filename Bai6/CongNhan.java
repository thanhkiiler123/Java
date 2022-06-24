package bai6;
import java.util.Scanner;
public class CongNhan {
	private float hsl,luong;
	private String hoten;
	public CongNhan(){
	
	}
	public CongNhan(float hsl, String hoten, float luong) {
		this.hsl=hsl;
		this.hoten=hoten;
		this.luong=luong;
	}
	public void setHsl(float hsl) {
		this.hsl=hsl;
	}
	public float getHsl() {
		return hsl;
	}
	public void setHoten(String hoten) {
		this.hoten=hoten;
	}
	public String getHoten() {
		return hoten;
	}

	public float getLuong() {
		float lcb = 1150;
		return luong = lcb * hsl;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nHe so luong: ");
			setHsl(Float.parseFloat(sc.nextLine()));
		System.out.println("Ho ten: ");
			setHoten(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("\n%-20s%-20s%-20s",getHsl(),getHoten(),getLuong());
	}
}