package bai7;
import java.util.*;
public class DSDoanThang {
	ArrayList<DoanThang>listdt;
		public DSDoanThang(){
			listdt =new ArrayList();
		}
	void nhap()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong doan thang: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			DoanThang x=new DoanThang();
			System.out.print("\nNhap thong tin doan thang thu " +i+ "\n");
			x.nhapDoanThang();
			listdt.add(x);
		}
	}
	void xuat()
	{
		for(DoanThang x : listdt)
		{
		x.xuatDoanThang();
		}	
	}
	public void tinhTongChieuDai() {
		float s=0;
		for(DoanThang x :listdt)
		{
			s=s+x.chieuDai();
		}
		System.out.println("\nTong chieu dai la :"+s);
	}
	public void tinhMax() {
		float m=0;
		for(DoanThang x: listdt) {
			if(m<x.chieuDai())
				m=x.chieuDai();
		}
		System.out.print("Doan Thang dai nhat la: "+m);
		System.out.print("\nThong tin doan thang dai nhat la: ");
		for (DoanThang x:listdt) {
			if(x.chieuDai()==m) {
				x.xuatDoanThang();
			}
		}
	}
}