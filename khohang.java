package qlykho;

import java.util.Scanner;
public class khohang {
	private int makho;
	private String tenkho;
	private static Scanner sc = new Scanner(System.in);
	
	public khohang(int makho, String tenkho) {
		this.makho = makho;
		this.tenkho = tenkho;
	}
	
	public khohang() {
		makho = 0;
		tenkho = null;
	}
	
	public int getMakho() {
		return makho;
	}
	public void setMakho(int makho) {
		this.makho = makho;
	}
	public String getTenkho() {
		return tenkho;
	}
	public void setTenkho(String tenkho) {
		this.tenkho = tenkho;
	}
	
	public void nhap() {
		System.out.println("Nhap ma kho: ");
		makho = sc.nextInt();
		System.out.println("Nhap ten kho: ");
		tenkho = sc.nextLine();
	}
	
	public void xuat() {
		System.out.println("Ma so kho hang: " +makho);
		System.out.println("Ten kho: " +tenkho);
	}
}
