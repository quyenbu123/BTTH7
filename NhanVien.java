
package com.mycompany.btthbuoi7;
import java.util.Scanner;
public class NhanVien extends ConNguoi {
    protected double luong;
    private String ngayNhanViec;
    private PhongBanKhoa phongBanKhoa;

    public NhanVien() {
        super();
    }
    
    public NhanVien(String maSo, String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa) {
        super(maSo, ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongBanKhoa = phongBanKhoa;
    }
    public NhanVien(NhanVien obj) {
        super(obj);
        this.luong = obj.luong;
        this.ngayNhanViec = obj.ngayNhanViec;
        this.phongBanKhoa = obj.phongBanKhoa;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getNgayNhanViec() {
        return ngayNhanViec;
    }
    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }
    public PhongBanKhoa getPhongBanKhoa() {
        return phongBanKhoa;
    }
    public void setPhongBanKhoa(PhongBanKhoa phongBanKhoa) {
        this.phongBanKhoa = phongBanKhoa;
    }
    @Override
    public void nhapThongTin() {
    	Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập lương: ");
        double luong = scanner.nextDouble();
        System.out.print("Nhập ngày nhận việc (dd/MM/yyyy): ");
        String ngayNhanViec = scanner.next();
        System.out.print("Nhập mã PBK: ");
        String maPBK = scanner.next();
        System.out.print("Nhập tên PBK: ");
        String tenPBK = scanner.next();
        scanner.nextLine(); 
        PhongBanKhoa phongBanKhoa = new PhongBanKhoa(maPBK, tenPBK);
    }
    @Override
    public String toString() {
        return super.toString() + ", Lương: " + luong + ", Ngày nhận việc: " + ngayNhanViec + ", Phòng ban/khoa: " + phongBanKhoa;
    }
}