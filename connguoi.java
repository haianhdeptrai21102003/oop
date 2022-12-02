package qlykho;

import java.util.Scanner;
public class connguoi {
	private String ten;
	private String diachi;
	private int sdt;
	private static Scanner sc = new Scanner(System.in);
	
	public connguoi(String ten, String diachi, int sdt) {
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	
	public connguoi() {
		ten = null;
		diachi = null;
		sdt = 0;
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
		System.out.println("Nhap ho va ten: ");
		ten = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		sdt = sc.nextInt();
	}
	
	public void xuat() {
		System.out.println("Ho ten: " + ten);
		System.out.println("Dia chi: " +diachi);
		System.out.println("So dien thoai: " +sdt);
	}
	
}
