/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ChristianEriksen
 */
public class HoaDonChiTiet {

    private int idHDCT;
    private int idDonHang;
    private String idSP;
    private int soLuong;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int idHDCT, int idDonHang, String idSP, int soLuong) {
        this.idHDCT = idHDCT;
        this.idDonHang = idDonHang;
        this.idSP = idSP;
        this.soLuong = soLuong;
    }

    public int getIdHDCT() {
        return idHDCT;
    }

    public void setIdHDCT(int idHDCT) {
        this.idHDCT = idHDCT;
    }

    public int getIdDonHang() {
        return idDonHang;
    }

    public void setIdDonHang(int idDonHang) {
        this.idDonHang = idDonHang;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "idHDCT=" + idHDCT + ", idDonHang=" + idDonHang + ", idSP=" + idSP + ", soLuong=" + soLuong + '}';
    }
    

}
