
package com.mycompany.btthbuoi7;

import java.util.*;
public class DanhSach {
    private ArrayList<ConNguoi> ds;

    public DanhSach() {
        ds = new ArrayList<>();
        init();
    }

    public void themDS(ConNguoi p) {
        ds.add(p);
    }
    public void init() {
        ds.add(new HocVien("SV01","Trần Văn Trung", 2000, 7, 8, 9));
        ds.add(new HocVien("SV02","Huỳnh Mỹ Nữ", 2021, 9, 5, 6));
        ds.add(new HocVien("SV03","Nguyễn Văn Hùng", 1999, 5, 8, 7));
        ds.add(new HocVien("SV04","Nguyễn Thị Hồng", 2021, 4, 7, 4));
        ds.add(new HocVien("SV05","Phạm Quốc Thắng", 2000, 3, 4, 6));
        ds.add(new HocVien("SV06","Võ Mạnh Hùng", 2003, 2, 6, 4));
        ds.add(new HocVien("SV07","Lê Kiên Cường", 1982, 3, 7, 4));
        
        
        PhongBanKhoa cn_vt = new PhongBanKhoa("CN_VT", "Công nghệ");
        PhongBanKhoa mt_tn = new PhongBanKhoa("MT_TN", "Môi trường");
        PhongBanKhoa cn_dt = new PhongBanKhoa("CN_DT", "Công nghệ");
        PhongBanKhoa mt_khi = new PhongBanKhoa("MT_KHI", "Môi trường");
        PhongBanKhoa mt_nuoc = new PhongBanKhoa("MT_NUOC", "Môi trường");
        PhongBanKhoa cn_oto = new PhongBanKhoa("CN_OTO", "Công nghệ");
        PhongBanKhoa pbk2 = new PhongBanKhoa("KTPM", "Kỹ thuật phần mềm");
        
        
        ds.add(new GiaoVienHuongDan("TG001","Phạm Văn D", 1990, 6000, "01/01/2018", pbk2, "Thạc sĩ", "Khoa học máy tính", "ĐH Quốc gia", 1500, 10));
        ds.add(new NhanVienQuanLy("NV01", "Nguyễn Thị Hải", 1993, 8000, "15/06/2022", mt_tn, "Thạc sỹ", "TN & MT", "ĐH BCVT Tp.HCM", 500));
        ds.add(new NhanVienQuanLy("NV02", "Nguyễn Thị Hằng", 1994, 8000, "12/02/2021", mt_nuoc, "Cử nhân",	"TN & MT", "HUTECH Tp.HCM", 200));
        ds.add(new NhanVienQuanLy("NV02", "Nguyễn Trung Thành", 2000, 6000, "12/05/2020", mt_tn, "Cử nhân","TN & MT","ĐH BK Tp.HCM", 200));
        ds.add(new NhanVienQuanLy("NV02", "Trần Văn Mạnh", 1994, 9000, "12/02/2021", cn_oto, "Cử nhân","TN & MT","ĐH KHTN Tp.HCM", 300));
        ds.add(new GiaoVien("GV01", "Nguyễn Thanh Huy", 1981, 15000, "01/01/2022", cn_dt,"Thạc sỹ", "Viễn thông", "ĐH BCVT Tp.HCM" , 900));
        ds.add(new GiaoVien("GV02", "Nguyễn Văn Hùng", 1985, 12000, "01/02/2021", cn_dt, "Thạc sỹ","Điện tử", "ĐH BK Tp.HCM", 500));
        ds.add(new GiaoVien("GV03", "Bùi Thị Thắm Nồng", 1981, 9000, "12/02/2020", cn_oto, "Tiến sỹ","Điện tử","ĐH BK Tp.HCM", 300));
    }

    
    public void xuatDSNV() {
        for (ConNguoi ps : ds) {
            if (ps instanceof NhanVien || ps instanceof NhanVienQuanLy) {
                ps.toString();
            }
        }
    }

    public void xuatDSHV() {
        for (ConNguoi ps : ds) {
            if (ps instanceof HocVien) {
                ps.toString();
            }
        }
    }

    public void xuatDSGV() {
        System.out.printf("+-----+----------------------+----------+------------+------------+--------------+---------+----------------------+----------+----------+----------------------+----------+\n");
        System.out.printf("| STT | HỌ TÊN               | NĂM SINH | LƯƠNG      | THU LAO GD | NGÀY NHẬN VIỆC | MÃ PBK  | TÊN PBK              | TRÌNH ĐỘ | NGÀNH    | NƠI ĐÀO TẠO         | SỐ GIỜ DẠY |\n");
        System.out.printf("+-----+----------------------+----------+------------+------------+--------------+---------+----------------------+----------+----------+----------------------+----------+\n");

        int stt = 1;
        for (ConNguoi ps : ds) {
            if (ps instanceof GiaoVienHuongDan) {
                System.out.printf("| %-3d ", stt++);
                ps.toString();
            }
        }

        System.out.printf("+-----+----------------------+----------+------------+------------+--------------+---------+----------------------+----------+----------+----------------------+----------+\n");

        stt = 1;
        for (ConNguoi ps : ds) {
            if (ps instanceof GiaoVien && !(ps instanceof GiaoVienHuongDan)) {
                System.out.printf("| %-3d ", stt++);
                ps.toString();
            }
        }

        System.out.printf("+-----+----------------------+----------+------------+--------------+---------+----------------------+----------+----------+----------------------+\n");
    }
    public void sapXepTheoTen() {
        Collections.sort(ds, new Comparator<ConNguoi>() {
            @Override
            public int compare(ConNguoi p1, ConNguoi p2) {
                return p1.getTen().compareToIgnoreCase(p2.getTen());
            }
        });
    }

    public ConNguoi timKiemTheoTen(String ten) {
        for (ConNguoi ps : ds) {
            if (ps.getTen().equalsIgnoreCase(ten)) {
                return ps;
            }
        }
        return null;
    }

    public void themVaoDanhSach(ConNguoi p) {
        ds.add(p);
    }

    public void xoaKhoiDanhSach(String ten) {
        ConNguoi p = timKiemTheoTen(ten);
        if (p != null) {
            ds.remove(p);
            System.out.println("Đã xóa đối tượng " + ten + " khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }

    public void capNhatTrongDanhSach(String ten, ConNguoi newP) {
        ConNguoi oldP = timKiemTheoTen(ten);
        if (oldP != null) {
            int index = ds.indexOf(oldP);
            ds.set(index, newP);
            System.out.println("Đã cập nhật thông tin cho đối tượng " + ten + ".");
        } else {
            System.out.println("Không tìm thấy đối tượng cần cập nhật.");
        }
    }

    public ArrayList<ConNguoi> getDs() {
        return ds;
    }

    public void setDs(ArrayList<ConNguoi> ds) {
        this.ds = ds;
    }
}
