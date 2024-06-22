/*
    Cao Đăng Quyền
 */

package com.mycompany.btthbuoi7;

import java.util.Scanner;

public class ConNguoi {
	private String maSo;
    private String ten;
    private int namSinh;

    public ConNguoi() {
    }
    
    public ConNguoi(String maSo, String ten, int namSinh) {
    	this.maSo = maSo;
        this.ten = ten;
        this.namSinh = namSinh;
    }
    public ConNguoi(ConNguoi obj) {
    	this.maSo = obj.maSo;
        this.ten = obj.ten;
        this.namSinh = obj.namSinh;
    }
    
    public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getTen() {
        return ten;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhapThongTin(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maSo=scanner.nextLine();
        System.out.println("Nhap Ten: ");
        ten=scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh=scanner.nextInt();
                
    }
    @Override
    public String toString() {
        return "Mã số" + maSo + "Tên: " + ten + ", Năm sinh: " + namSinh;
    }
}