package bai15;
import java.util.*;
import java.io.*;
public class DSHocSinh implements Serializable{
	ArrayList<HocSinh>lisths;
	private static final long serialVersionUID = 1L;
	protected File fname;
	public DSHocSinh() {
		lisths=new ArrayList();
		fname=new File("DSHS.dat");
	}
	public void nhapDS() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hoc sinh: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Nhap thong tin hoc sinh thu "+i+":\n");
			HocSinh a = new HocSinh();
			a.nhap();
			lisths.add(a);
		}
	}
	public void xuatDS() {
		System.out.print("Danh sach hoc sinh vua nhap la: \n");
		for(HocSinh a:lisths) {
			a.xuat();
		}
	}
	public void namSinhX() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap nam sinh X: ");
		x = sc.nextInt();
		System.out.print("Danh sach hoc sinh theo nam sinh vua nhap la: \n");
		for (HocSinh a:lisths) {
			if(a.ns==x) {
				a.xuat();
			}
		}
	}
	public void luuFile()  throws FileNotFoundException, IOException{
		FileOutputStream fout = new FileOutputStream(fname);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(lisths);
		out.close();
		fout.close();
		System.out.println("Da luu danh sach hoc sinh vao file.");
	}
	public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream(fname);
		ObjectInputStream in = new ObjectInputStream(fin);
		lisths = (ArrayList)in.readObject();
		fin.close();
		in.close();
		System.out.print("Danh sach hoc sinh da duoc doc tu file. \n");
	}
}
