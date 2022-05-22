package baiktra;
import java.io.*;
import java.util.*;
public class ApDung {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        int chon;
        DSKhachHang dskh = new DSKhachHang();
        DSMatHang dsmh = new DSMatHang();
        MuaHang muaHang = new MuaHang();
        do{
            menu();
            System.out.println("Hay chon 1-9: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    dskh.nhapDS();
                    break;
                case 2:
                    dskh.ghiDS();
                    break;
                case 3:
                    dskh.docDS();
                    break;
                case 4:
                    dsmh.nhapDS();
                    break;
                case 5:
                    dsmh.ghiDS();
                    break;
                case 6:
                    dsmh.docFile();
                    break;
                case 7:
                    muaHang.nhapMH();
                    break;
                case 8:
                    muaHang.hienMuaHang();
                    break;
                case 9:
                    return;
                default:
                    break;
               
            }
            System.out.println("Tiep tuc khong? - 0: ket thuc");
            chon = new Scanner(System.in).nextInt();
        }while(chon!=0);
    }
    
    public static void menu(){
        System.out.println("Quan ly ban hang ");
        System.out.println("1. Nhap thong tin khach hang ");
        System.out.println("2. Luu thong tin khach hang ra file ");
        System.out.println("3. Hien thong tin khach hang ");
        System.out.println("4. Nhap thong tin mat hang ");
        System.out.println("5. luu thong tin mat hang ra file ");
        System.out.println("6. Hien thong tin mat hang ");
        System.out.println("7. nhap thong tin mua hang ");
        System.out.println("8. hien thong tin mua hang ");
        System.out.println("9. ket thuc");
    }
}