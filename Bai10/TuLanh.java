package bai10;
import java.util.*;
public class TuLanh extends  MatHang{
	 protected int dungTich,soLuong;
	 protected String mauSac,hangSX;
	 protected float donGia;
	 public TuLanh() { 
	 }
	 public TuLanh(String tenHang, int maHang, String nuocSX,int dungTich, int soLuong, String mauSac, String hangSX, float donGia) {
		 super(); 
		 this.dungTich=dungTich;
		 this.soLuong=soLuong;
		 this.mauSac=mauSac;
		 this.hangSX=hangSX;
		 this.donGia=donGia;
	 }
	 public void setDungTich(int dungTich) {
		 this.dungTich=dungTich;
	 }
	 public int getDungTich() {
		 return dungTich;
	 }
	 public void setSoLuong(int soLuong) {
		 this.soLuong=soLuong;
	 }
	 public int getSoLuong() {
		 return soLuong;
	 }
	 public void setMauSac(String mauSac) {
		 this.mauSac=mauSac;
	 }
	 public String getMauSac() {
		 return mauSac;
	 }
	 public void setHangSX(String hangSX) {
		 this.hangSX=hangSX;
	 }
	 public String getHangSX() {
		 return hangSX;
	 }
	 public void setDonGia(float donGia) {
		 this.donGia=donGia;
	 }
	 public float getDonGia() {
		 return donGia;
	 }
	 public void nhap() {
		 super.nhap();
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Dung tich tu lanh: ");
		 setDungTich(Integer.parseInt(sc.nextLine()));
		 System.out.print("Mau sac tu lanh: ");
		 setMauSac(sc.nextLine());
		 System.out.print("Hang san xuat: ");
		 setHangSX(sc.nextLine());
		 System.out.print("So luong: ");
		 setSoLuong(Integer.parseInt(sc.nextLine()));
		 System.out.print("Don gia: ");
		 setDonGia(sc.nextFloat());
		 }
	 public void xuat() {
		 super.xuat();
		 System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",getDungTich(),getMauSac(),getHangSX(),getSoLuong(),getDonGia());
	 }
	 public String toString() {
		 return "Tu Lanh("+super.toString()+"Dung tich: "+getDungTich()+", Mau sac: "+getMauSac()+", Hang san xuat: "+getHangSX()+", So luong: "+getSoLuong()+", Don gia: "+getDonGia()+")";
	 }
	 public double thanhTien() {
		 return soLuong*donGia;
	 }
}
