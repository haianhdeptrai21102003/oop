package qlykho;

import java.util.Scanner;
public class nhanvien extends connguoi {
	private int manv;
	private static Scanner sc = new Scanner(System.in);
	
	public nhanvien(int manv, String ten, String diachi, int sdt) {
		super(ten,diachi,sdt);
		this.manv = manv;
	}
	
	public nhanvien() {
		super();
		manv = 0;
	}
	
	public int getManv() {
		return manv;
	}
	public void setManv(int manv) {
		this.manv = manv;
	}
	
	public void nhap() {
		System.out.println("Nhap ma so nhan vien: ");
		manv = sc.nextInt();
		super.nhap();
	}
	
	public void xuat() {
		System.out.println("Ma nhan vien: " + manv);
		super.xuat();
	}
	
}
