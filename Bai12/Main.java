package bai12;
import static java.lang.System.exit;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		DanhSachHS ds = new DanhSachHS();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.println("       -----MENU-----");
		System.out.println("1. Nhap danh sach hoc sinh: ");
		System.out.println("2. Hien danh sach hoc sinh: ");
		System.out.println("3. Sap xep danh sach hoc sinh theo lop: ");
		System.out.println("4. Thoat");
		System.out.print("Moi ban chon so: ");
		n=sc.nextInt();
		switch(n) {
		case 1: ds.nhapDS();break;
		case 2: ds.xuatDS();break;
		case 3: ds.sapXep();break;
		case 0: exit(1);
		}
	}while (n!=0);
	}
}
