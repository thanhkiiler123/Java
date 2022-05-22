package bai14;
import static java.lang.System.exit;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		int n;
		DanhSach ds = new DanhSach();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------MENU------");
			System.out.println("1. Nhap thong tin xe ");
			System.out.println("2. In thong tin xe ");
			System.out.println("3. Tinh thue cua xe ");
			System.out.println("4. Thoat");
			System.out.print("Moi ban chon so: ");
			n=sc.nextInt();
			switch(n) {
			case 1: ds.nhapDS();break;
			case 2: ds.xuatDS();break;
			case 3: ds.tinhThue();break;
			case 4: exit(1);
			}
		}while (n!=0);
	}
}
