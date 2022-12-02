package qlykho;

import java.util.Scanner; 
public class dssanpham {
	private hanghoa[] arr = new hanghoa[100];
	private int soluong;
	private static Scanner sc = new Scanner(System.in);
	
	public dssanpham() {
		soluong = 0;
	}

	public dssanpham(int soluong) {
		this.soluong = soluong;
	}

	public int getSoluong() {
		return soluong;
	}
	
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public void nhap() {
		int tam;
		System.out.println("Nhap so luong mat hang: ");
		tam = sc.nextInt();
		soluong = soluong + tam;
		for(int i=soluong-tam;i<soluong;i++) {
			System.out.println("Mat hang " +(i+1));
			arr[i] = new hanghoa();
			arr[i].nhap();
		}
	}
	
	public void xuat() {
		System.out.println("So luong mat hang: " +soluong);
		for(int i=0;i<soluong;i++) {
			System.out.println("Mat hang " +(i+1));
			arr[i].xuat();
		}
	}
	
	public void timkiemsanpham() {
		int tam;
		System.out.println("Nhap ma so nhan vien can tim: ");
		tam = sc.nextInt();
		for(int i=0;i<soluong;i++)
			if(arr[i].getMahang() == tam) {
				System.out.println("Da tim thay!");
				arr[i].xuat();
				break;
			}
	}
	
	public void themsanpham() {
		int luachon;
		do {
			soluong = soluong+1;
			System.out.println("Nhap thong tin san pham");
			int tam = soluong - 1;
			arr[tam] = new hanghoa();
			arr[tam].nhap();
			System.out.println("Tiep tuc them san pham (1): ");
			luachon = sc.nextInt();
		} while(luachon==1);
	}
}
