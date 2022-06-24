package bai12;
import java.util.*;
public class HocSinh extends Nguoi{
	private String lop;
	public HocSinh() {
	}
	public HocSinh(String ht, String gt, String lop) {
		super();
		this.lop=lop;
	}
	public void setLop(String lop) {
		this.lop=lop;
	}
	public String getLop() {
		return lop;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap lop: ");
		setLop(sc.nextLine());
	}
	public void xuat() {
		super.xuat();
		System.out.printf("\nLop: "+getLop()+"\n");
	}
	public String toString() {
		return super.toString() +"Lop: "+getLop()+".";
	}
}
