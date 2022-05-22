package bai1;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		int n,sum=0,max,min,i,vt;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so phan tu cua mang: ");
			n = sc.nextInt();
		}
		while(n<=0);
		int[] array = new int[n];

		//Nhap mang
		System.out.println("Nhap cac phan tu cho mang: ");
		for(i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu "+(i+1)+":");
			array[i]=sc.nextInt();
		}

		//Hien mang
		System.out.print("Mang ban dau: \n");
	    for (i=0; i<n; i++) {
			vt=i;
	        System.out.printf("\t" +array[i] + " o vi tri thu: "+(vt+1)+"\n");
	    }


	    //Tong mang
		for (i=0;i<n;i++) {
			sum+=array[i];
		}
		System.out.println("Tong cac phan tu cua mang la: "+sum);

		//Tim phan tu le
		System.out.println("Cac phan tu le cua mang la: ");
		for (i=0;i<n;i++) {
			if(array[i]%2!=0) {
				vt=i;
				System.out.print("\t"+array[i] + " o vi tri thu "+(vt+1)+"\n");
			}
		}

		//Tim phan tu chan
		System.out.println("Cac phan tu chan cua mang la: ");
		for (i=0;i<n;i++) {
			if(array[i]%2==0) {
				vt=i;
				System.out.print("\t"+array[i] + " o vi tri thu "+(vt+1)+"\n");
			}
		}

		//Tim max
		max=array[0];vt=0;
		System.out.print("Phan tu lon nhat trong mang la: ");
		for(i=0;i<n;i++) {
			if (array[i] > max) {
				max = array[i];
				vt=i;
			}
		}
		System.out.println(max + " va o vi tri thu "+(vt+1));

		//Tim min va dua ra vi tri
		min=array[0];vt=0;
		System.out.print("Phan tu nho nhat cua mang la: ");
		for (i=0;i<n;i++) {
			if (array[i] < min){
				min = array[i];
				vt=i;
			}
		}
		System.out.println(min + " va o vi tri thu "+ (vt+1) );

		//Sap xep tu be den lon
		int tg;
		System.out.print("Mang duoc sap xep tang dan la: \t");
		for (i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if (array[i]>array[j]) {
					tg=array[j];
					array[j]=array[i];
					array[i]=tg;
				}
			}
		}
		for (i=0;i<n;i++)
		{System.out.print(array[i] + "\t");}

		//Sap xep tu lon den be
		int temp;
		System.out.print("\nMang duoc sap xep giam dan la: \t");
		for( i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if (array[i]<array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
			System.out.print(array[i] + "\t");
		}
	}
}