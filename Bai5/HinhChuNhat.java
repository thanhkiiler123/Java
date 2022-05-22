package bai5;

import java.util.Scanner;

public class HinhChuNhat {
	    private float dai,rong;
	    
	    public void setDai(float dai){
	        this.dai=dai;
	    }
	    public float getDai(){
	        return dai;
	    }
	     public void setRong(float rong){
	        this.rong=rong;
	    }
	    public float getRong(){
	        return rong;
	    }
	    public float dienTich(){
	        return dai*rong;
	    }
	    public float chuVi(){
	        return (dai+rong)*2;
	    }
	    public String toString(){
	        return "\nHinhChuNhat: \nChieu dai: "+getDai()+"\nChieu Rong: "+getRong()+"\nChu vi: "+chuVi()+"\nDien tich: "+dienTich() ;
	    }
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap chieu dai: ");
	        dai=sc.nextFloat();
	        System.out.print("Nhap chieu rong: ");
	        rong=sc.nextFloat();
	    }
}