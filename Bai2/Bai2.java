package bai2;
import java.util.*;
public class Bai2 {
	public static int fibonacci(int s) {
		int f0;
        int f1 = 0;
        int fn = 1;
		if (s<0) {
			return -1;
		}
		else if (s==0) {
			return s;
		}
		else {
			for(int i=0;i<s;i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
			}
		}
		return fn;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n: ");
		n = Integer.parseInt(sc.nextLine());
		if (n>0) {
			System.out.println(n+" so dau tien trong chuoi Fibonaci la: ");
			for (int i=1;i<=n;i++) {
			System.out.print(fibonacci(i)+" ");
			}
		}
		else {
			System.out.println("Nhap khong dung, xin moi nhap lai.");
		}
	}
}
