package bai14;
import java.util.*;
public abstract class Xe {
	protected String tenxe,hangsx;
	protected int namsx,gia;
	public Xe() {
	}
	public Xe(String tenxe,String hangsx,int namsx,int gia) {
		this.tenxe=tenxe;
		this.hangsx=hangsx;
		this.namsx=namsx;
		this.gia=gia;
	}
	public void setTenXe(String tenxe) {
		this.tenxe=tenxe;
	}
	public String getTenXe() {
		return tenxe;
	}
	public void setHangSX(String hangsx) {
		this.hangsx=hangsx;
	}
	public String getHangSX() {
		return hangsx;
	}
	public void setNamSX(int namsx) {
		this.namsx=namsx;
	}
	public int getNamSX() {
		return namsx;
	}
	public void setGia(int gia) {
		this.gia=gia;
	}
	public int getGia() {
		return gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten xe: ");
		setTenXe(sc.nextLine());
		System.out.print("Nhap hang san xuat: ");
		setHangSX(sc.nextLine());
		System.out.print("Nhap nam san xuat: ");
		setNamSX(sc.nextInt());
		System.out.print("Nhap gia xe: ");
		setGia(sc.nextInt());
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s\n","Ten xe","Hang san xuat","Nam san xuat","Gia xe");
		System.out.printf("%-20s%-20s%-20s%-20s\n",getTenXe(),getHangSX(),getNamSX(),getGia());
	}
	public String toString() {
		return "Xe(Ten: "+getTenXe()+", Hang san xuat: "+getHangSX()+", Nam san xuat: "+getNamSX()+", Gia: "+getGia()+",";
	}
}
