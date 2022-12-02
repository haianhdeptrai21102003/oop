package qlykho;

import java.util.Scanner;
public class dsnhanvien{
	private nhanvien[] arr = new nhanvien[100];
	private int soluong;
	private static Scanner sc = new Scanner(System.in);
	
	public dsnhanvien(int soluong) {
		this.soluong = soluong;
	}
	
	public dsnhanvien() {
		soluong = 0;
	}
	
	public int getSoluong() {
		return soluong;
	}
	
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public void nhap() {
		int tam;
		System.out.println("Nhap so luong nhan vien: ");
		tam = sc.nextInt();
		soluong = soluong + tam;
		for(int i=soluong-tam;i<soluong;i++) {
			System.out.println("Nhan vien " +(i+1));
			arr[i] = new nhanvien();
			arr[i].nhap();
		}
	}
	
	public void xuat() {
		System.out.println("So luong nhan vien: " +soluong);
		for(int i=0;i<soluong;i++) {
			System.out.println("Nhan vien " +(i+1));
			arr[i].xuat();
		}
	}
	
	public void timkiemnv() {
		int tam;
		System.out.println("Nhap ma so nhan vien can tim: ");
		tam = sc.nextInt();
		for(int i=0;i<soluong;i++)
			if(arr[i].getManv() == tam) {
				System.out.println("Da tim thay!");
				arr[i].xuat();
				break;
			}
	}
	
	public void themnv() {
		int luachon;
		do {
			soluong = soluong+1;
			System.out.println("Nhap thong tin");
			int tam = soluong - 1;
			arr[tam] = new nhanvien();
			arr[tam].nhap();
			System.out.println("Tiep tuc them nhan vien (1): ");
			luachon = sc.nextInt();
		} while(luachon==1);
	}
	
}
