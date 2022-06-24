package bai11;
import java.util.*;
public class Person {
	protected String hoTen;
	protected String diaChi;
	public Person() {
	}
	public Person(String hoTen, String diaChi) {
		this.hoTen=hoTen;
		this.diaChi=diaChi;
	}
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi=diaChi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		setHoTen(sc.nextLine());
		System.out.print("Nhap dia chi: ");
		setDiaChi(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("%-20s%-20s\n","Ho Ten","Dia Chi");
		System.out.printf("%-20s%-20s",getHoTen(),getDiaChi());
	}
	public String toString() {
		return "Person(Hoten: "+getHoTen()+", Diachi: "+getDiaChi()+",";
	}
}
