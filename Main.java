package qlykho;

import java.util.Scanner;
public class Main {
	private static dsnhanvien a = new dsnhanvien();
	private static dskhachhang b = new dskhachhang();
	private static dssanpham c =new dssanpham();
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int luachon;
		do {
		System.out.println("1/ Nhap ds hang hoa");
		System.out.println("2/ Nhap ds khach hang");
		System.out.println("3/ Nhap ds kho hang");
		System.out.println("4/ Nhap ds nha cung cap");
		System.out.println("5/ Nhap ds nhan vien");
		System.out.println("6/ Tim ma nhan vien");
		System.out.println("7/ Them moi nhan vien");
		System.out.println("Nhap lua chon; ");
		luachon = sc.nextInt();
		switch(luachon) {
			case 1: 
				c.nhap();
				c.xuat();
				c.themsanpham();
				break;
			case 2:
				b.nhap();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				a.nhap();
				break;
			case 6:
				a.timkiemnv();
				break;
			case 7:
				a.themnv();
				a.xuat();
				break;
		} 
		} while(true);
	} 
	
}
