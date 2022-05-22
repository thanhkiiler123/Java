package baiktra;
import java.util.*;
import java.io.*;
public class KhachHang implements Serializable{
	protected int sdt;
	protected String hoten,dc,makh;
	public KhachHang() {
	}
	public KhachHang(String makh,int sdt,String hoten, String dc) {
		this.makh=makh;
		this.sdt=sdt;
		this.hoten=hoten;
		this.dc=dc;
	}
	public void setMakh(String makh) {
		this.makh=makh;
	}
	public String getMakh() {
		return makh;
	}
	public void setSDT(int sdt) {
		this.sdt=sdt;
	}
	public int getSDT() {
		return sdt;
	}
	public void setHoTen(String hoten) {
		this.hoten=hoten;
	}
	public String getHoTens() {
		return hoten;
	}
	public void setDc(String dc) {
		this.dc=dc;
	}
	public String getDc() {
		return dc;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma khach hang: ");
		makh = sc.nextLine();
		System.out.print("Nhap so dien thoai khach hang: ");
		sdt=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap ho ten khach hang: ");
		hoten = sc.nextLine();
		System.out.print("Nhap dia chi khach hang: ");
		dc=sc.nextLine();
	}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s%-20s",makh,sdt,hoten,dc);
	}
	public String toString() {
		return "Khach Hang(Ma khach hang: "+makh+", So dien thoai: "+sdt+", Ho ten: "+hoten+", Dia chi: "+dc+".";
	}
}
