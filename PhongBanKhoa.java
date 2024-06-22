
package com.mycompany.btthbuoi7;

import java.util.Scanner;

public class PhongBanKhoa {
    private String maPBK;
    private String tenPBK;

    public PhongBanKhoa() {
    }
    
    public PhongBanKhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }
    public PhongBanKhoa(PhongBanKhoa obj) {
        this.maPBK = obj.maPBK;
        this.tenPBK = obj.tenPBK;
    }
    public String getMaPBK() {
        return maPBK;
    }
    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }
    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }
    public String getTenPBK() {
        return tenPBK;
    }
    public void nhapThongTin(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ma PBK: ");
        maPBK=scanner.nextLine();
        System.out.println("Nhap ten PBK: ");
        tenPBK=scanner.nextLine();
        
    }
    @Override
    public String toString() {
        return "Mã PBK: " + maPBK + ", Tên PBK: " + tenPBK;
    }
}