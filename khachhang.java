package qlykho;

import java.util.Scanner;
public class khachhang {
	private int makh;
	private String ten;
	private String diachi;
	private int sdt;
	private static Scanner sc = new Scanner(System.in);
	
	public khachhang(int makh, String ten, String diachi, int sdt) {
		this.makh = makh;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
	}

	public khachhang() {
		makh = 0;
		ten = null;
		diachi = null;
		sdt = 0;
	}

	public int getMakh() {
		return makh;
	}

	public void setMakh(int makh) {
		this.makh = makh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	
	public void nhap() {
		System.out.println("Nhap ma so:");
		makh = sc.nextInt();
		System.out.println("Nhap ten khach hang: ");
		ten = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.println("Nhap dien thoai lien lac: ");
		sdt = sc.nextInt();
	}
	
	public void xuat() {
		System.out.println("Ma so cua khach hang: " +makh);
		System.out.println("Ten khach hang: " +ten);
		System.out.println("Dia chi: " +diachi);
		System.out.println("So dien thoai: " + sdt);
	}
	
	
}
