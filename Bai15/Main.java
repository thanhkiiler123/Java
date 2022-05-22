package bai15;
import java.util.*;
import java.io.*;
import static java.lang.System.exit;
public class Main {
	 public static void main(String args[]) throws FileNotFoundException,IOException, ClassNotFoundException {
		 DSHocSinh ds = new DSHocSinh();
		 int n;
		 Scanner sc = new Scanner(System.in);
		 do {
			 System.out.println("------MENU------");
			 System.out.println("1. Nhap danh sach hoc sinh ");
			 System.out.println("2. In danh sach hoc sinh ");
			 System.out.println("3. In danh sach hoc sinh theo nam sinh ");
			 System.out.println("4. Luu danh sach hoc sinh vao file ");
			 System.out.println("5. Hien danh sach hoc sinh tu file");
			 System.out.println("6. Thoat ");
			 System.out.print(" Moi ban chon so: ");
			 n = sc.nextInt();
			 switch (n) {
			 case 1: ds.nhapDS();break;
			 case 2: ds.xuatDS();break;
			 case 3: ds.namSinhX();break;
			 case 4: ds.luuFile();break;
			 case 5: ds.docFile();break;
			 case 6: exit(1);
			 }
		 }while (n!=0);
	 }
}