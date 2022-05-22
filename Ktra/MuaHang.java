package baiktra;
import java.util.*;
import java.io.*;
public class MuaHang {
	KhachHang kh; 
    ArrayList<MatHang>listh;
    public MuaHang(){
        kh = new KhachHang();
        listh = new ArrayList<>();
    }
    public void nhapMH() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("Lay thong tin khach hang: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        String makh = sc.nextLine();
        DSKhachHang DSKH = new DSKhachHang();
        DSMatHang DSMH = new DSMatHang();
        KhachHang kh = DSKH.searchById(makh);
        if(kh!=null){
            this.kh = kh;
            String maMH;
            do{
                System.out.println("Nhap ma hang: ");
                maMH = new Scanner(System.in).nextLine();
                MatHang mh = DSMH.searchById(maMH);
                if(mh!=null){
                    listh.add(mh);
                }
            }while(!maMH.equals("*"));
        }else{
            System.out.println("Khach hang nay chua co trong he thong");
        }
    }
    public void hienMuaHang(){
        System.out.println("Thong tin Khach Hang: ");
        System.out.println(""+kh.toString());
        System.out.println("Danh sach hang mua: ");
        for (MatHang matHang : listh) {
            System.out.println(""+matHang.toString());
        }
    }
}
