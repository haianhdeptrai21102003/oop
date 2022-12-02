package qlykho;

import java.util.Scanner;
public class hanghoa {
	private int mahang;
	private String tenhang;
	private int soluong;
	private String donvi;
	private double giatien;
	private static Scanner sc = new Scanner(System.in);
	
	public hanghoa(int mahang, String tenhang, int soluong, String donvi, double giatien) {
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.soluong = soluong;
		this.donvi = donvi;
		this.giatien = giatien; 
	}
	
	public hanghoa() {
		mahang = 0;
		tenhang=null;
		soluong=0;
		donvi=null;
		giatien = 0.0;
	}

	public int getMahang() {
		return mahang;
	}
	public void setMahang(int mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getDonvi() {
		return donvi;
	}
	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien() {
		this.giatien = giatien;
	}
	
	public void nhap() {
		System.out.println("Nhap ma so hang:");
		mahang = sc.nextInt();
		System.out.println("Nhap ten hang hoa: ");
		tenhang = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap so luong: ");
		soluong = sc.nextInt();
		System.out.println("Nhap don vi tinh: ");
		donvi = sc.nextLine();
		System.out.println("Nhap gia tien: ");
		giatien = sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ma so: " + mahang);
		System.out.println("Ten hang: " +tenhang);
		System.out.println("So luong: " +soluong);
		System.out.println("Don vi tinh: "+donvi);
		System.out.println("Gia tien: " +giatien);
	}
	
}
