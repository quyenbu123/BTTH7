
package com.mycompany.btthbuoi7;

import java.util.Scanner;

public class GiaoVienHuongDan extends GiaoVien {
    public int SoTiet;

    public GiaoVienHuongDan() {
        super();
    }
    
    public GiaoVienHuongDan(String maSo, String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa, String trinhDo, String nganh, String noiDaoTao, double thuLaoGD, int soTietDay) {
        super(maSo, ten, namSinh, luong, ngayNhanViec, phongBanKhoa, trinhDo, nganh, noiDaoTao, thuLaoGD);
        this.SoTiet = soTietDay;
    }

    public GiaoVienHuongDan(int SoTiet, GiaoVien obj) {
        super(obj);
        this.SoTiet = SoTiet;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    @Override
    public double getLuong() {
        return luong;
    }

    @Override
    public void setLuong(double luong) {
        this.luong = luong;
    }
  @Override
    public double getTongLuong() {
        return super.getTongLuong() + (SoTiet * 200);
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner =new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập số giờ giảng dạy: ");
        int SoTiet = scanner.nextInt();
        scanner.nextLine(); 
    }
    @Override
    public String toString() {
        return super.toString() + ", Số tiết dạy: " + SoTiet;
    }
}
