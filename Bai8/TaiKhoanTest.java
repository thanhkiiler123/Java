package bai8;
import static java.lang.System.exit;
import java.util.*;
public class TaiKhoanTest {
	public static void main(String args[]) {
		TaiKhoan tk = new TaiKhoan();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("     ------MENU------");
			System.out.print("\n1. Nhap thong tin tai khoan: ");
			System.out.print("\n2. Thong tin tai khoan: ");
			System.out.print("\n3. Nhap so tien muon gui: ");
			System.out.print("\n4. Nhap so tien muon rut: ");
			System.out.print("\n5. Tinh so tien dao han: ");
			System.out.print("\n6. Thoat.");
			System.out.print("\nBan chon so: ");
			n=sc.nextInt();
			switch (n) {
				case 1: tk.nhap();break;
				case 2: tk.xuat();break;
				case 3: tk.guiTienTK();break;
				case 4: tk.rutTienTK();break;
				case 5: tk.daoHanTK();break;
				case 6: exit(1);
				}
		}while (n!=0);
	}
}
