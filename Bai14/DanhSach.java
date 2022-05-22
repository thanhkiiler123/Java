package bai14;
import java.util.*;
public class DanhSach {
	ArrayList<Xe>listx;
	public DanhSach() {
		listx = new ArrayList();
	}
	public void nhapDS() {
		int loai;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap loai xe can quan ly (1-Xe dap,2-Xe may,3-Xe khach,4-Xe tai): ");
		loai = sc.nextInt();
		if (loai==1) {
			XeDap a = new XeDap();
			System.out.print("Nhap thong tin xe dap: ");
			a.nhap();
			listx.add(a);
		}
		if (loai==2) {
			XeMay b = new XeMay();
			System.out.print("Nhap thong tin xe may: ");
			b.nhap();
			listx.add(b);
		}
		if(loai==3) {
			XeKhach c = new XeKhach();
			System.out.print("Nhap thong tin xe khach: ");
			c.nhap();
			listx.add(c);
		}
		if(loai==4) {
			XeTai d = new XeTai();
			System.out.print("Nhap thong tin xe tai: ");
			d.nhap();
			listx.add(d);
		}
	}
	public void xuatDS() {
		for(Xe x:listx) {
			x.xuat();
		}
	}
	public void tinhThue() {
		for (Xe x:listx) {
			if (x instanceof XeDap) {
				((XeDap) x).tinhThue();
			}
			if(x instanceof XeMay) {
				((XeMay) x).tinhThue();
			}
			if(x instanceof XeKhach) {
				((XeKhach) x).tinhThue();
			}
			if(x instanceof XeTai) {
				((XeTai) x).tinhThue();
			}
		}
	}
}
