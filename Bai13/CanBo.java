package bai13;
import java.util.*;
public abstract class CanBo{
	protected String hoten;
	protected int tuoi;
	protected double hsl,luong;
	public CanBo() {
	}

	public CanBo(String hoten, int tuoi, double hsl, double luong) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.hsl = hsl;
		this.luong = luong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		setHoten(sc.nextLine());
		System.out.print("Nhap tuoi: ");
		setTuoi(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap he so luong: ");
		setHsl(Double.parseDouble(sc.nextLine()));
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s",getHoten(),getTuoi(),getHsl());
	}
	public String toString() {
		return "Ho ten: "+getHoten()+", tuoi: "+getTuoi()+",he so luong: "+getHsl()+".";
	}
}