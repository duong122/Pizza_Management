/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baocaopizza.java;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private float DonGia;
    private String MoTa;
    private String MaLoaiSP;
    public SanPham(){
        
    }
    public SanPham(String MaSP, String TenSP, float DonGia, String MoTa, String MaLoaiSP) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.MoTa = MoTa;
        this.MaLoaiSP = MaLoaiSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public float getDonGia() {
        return DonGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    

}
