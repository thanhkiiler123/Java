package bai11;
import java.util.*;
public class Employee extends Person{
	protected float heSoLuong;
	public Employee() {
	}
	public Employee(String hoTen, String diaChi,float heSoLuong) {
		super();
		this.heSoLuong=heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong=heSoLuong;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap he so luong: ");
		setHeSoLuong(Float.parseFloat(sc.nextLine()));
	}
	public float tinhLuong() {
		return heSoLuong*1500000;
	}
	public void xuat() {
		super.xuat();
		System.out.printf("\nHe So Luong: " + getHeSoLuong()+"\n");
		System.out.printf("Tong luong: "+tinhLuong()+"\n");
	}
	public String toString() {
		return "He so luong: "+heSoLuong+", tong luong: "+tinhLuong()+".";
	}
}
