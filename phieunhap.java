package qlykho;

import java.util.Scanner;
public class phieunhap {
    Scanner scanner=new Scanner(System.in);
    String mphap;
    String manv;
    String makho;
    String ma_ncc;
    String ngaynhap;
    String soluong;
    String mahang;
    String tenhanghoa;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getMphap() {
        return mphap;
    }

    public void setMphap(String mphap) {
        this.mphap = mphap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakho() {
        return makho;
    }

    public void setMakho(String makho) {
        this.makho = makho;
    }

    public String getMa_ncc() {
        return ma_ncc;
    }

    public void setMa_ncc(String ma_ncc) {
        this.ma_ncc = ma_ncc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }
    public  void nhap(){
        System.out.println("Mã phiếu nhập :");
        mphap= scanner.nextLine();
        System.out.println("Mã nhân viên :");
        manv= scanner.nextLine();
        System.out.println("Mã kho :");
        makho=scanner.nextLine();
        System.out.println("Mã nhà cung cấp:");
        ma_ncc=scanner.nextLine();
        System.out.println("Ngày nhập :");
        ngaynhap=scanner.nextLine();
        System.out.println("Tên hàng:");
        tenhanghoa=scanner.nextLine();
        System.out.println("Mã hàng :");
        mahang=scanner.nextLine();
        System.out.println("Số lượng nhập:");
        soluong=scanner.nextLine();
    }
    public void xuat(){
        System.out.println("Mã phiếu nhập :"+mphap);
        System.out.println("Mã nhân viên :"+manv);
        System.out.println("Mã kho :"+makho);
        System.out.println("Mã nhà cung cấp:"+ma_ncc);
        System.out.println("Ngày nhập :"+ngaynhap);
        System.out.println("Tên hàng:"+tenhanghoa);
        System.out.println("Mã hàng :"+mahang);
        System.out.println("Số lượng nhập:"+soluong);
    }
}
