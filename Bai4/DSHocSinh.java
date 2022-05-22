package bai4;
import java.util.*;
public class DSHocSinh {
	
	ArrayList<HocSinh>lisths;
	
	public DSHocSinh()
	{
		lisths =new ArrayList();
	}
	void nhap()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so luong hoc sinh");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			HocSinh a=new HocSinh();
			System.out.print("\nnhap thong tin hoc sinh thu " +i+ "\n");
			a.nhap();
			lisths.add(a);
		}
	}
	void xuat()
	{
		System.out.printf("\n%-20s%-20s%-20s%-20s","MA HOC SINH","TEN HOC SINH","LOP","SO BUOI AN");
		for(HocSinh a : lisths)
		{
		a.xuat();
		}	
	}
	
	public void tongtien()
	{
		int t=0;
		for(HocSinh a :lisths)
		{
			t=t+a.tienbantru();
		}
		System.out.println("\ntong tien an la :"+t);
	}
	public void sapXep()
	{
		Collections.sort(lisths, new TienBanTruComparator());
		System.out.println("\nDS Hoc Sinh da sap xep: ");
		xuat();
	}
	public void xuatsoba20()
	{
		System.out.println("\ndanh sach hoc sinh co so buoi an >20 la");
		for(HocSinh a : lisths)
		{
			if(a.getSoba()>20)
				{a.xuat();}
		}
		
	}
}