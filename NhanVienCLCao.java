
package com.mycompany.btthbuoi7;
import java.util.Scanner;
public class NhanVienCLCao extends NhanVien {
    private String trinhDo;
    private String nganh;
    private String noiDaoTao;

    public NhanVienCLCao() {
        super();
    }
    
    public NhanVienCLCao(String maSo, String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa, String trinhDo, String nganh, String noiDaoTao) {
        super(maSo, ten, namSinh, luong, ngayNhanViec, phongBanKhoa);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }
    public NhanVienCLCao(NhanVienCLCao obj) {
        super(obj);
        this.trinhDo = obj.trinhDo;
        this.nganh = obj.nganh;
        this.noiDaoTao = obj.noiDaoTao;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public String getNoiDaoTao() {
        return noiDaoTao;
    }
    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner =new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập trình độ: ");
        String trinhDo = scanner.nextLine();
        System.out.print("Nhập ngành: ");
        String nganh = scanner.nextLine();
        System.out.print("Nhập nơi đào tạo: ");
        String noiDaoTao = scanner.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + ", Trình độ: " + trinhDo + ", Ngành: " + nganh + ", Nơi đào tạo: " + noiDaoTao;
    }
}