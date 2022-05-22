package bai8;
import java.util.*;
public class TaiKhoan {
	private static double laisuat=0.05;
	private double tien,tiennap,tienrut,tien1,tien2,tien3;
	private int sotk;
	private String hoten;
	public TaiKhoan() {
	}
	public TaiKhoan(int sotk, String hoten, double tien,double tiennap,double tienrut,double tien1,double tien2,double tien3) {
		this.sotk=sotk;
		this.hoten=hoten;
		this.tien=tien;
		this.tiennap=tiennap;
		this.tienrut=tienrut;
		this.tien1=tien1;
		this.tien2=tien2;
		this.tien3=tien3;
	}
	public void setSoTK(int sotk) {
		this.sotk=sotk;
	}
	public int getSoTK() {
		return sotk;
	}
	public void setHoTen(String hoten) {
		this.hoten=hoten;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setTien(double tien) {
		this.tien=tien;
	}
	public double getTien() {
		return tien;
	}
	public void setTienNap(double tiennap) {
		this.tiennap=tiennap;
	}
	public double getTienNap() {
		return tiennap;
	}
	public void setTienRut(double tienrut) {
		this.tienrut=tienrut;
	}
	public double getTienRut() {
		return tienrut;
	}
	public void setTien1(double tien1) {
		this.tien1=tien1;
	}
	public double getTien1() {
		return tien1;
	}
	public void setTien2(double tien2) {
		this.tien2=tien2;
	}
	public double getTien2() {
		return tien2;
	}
	public void setTien3(double tien3) {
		this.tien3=tien3;
	}
	public double getTien3() {
		return tien3;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tai khoan: ");
		sotk=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap ho ten: ");
		hoten=sc.nextLine();	
		System.out.print("Nhap so tien trong tai khoan: ");
		tien=sc.nextInt();
		}
	public void xuat() {
		System.out.printf("%-20s%-20s%-20s\n","SoTK","HoTen","SoTien");
		System.out.printf("%-20s%-20s%-20s\n",sotk,hoten,tien);
	}
	public String toString() {
		return "TaiKhoan[SoTK: "+sotk+", HoTen: "+hoten+", So tien trong tai khoan: "+tien+"]";
	}
	public void guiTienTK() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien nap vao tai khoan: ");
		tiennap=sc.nextDouble();
		if (tiennap>0) {
			System.out.print("\nSo tien trong tai khoan sau khi nap la: ");
			tien1=tien+tiennap;
			System.out.println(+tien1);
		}
		else {
			System.out.println("Thao tac khong hop le. Xin moi nhap lai");
		}
	}
	public void rutTienTK() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien rut: ");
		tienrut=sc.nextDouble();
		if (tienrut>tien1) {
			System.out.println("Thao tac khong hop le. Xin moi nhap lai");
		}
		else {
			System.out.print("So tien con lai trong tai khoan la: ");
			tien2=tien1-tienrut;
			System.out.println(+tien2);
		}
	}
	public void daoHanTK() {
		System.out.print("So tien trong tai khoan sau khi dao han la: ");
		tien3=tien2+(tien2*laisuat);
		System.out.println(+tien3);
	}
}
