
package com.mycompany.btthbuoi7;
import java.util.Scanner;
public class HocVien extends ConNguoi {
    private int diem1;
    private int diem2;
    private int diem3;

    public HocVien() {
        super();
    }

    public HocVien(String maSo, String ten, int namSinh, int diem1, int diem2, int diem3) {
        super(maSo, ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public HocVien(HocVien obj) {
        super(obj);
        this.diem1 = obj.diem1;
        this.diem2 = obj.diem2;
        this.diem3 = obj.diem3;
    }
    public int getDiem1() {
        return diem1;
    }
    public void setDiem1(int diem1) {
        this.diem1 = diem1;
    }
    public int getDiem2() {
        return diem2;
    }
    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }
    public int getDiem3() {
        return diem3;
    }
    public void setDiem3(int diem3) {
        this.diem3 = diem3;
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập điểm 1: ");
        int diem1 = scanner.nextInt();
        System.out.print("Nhập điểm 2: ");
        int diem2 = scanner.nextInt();
        System.out.print("Nhập điểm 3: ");
        int diem3 = scanner.nextInt();
        scanner.nextLine(); 
    }
    @Override
    public String toString() {
        return super.toString() + ", Điểm: " + diem1 + ", " + diem2 + ", " + diem3;
    }
}