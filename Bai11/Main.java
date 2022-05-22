package bai11;
import static java.lang.System.exit;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		DanhSach ds = new DanhSach();
		Scanner sc= new Scanner(System.in);
		int n;
		do {
			System.out.println("       -----MENU-----");
			System.out.println("1. Them doi tuong vao danh sach");
			System.out.println("2. In danh sach ");
			System.out.println("3. Xoa 1 nguoi khoi danh sach theo ten");
			System.out.println("4. Sap xep danh sach theo ten");
			System.out.println("5. Tinh tong luong cua nhan vien ");
			System.out.println("6. Thoat");
			System.out.print("Ban chon so: ");
			n=sc.nextInt();
			switch(n) {
			case 1: ds.addPerson();break;
			case 2: ds.xuatDS();break;
			case 3: sc.nextLine();
				System.out.print("Nhap ten muon xoa: ");
				String hoTen=sc.nextLine();
				ds.removePerson(hoTen);break;
			case 4: ds.sapXep();break;
			case 5: ds.tinhTongLuong();break;
			case 0: exit(1);
			}
		}while (n!=0);
	}
}
	
