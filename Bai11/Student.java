package bai11;
import java.util.*;
public class Student extends Person {
	protected float diem1,diem2;
	public Student() {
	}
	public Student(String hoTen,String diaChi,float diem1,float diem2) {
		super();
		this.diem1=diem1;
		this.diem2=diem2;
	}
	public void setDiem1(float diem1) {
		this.diem1=diem1;
	}
	public float getDiem1() {
		return diem1;
	}
	public void setDiem2(float diem2) {
		this.diem2=diem2;
	}
	public float getDiem2() {
		return diem2;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap diem mon thu nhat: ");
		diem1=Float.parseFloat(sc.nextLine());
		System.out.print("Nhap diem mon thu hai: ");
		diem2=Float.parseFloat(sc.nextLine());
	}
	public float tinhDTB() {
		return ((diem1+diem2)/2);
	}
	public void xuat() {
		super.xuat();
		System.out.printf("\nDiem mon 1: "+diem1);
		System.out.printf("\nDiem mon 2: "+diem2);
		System.out.printf("\nDiem trung binh: "+tinhDTB()+"\n");
	}
	public String toString() {
		return super.toString() + "\nDiem mon 1"+diem1+", diem mon 2"+diem2+", diem trung binh: "+tinhDTB()+".";
	}
}
