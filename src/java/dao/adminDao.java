/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khanh
 */
public class adminDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DAO dao = new DAO();

    public List<User> getAllLogin() {
        List<User> list = new ArrayList<>();
        String query = "select * from Login";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Customer> getAllUser() {
        List<Customer> list = new ArrayList<>();
        String query = "select * from Customer";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public boolean UpdateProduct(String idSp, Product sp) {
        String query = "Update SanPham set tenSp=?,dongia=?,idLoaiHang=?,image=?,slmua=0 where idSp='" + idSp + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, sp.getTenSp());
            ps.setFloat(2, sp.getDongia());
            ps.setString(3, sp.getIdLoaiHang());
            ps.setString(4, sp.getImage());

            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
        }
        return false;
    }

    public boolean DelProduct(String idSp) {
        String query = "DELETE FROM SanPham WHERE idSp='" + idSp + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public void AddProduct(Product sp) {
        String query = "Insert into SanPham values (?,?,?,?,?,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, sp.getIdSp());
            ps.setString(2, sp.getTenSp());
            ps.setFloat(3, sp.getDongia());
            ps.setString(4, sp.getIdLoaiHang());
            ps.setString(5, sp.getImage());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void AddAdmin(String username, String password) {
        String query = "insert into  Login values (?, ?,1)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public boolean DelLogin(String username) {
        String query = "DELETE FROM Login WHERE Username='" + username + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean DelAccount(String username) {
        String query = "DELETE FROM Customer WHERE Username='" + username + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean UpdateAccount(String username, Customer acc) {
        String query = "Update Customer set email=?,tenKhach=?,sdt=?,diachi=? where Username='" + username + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, acc.getEmail());
            ps.setString(2, acc.getTenKhach());
            ps.setString(3, acc.getSdt());
            ps.setString(4, acc.getDiachi());

            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
        }
        return false;
    }
    public List<Order> allListOrder(int tt) {
        List<Order> list = new ArrayList<>();
        String query = "select * from DonHang where TrangThai = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, tt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Contact> allListContacts() {
        List<Contact> list = new ArrayList<>();
        String query = "select * from Contact  ORDER BY idContact DESC";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Contact(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public boolean UpContact(int idContact) {
        String query = "Update Contact set TrangThai=1 where idContact='" + idContact + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);

            return ps.executeUpdate() >0;
        } catch (Exception ex) {
        }
        return false;
    }
    public void ActiveDonHang(int idDH) {
        String query = "Update DonHang set TrangThai=2 where idDonHang=  '" + idDH + "' " ;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }
    
}
