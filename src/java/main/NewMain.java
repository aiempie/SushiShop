/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DAO;
import dao.adminDao;
import entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quanglam
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAO dao = new DAO();
        adminDao ad = new adminDao();
        List<Order> ls = ad.allListOrder(1);
        System.out.println(ls.get(0).getTrangThai());
    }

}
