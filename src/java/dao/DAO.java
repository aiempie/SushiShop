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

/**
 *
 * @author quanglam
 */
public class DAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public User login(String username, String password) {
        try {
            String query = "select * from Login where Username = ? and Password= ?";
            
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                User A = new User(rs.getString(1), rs.getString(2), rs.getInt(3));
                return A;
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
    
    public User checkAccountExist(String user) {
        String query = "select * from Login where [Username]=?";
        
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3));
                
            }
            
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public void signup(String username, String password) {
        String query = "insert into  Login values (?, ?,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
    public int Register(Customer R) {
        try {
            String query = "insert into Customer ([Username],[email],[tenKhach],[sdt],[diachi]) values (?,?,?,?,?)";
            
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, R.getUsername());
            ps.setString(2, R.getEmail());
            ps.setString(3, R.getTenKhach());
            ps.setString(4, R.getSdt());
            ps.setString(5, R.getDiachi());
            
            return ps.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }
    
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from LoaiHang";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham\n"
                + "where idLoaiHang = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Customer getCusByUser(String Username) {
        String query = "SELECT *FROM Customer where Username = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, Username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
        
    }
    
    public Product getProductByIDSP(String idsp) {
        String query = "select * from SanPham\n"
                + "where idSp = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, idsp);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
        
    }
    
    public List<Product> SearchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from  SanPham where [tenSp] like ?";
        
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public int getTotalSanPham() {
        String query = "select count(*) from SanPham";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham\n"
                + "ORDER BY idSp\n"
                + "OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
            
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> muaNhieuNhat() {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham ORDER BY slmua DESC OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
            
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<DanhGia> yeuThichNhat() {
        List<DanhGia> list = new ArrayList<>();
        String query = "select * from DanhGia ORDER BY SoSao DESC OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhGia(rs.getString(1), rs.getInt(2), rs.getString(3),rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public boolean guiYeuCau(Contact c) {
        String query = "insert into  Contact values (?, ?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getName());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getRequest());
            ps.setBoolean(5, false);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    
    public List<Forum> loadForum(int index) {
        List<Forum> list = new ArrayList<>();
        String query = "select * from Forum ORDER BY idChat DESC OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Forum(rs.getString(2), rs.getString(3)));
            }
            
        } catch (Exception e) {
        }
        return list;
    }
    
    public boolean addChat(Forum c) {
        String query = "insert into Forum values (?, ?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getChat());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    
    public Order listOrder(String user) {
        
        String query = "select * from DonHang where TrangThai = 0 and Username = '" + user + "'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Order(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4));
            }
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public List<HoaDonChiTiet> getHdctByidDH(int iddh) {
        String query = "select * from HoaDonChiTiet where idDonHang = ?";
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, iddh);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new HoaDonChiTiet(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void addSpToCart(String idSp, int idDH) {
        String query = "insert into HoaDonChiTiet values (?,?,1)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, idDH);
            ps.setString(2, idSp);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void UpdateHDCT(String idSp, int sl, int idDH) {
        String query = "Update HoaDonChiTiet set soluong=? where idSp=  '" + idSp + "' and idDonHang=" + idDH;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, sl);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
        
    }

    public void delHDCTbyIdSP(String idSp, int idDH) {
        String query = "DELETE FROM HoaDonChiTiet WHERE idSp=? and idDonHang=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSp);
            ps.setInt(2, idDH);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }
    public DanhGia layDanhGia(String idSp) {
        String query = "select * from DanhGia where idSp=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, idSp);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new DanhGia(rs.getString(1), rs.getFloat(2), rs.getString(3),rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void UpDanhGia(String idSp, float sosao, String cmt, int luotDg) {
        String query = "Update DanhGia set SoSao=?, Comment=?, luotdanhgia=? where idSp=  '" + idSp + "' " ;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setFloat(1, sosao);
            ps.setString(2, cmt);
            ps.setInt(3, luotDg);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }
    public void AddDanhGia(String idSp, float sosao, String cmt, int luotDg) {
        String query = "insert into DanhGia values (?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, idSp);
            ps.setFloat(2, sosao);
            ps.setString(3, cmt);
            ps.setInt(4, luotDg);
             ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void UpDonHang(int idDH, String ghichu) {
        String query = "Update DonHang set TrangThai=1, GhiChu=? where idDonHang=  '" + idDH + "' " ;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ghichu);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }
    public void AddDonHang(String user) {
        String query = "insert into DonHang values (?,0,null)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
             ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public boolean UpCustom(String username,String tenKhach, String sdt, String diachi) {
        String query = "Update Customer set tenKhach=?,sdt=?,diachi=? where Username='" + username + "'";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenKhach);
            ps.setString(2, sdt);
            ps.setString(3, diachi);

            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
        }
        return false;
    }
    public Order searchOrderByID(int id) {
        String query = "select * from DonHang where idDonHang = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Order(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Product> getProductByDongia(float dongia) {
        List<Product> list = new ArrayList<>();
        String query = "select * from SanPham where dongia <= ? and idLoaiHang='d02'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setFloat(1, dongia);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
}
