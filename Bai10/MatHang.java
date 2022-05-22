package bai10;
import java.util.*;
public class MatHang {
	protected String tenHang;
	protected int maHang;
	protected String nuocSX;
	public MatHang() {
	}
	public MatHang(String tenHang, int maHang, String nuocSX) {
		this.tenHang=tenHang;
		this.maHang=maHang;
		this.nuocSX=nuocSX;
	}
	public void setTenHang(String tenHang) {
		this.tenHang=tenHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setMaHang(int maHang) {
		this.maHang=maHang;
	}
	public int getMaHang() {
		return maHang;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX=nuocSX;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten mat hang: ");
		tenHang=sc.nextLine();
		System.out.print("Nhap ma mat hang: ");
		maHang=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nuoc san xuat cua mat hang: ");
		nuocSX=sc.nextLine();
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s",tenHang,maHang,nuocSX);
	}
	public String toString() {
		return "MatHang(ten: "+tenHang+",ma: "+maHang+",nuoc san xuat: "+nuocSX+")";
	}
}		