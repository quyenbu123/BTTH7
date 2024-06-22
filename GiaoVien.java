
package com.mycompany.btthbuoi7;
import java.util.Scanner;
public class GiaoVien extends NhanVienCLCao {
    private double thuLaoGD;

    public GiaoVien() {
        super();
    }
    
    public GiaoVien(String maSo, String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa, String trinhDo, String nganh, String noiDaoTao, double thuLaoGD) {
        super(maSo, ten, namSinh, luong, ngayNhanViec, phongBanKhoa, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }
    public GiaoVien(GiaoVien obj) {
        super(obj);
        this.thuLaoGD = obj.thuLaoGD;
    }
    public double getThuLaoGD() {
        return thuLaoGD;
    }
    public void setThuLaoGD(double thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }
    public double getTongLuong() {
        return luong + thuLaoGD;
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập thù lao giảng dạy: ");
        double thuLaoGD = scanner.nextDouble();
        scanner.nextLine(); 
    }
    @Override
    public String toString() {
        return super.toString() + ", Thù lao giảng dạy: " + thuLaoGD;
    }
}