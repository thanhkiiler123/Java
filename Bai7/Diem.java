package bai7;
import java.util.Scanner;
public class Diem {
	private int x;
	private int y;
	public Diem(){
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Hoanh do cua diem la: ");
		setX(sc.nextInt());
		System.out.print("Tung do cua diem la: ");
		setY(sc.nextInt());
	}
	public void xuat() {
		System.out.printf("("+getX()+","+getY()+")");
	}
	public String toString() {
		return "Diem("+getX()+","+getY()+")";
	}
}

