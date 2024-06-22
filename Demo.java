
package com.mycompany.btthbuoi7;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSach danhSach= new DanhSach();
        ConNguoi n ;
        danhSach.init();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhap 1 hoc vien");
            System.out.println("2. Nhap 1 nhan vien quan ly");
            System.out.println("3. Nhap 1 giao vien");
            System.out.println("4. Nhap 1 giao vien huong dan");
            System.out.println("5. Xuat thong tin danh sach hoc vien");
            System.out.println("6. Xuat thong tin danh sach nhan vien quan ly");
            System.out.println("7. Xuat thong tin danh sach giao vien");
            System.out.println("8. Sap xep theo ten");
            System.out.println("9. Tim kiem theo ten");
            System.out.println("10. Them vao danh sach");
            System.out.println("11. Xoa khoi danh sach");
            System.out.println("12. Cap nhat thong tin");
            System.out.println("0. Thoat");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    n=new HocVien();
                    n.nhapThongTin();
                    danhSach.themDS(n);
                    break;
                case 2:
                    n=new NhanVienQuanLy();
                    n.nhapThongTin();
                    danhSach.themDS(n);
                    break;
                case 3:
                    n=new GiaoVien();
                    n.nhapThongTin();
                    danhSach.themDS(n);
                    break;
                case 4:
                    n=new GiaoVienHuongDan();
                    n.nhapThongTin();
                    danhSach.themDS(n);
                    break;
                case 5:
                    danhSach.xuatDSHV();
                    break;
                case 6:
                    danhSach.xuatDSNV();
                    break;
                case 7:
                    danhSach.xuatDSGV();
                    break;
                case 8:
                    danhSach.sapXepTheoTen();
                    break;
                case 9:
                    System.out.print("Nhap ten can tim: ");
                    String tenTimKiem = scanner.nextLine();
                    ConNguoi ketQua = danhSach.timKiemTheoTen(tenTimKiem);
                    if (ketQua != null) {
                        ketQua.toString();
                    } else {
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 10:
                    System.out.println("Nhap thong tin de them vao danh sach:");
                    // Cho phep nguoi dung nhap thong tin cua cac loai doi tuong de them vao danh sach
                    break;
                case 11:
                    System.out.print("Nhap ten can xoa: ");
                    String tenXoa = scanner.nextLine();
                    danhSach.xoaKhoiDanhSach(tenXoa);
                    break;
                case 12:
                    System.out.print("Nhap ten can cap nhat: ");
                    String tenCapNhat = scanner.nextLine();
                    System.out.println("Nhap thong tin moi:");
                    // Cho phep nguoi dung nhap thong tin moi de cap nhat
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le.");
            }}}
}
