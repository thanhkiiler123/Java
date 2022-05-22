package bai15;
import java.util.*;
import java.io.*;
public class HocSinh extends Nguoi implements IHoatDong, Serializable{
	protected String tenlop;
	public HocSinh() {
	}
	public HocSinh(String hoten,int ns,boolean gt,String tenlop) {
		super();
		this.tenlop=tenlop;
	}
	public void setTenLop(String tenlop) {
		this.tenlop=tenlop;
	}
	public String getTenLop() {
		return tenlop;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten lop: ");
		tenlop=sc.nextLine();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.print("Ten lop: "+tenlop+"\n");
	}
	public String toString() {
		return super.toString()+"Ten lop: "+tenlop+".";
	}
	@Override
	public String gioiThieu() {
		System.out.print("Gioi thieu ve hoc sinh: ");
		xuat();
		return null;
	}
}
