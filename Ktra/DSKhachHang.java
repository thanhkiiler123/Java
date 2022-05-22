package baiktra;
import java.util.*;
import java.io.*;
public class DSKhachHang {
	ArrayList<KhachHang>listkh;
	File fname = new File ("KH.DAT");
	public DSKhachHang() {
		listkh=new ArrayList<>();
	}
	public void nhapDS() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong khach hang: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			KhachHang k = new KhachHang();
			System.out.print("Nhap thong tin khach hang thu "+i+":");
			k.nhap();
			listkh.add(k);
		}
	}
	public void xuatDS() {
		System.out.print("Danh sach khach hang vua nhap la: ");
		for(KhachHang k: listkh) {
			k.xuat();
		}
	}
	public void ghiDS() throws FileNotFoundException, IOException{
		FileOutputStream fout = new FileOutputStream(fname);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(listkh);
		fout.close();
		out.close();
	}
	public ArrayList<KhachHang> docDS() throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream(fname);
		ObjectInputStream in = new ObjectInputStream(fin);
		listkh = (ArrayList)in.readObject();
		fin.close();
		in.close();
		System.out.print("Danh sach khach hang doc tu file: "+listkh);
		return listkh;
	}
	public KhachHang searchById(String makh) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<KhachHang>listkh = docDS();
        for (KhachHang k : listkh) {
            if(k.getMakh().equals(makh)){
                return k;
            }
        }
        return null;
    }
}
