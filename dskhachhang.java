package qlykho;

import java.util.Scanner;
public class dskhachhang {
	private khachhang[] arr = new khachhang[100];
	private int soluong;
	private static Scanner sc = new Scanner(System.in);
	
	public dskhachhang() {
		arr = null;
		soluong = 0;
	}

	public dskhachhang(khachhang[] arr, int soluong) {
		this.arr = arr;
		this.soluong = soluong;
	}

	public khachhang[] getArr() {
		return arr;
	}

	public void setArr(khachhang[] arr) {
		this.arr = arr;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public void nhap() {
		System.out.println("Nhap so luong khach hang: ");
		soluong = sc.nextInt();
		for(int i=0;i<soluong;i++) {
			System.out.println("Khach hang "+ i);
			arr[i] = new khachhang();
			arr[i].nhap();
		}
	}
	
	public void xuat() {
		System.out.println("So luong khach hang: " +soluong);
		for(int i=0;i<soluong;i++) {
			System.out.println("Khach hang " +i);
			arr[i].xuat();
		}
	}
}
