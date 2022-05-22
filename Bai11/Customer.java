package bai11;
import java.util.*;
public class Customer extends Person{
	private String tencty;
	private float tghd;
	public Customer() {
	}
	public Customer(String hoTen, String diaChi, String tencty, float tghd) {
		super();
		this.tencty=tencty;
		this.tghd=tghd;
	}
	public void setTencty(String tencty) {
		this.tencty=tencty;
	}
	public String getTencty() {
		return tencty;
	}
	public void setTghd(float tghd) {
		this.tghd=tghd;
	}
	public float getTghd() {
		return tghd;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ten cong ty: ");
		tencty=sc.nextLine();
		System.out.print("Nhap tri gia hoa don: ");
		tghd=sc.nextFloat();
	}
	public void xuat() {
		super.xuat();
		System.out.println("\nTen cong ty: "+tencty);
		System.out.println("Gia tri hoa don: "+tghd);
	}
	public String toString() {
		return "Ten cong ty: "+tencty+", gia tri hoa don: "+tghd+".";
	}
}
