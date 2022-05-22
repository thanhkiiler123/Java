package bai11;
import java.util.*;
public class DanhSach {
	ArrayList<Person>listps;
	public DanhSach() {
		listps = new ArrayList();
	}
	public void addPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Doi tuong can them la: (1-Student; 2-Employee; 3-Customer): ");
		int loai = sc.nextInt();
			if (loai==1) {
				Student a = new Student();
				a.nhap();
				listps.add(a);
			}
			if (loai==2) {
				Employee b = new Employee();
				b.nhap();
				listps.add(b);
			}
			if (loai==3) {
				Customer c = new Customer();
				c.nhap();
				listps.add(c);
			}
		}
	public void removePerson(String hoTen) {
		for (Person p:listps) {
			if (p.getHoTen().equalsIgnoreCase(hoTen)) {
				listps.remove(p);
				break;
			}
		}
	}
	public void xuatDS() {
		System.out.println("Danh sach doi tuong: ");
		for(Person p:listps) {
			p.xuat();
		}
	}
	public void sapXep() {
		Collections.sort(listps, new ComparatorHoTen());
		System.out.println("\nDanh sach da sap xep: ");
		xuatDS();
	}
	public void tinhTongLuong() {
		float s=0;
		System.out.print("\nTong luong cua nhan vien la: ");
		for(Person p:listps) {
			if (p instanceof Employee) {
			s=s+((Employee) p).tinhLuong();
			}
		}
	}
}
