package bai13;
import static java.lang.System.exit;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		DSCanBo ds = new DSCanBo();
		Scanner sc = new Scanner(System.in);
		int m;
		do {
			System.out.println("-------MENU-------");
			System.out.println("1. Nhap danh sach ");
			System.out.println("2. In danh sach ");
			System.out.println("3. Tinh tien luong cua can bo ");
			System.out.println("4. Thoat");
			System.out.print("Moi ban chon: ");
			m=sc.nextInt();
			switch (m) {
			case 1: ds.nhapDS();break;
			case 2: ds.xuatDS();break;
			case 3: ds.tinhLuong();break;
			case 4: exit(1);
			}
		}while (m!=0);
	}
}
