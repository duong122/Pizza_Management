/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baocaopizza.java;

/**
 *
 * @author ASUS
 */
public class HoaDon {
     private String MaHD;
     private String NgayTaoHD;
     private String MaNV;
     private String TenKH;
     private String DiaChiKH;
     private String SDT;
     private float TongTien;

    public HoaDon(String MaHD, String NgayTaoHD, String Manv, String TenKH, String DiaChiKH, String SDT, float TongTien) {
        this.MaHD = MaHD;
        this.NgayTaoHD = NgayTaoHD;
        this.MaNV = MaNV;
        this.TenKH = TenKH;
        this.DiaChiKH = DiaChiKH;
        this.SDT = SDT;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayTaoHD() {
        return NgayTaoHD;
    }

    public void setNgayTaoHD(String NgayTaoHD) {
        this.NgayTaoHD = NgayTaoHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChiKH() {
        return DiaChiKH;
    }

    public void setDiaChiKH(String DiaChiKH) {
        this.DiaChiKH = DiaChiKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

   

     
}
