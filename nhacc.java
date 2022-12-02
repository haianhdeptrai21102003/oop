package qlykho;

import java.util.Scanner;
public class nhacc {
	private int maso;
	private String ten;
	private String diachi;
	private int sdt;
	private static Scanner sc = new Scanner(System.in);
	
	public nhacc(int maso, String ten, String diachi, int sdt) {
		this.maso = maso;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	
	public nhacc() {
		maso = 0;
		ten = null;
		diachi = null;
		sdt = 0;
	}
	
	public int getMaso() {
		return maso;
	}
	public void setMaso(int maso) {
		this.maso = maso;
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
		maso = sc.nextInt();
		System.out.println("Nhap ten nha cung cap: ");
		ten = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = sc.nextLine();
	}
	
	public void xuat() {
		System.out.println("Ma so: " +maso);
		System.out.println("Ten nha cung cap: " +ten);
		System.out.println("Dia chi: " +diachi);
	}
	
}
