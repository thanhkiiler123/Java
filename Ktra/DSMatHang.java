package baiktra;
import java.util.*;
import java.io.*;
public class DSMatHang {
	ArrayList<MatHang>listmh;
	File fname = new File ("MH.DAT");
	public DSMatHang() {
		listmh=new ArrayList<>();
	}
	public void nhapDS() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong mat hang: ");
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			MatHang a = new MatHang();
			System.out.print("nhap thong tin mat hang thu "+i+":");
			a.nhap();
			listmh.add(a);
		}
	}
	public void hienDS() {
		System.out.print("Danh sach vua nhap la: ");
		for (MatHang a: listmh) {
			a.xuat();
		}
	}
	 public void ghiDS() throws FileNotFoundException, IOException{
		 FileOutputStream fout = new FileOutputStream(fname);
	     ObjectOutputStream out = new ObjectOutputStream(fout);
	     out.writeObject(listmh);
	     out.close();
		 fout.close();
		 System.out.println("Da luu danh sach mat hang vao file.");
	 }
	 public ArrayList<MatHang> docFile() throws FileNotFoundException, IOException, ClassNotFoundException{
			FileInputStream fin = new FileInputStream(fname);
			ObjectInputStream in = new ObjectInputStream(fin);
			listmh = (ArrayList)in.readObject();
			in.close();
			fin.close();
			System.out.print("Danh sach mat hang doc tu file la: "+listmh);
			return listmh;
	 }
	 public MatHang searchById(String maMH) throws IOException, FileNotFoundException, ClassNotFoundException{
	        ArrayList<MatHang> lsMathang = docFile();
	        for (MatHang mh : listmh) {
	            if(mh.getMaHang().equals(maMH)){
	                return mh;
	            }
	        }
	        return null;
	    }

}
