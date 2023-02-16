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
public class Contact {
    int idContact;
    String Username;
    String Name;
    String email;
    String request;
    boolean TrangThai;

    public Contact() {
    }

    public Contact(int idContact, String Username, String Name, String email, String request, boolean TrangThai) {
        this.idContact = idContact;
        this.Username = Username;
        this.Name = Name;
        this.email = email;
        this.request = request;
        this.TrangThai = TrangThai;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    
}
