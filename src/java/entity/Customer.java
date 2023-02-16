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
public class Customer {

    private String Username;
    private String email;
    private String tenKhach;
    private String sdt;
    private String diachi;

    public Customer() {
    }

    public Customer(String Username, String email, String tenKhach, String sdt, String diachi) {
        this.Username = Username;
        this.email = email;
        this.tenKhach = tenKhach;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    
}
