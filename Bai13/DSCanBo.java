package bai13;
import java.util.*;
public class DSCanBo {
	ArrayList<CanBo>listcb;
	public DSCanBo() {
		listcb = new ArrayList();
	}
	public void nhapDS() {
		int n, loai;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap doi tuong can bo: (1-Chuyen Vien, 2-Giang Vien, 3-Quan Ly)");
		loai = sc.nextInt();
		if (loai==1) {
			System.out.print("Nhap so chuyen vien: ");
			n = sc.nextInt();
			for (int i=0;i<n;i++) {
				ChuyenVien a = new ChuyenVien();
				System.out.println("Nhap thong tin chuyen vien thu "+i);
				a.nhap();
				listcb.add(a);
			}
		}
		if(loai==2) {
			System.out.print("Nhap so giang vien: ");
			n=sc.nextInt();
			for(int i=0;i<n;i++) {
				GiangVien b = new GiangVien();
				System.out.println("Nhap thong tin giang vien thu "+i);
				b.nhap();
				listcb.add(b);
			}
		}
		if(loai==3) {
			System.out.print("Nhap so quan ly: ");
			n=sc.nextInt();
			
			for(int i=0;i<n;i++) {
				QuanLy c = new QuanLy();
				System.out.println("Nhap thong tin quan ly thu "+i);
				c.nhap();
				listcb.add(c);
			}
		}	
	}
	public void xuatDS() {
		System.out.println("Danh sach can bo vua nhap la: ");
		for (CanBo d:listcb) {
			d.xuat();
		}
	}
	public void tinhLuong() {
		for(CanBo d:listcb) {
			if (d instanceof ChuyenVien) {
				((ChuyenVien) d).tinhLuong();
			}
			if (d instanceof GiangVien) {
				((GiangVien) d).tinhLuong();
			}
			if (d instanceof QuanLy) {
				((QuanLy) d).tinhLuong();
			}
		}
	}
}
