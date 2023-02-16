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
public class Category {
    private String idLoaiHang;
    private String tenLoaiHang;

    public Category() {
    }

    public Category(String idLoaiHang, String tenLoaiHang) {
        this.idLoaiHang = idLoaiHang;
        this.tenLoaiHang = tenLoaiHang;
    }

    public String getIdLoaiHang() {
        return idLoaiHang;
    }

    public void setIdLoaiHang(String idLoaiHang) {
        this.idLoaiHang = idLoaiHang;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }

    
    
}
