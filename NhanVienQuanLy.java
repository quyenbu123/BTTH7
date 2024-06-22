
package com.mycompany.btthbuoi7;
import java.util.Scanner;
public class NhanVienQuanLy extends NhanVienCLCao {
    private double phuCapCV;

    public NhanVienQuanLy() {
        super();
    }
    
    public NhanVienQuanLy(String maSo, String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa, String trinhDo, String nganh, String noiDaoTao, double phuCapCV) {
        super(maSo, ten, namSinh, luong, ngayNhanViec, phongBanKhoa, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }
    public NhanVienQuanLy(NhanVienQuanLy obj) {
        super(obj);
        this.phuCapCV = obj.phuCapCV;
    }
    public double getPhuCapCV() {
        return phuCapCV;
    }
    public void setPhuCapCV(double phuCapCV) {
        this.phuCapCV = phuCapCV;
    }
    public double getTongLuong() {
        return luong + phuCapCV;
    }
    public void nhapThongTin() {
        Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập phụ cấp công việc: ");
        double phuCapCV = scanner.nextDouble();
        scanner.nextLine();         
    }
    @Override
    public String toString() {
        return super.toString() + ", Phụ cấp công việc: " + phuCapCV;
    }
}