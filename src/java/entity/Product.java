/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author quanglam
 */
public class Product {
    private String idSp;
    private String tenSp;
    private float dongia;
    private String idLoaiHang;
    private String image;

    public Product() {
    }

    public Product(String idSp, String tenSp, float dongia, String idLoaiHang, String image) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.dongia = dongia;
        this.idLoaiHang = idLoaiHang;
        this.image = image;
    }

    public String getIdSp() {
        return idSp;
    }

    public void setIdSp(String idSp) {
        this.idSp = idSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getIdLoaiHang() {
        return idLoaiHang;
    }

    public void setIdLoaiHang(String idLoaiHang) {
        this.idLoaiHang = idLoaiHang;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
