package bai14;
public class XeMay extends Xe implements iXe{
	protected double vat,ttb;
	public XeMay() {
	}
	public XeMay(String tenxe, String hangsx, int namsx, int gia, double vat, double ttb) {
		super();
		this.vat=vat;
		this.ttb=ttb;
	}
	public void setVat(double vat) {
		this.vat=vat;
	}
	public double getVat() {
		return vat;
	}
	public void setTtb(double ttb) {
		this.ttb=ttb;
	}
	public double getTtb() {
		return ttb;
	}
	public void nhap() {
		super.nhap();
	}
	public void xuat() {
		super.xuat();
	}
	public String toString() {
		return super.toString()+"Thue VAT: "+vat+", Thue truoc ba: "+ttb+",";
	}
	public double tinhThue() {
		vat=gia*10/100;
		ttb=gia*5/100;
		System.out.printf("Thue VAT cua xe may la: "+vat);
		System.out.printf("\nThue truoc ba cua xe may la: "+ttb+"\n");
		return 0;
	}
}
