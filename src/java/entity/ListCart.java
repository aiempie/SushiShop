/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author khanh
 */
public class ListCart {

    private String idSP;
    private float dongia;
    private  int soluong;
    private float thanhtien;
    private String image;
    private String tenSp;

    public ListCart() {
    }

    public ListCart(String idSP, float dongia, int soluong, String image, String tenSp) {
        this.idSP = idSP;
        this.dongia = dongia;
        this.soluong = soluong;
        this.thanhtien = dongia*soluong;
        this.image = image;
        this.tenSp = tenSp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
