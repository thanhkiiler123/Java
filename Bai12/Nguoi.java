package bai12;
import java.util.*;
public class Nguoi {
	private String ht,gt;
	public void ngUoi() {	
	}
	public void ngUoi(String ht,String gt) {
		this.ht=ht;
		this.gt=gt;
	}
	public void setHoTen(String ht) {
		this.ht=ht;
	}
	public String getHoTen() {
		return ht;
	}
	public void setGt(String gt) {
		this.gt=gt;
	}
	public String getGt() {
		return gt;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		ht=sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gt=sc.nextLine();
	}
	public void xuat() {
		System.out.printf("Ho ten: "+ht);
		System.out.printf("\nGioi tinh: "+gt);
	}
	public String toString() {
		return "Ho ten: "+ht+", gioi tinh: "+gt+".";
	}
}
