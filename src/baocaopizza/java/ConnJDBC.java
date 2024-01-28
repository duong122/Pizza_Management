/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baocaopizza.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL INSPIRON 5625
 */
public class ConnJDBC {
    public static Connection getConnection() throws ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
+ "databaseName = PIZZA;encrypt =false;user=sa;password=hieudz01082003";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(connectionUrl);
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("loi 1");
        }
        return conn;
    }
    public static List<SanPham> findAll(){
        List<SanPham> SPList = new ArrayList<>();
        String query = "select * from SanPham";
        try{
            Connection conn = getConnection();
            Statement stml = conn.createStatement();
            ResultSet rs = stml.executeQuery(query);
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString("MaSP"), rs.getString("TenSP"), rs.getFloat("DonGia"), rs.getString("MoTa"), rs.getString("MaLoaiSP"));
                SPList.add(sp);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Loi 2");
        }
        return SPList;
    }
    public static void insert(SanPham sp){
        String query = "insert into SanPham(MaSP, TenSP, DonGia, Mota, MaLoaiSP) values(?,?,?,?,?)";
        try{
            Connection conn = getConnection();

            PreparedStatement pstm = conn.prepareStatement(query);
            System.out.println("xxxx");

            pstm.setString(1, sp.getMaSP());

            pstm.setString(2, sp.getTenSP());
            
            pstm.setFloat(3, sp.getDonGia());

            pstm.setString(4, sp.getMoTa());
            
            pstm.setString(5, sp.getMaLoaiSP());
                    
            pstm.execute();
        }
        catch(Exception e){
            System.out.println("qlypizza.connSql.insert()");
        }
    }
    public static void delete(SanPham sp){
//        String query = "delete from SanPham where MaSP ='"+sp.getMaSP()+"'";
        String query = "delete from SanPham where MaSP =?";
        try{
            Connection conn = getConnection();
            
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, sp.getMaSP());
            System.out.println("xxxx");
            
            pstm.executeUpdate();
        }
        catch(Exception e){
            System.out.println("qlypizza.connSql.delete()");
        }
    }
    public static void update(SanPham sp){
//        String query = "update SanPham set TenSP = ?, DonGia= ?, MoTa = ?, MaLoaiSP= ? where MaSP = '"+sp.getMaSP()+"'";
        String query = "update SanPham set TenSP = ?, DonGia= ?, MoTa = ?, MaLoaiSP= ? where MaSP = ?";
        try{
            Connection conn = getConnection();

            PreparedStatement pstm = conn.prepareStatement(query);
            System.out.println("xxxx");


            pstm.setString(5, sp.getMaSP());
    
            pstm.setString(1, sp.getTenSP());
            
            pstm.setFloat(2, sp.getDonGia());

            pstm.setString(3, sp.getMoTa());
            
            pstm.setString(4, sp.getMaLoaiSP());
            
            pstm.executeUpdate();
        }
        catch(Exception e){
            System.out.println("qlypizza.connSql.update()");
        }
    }
    public static List <SanPham> findbyID(SanPham s){
        List<SanPham> SPList = new ArrayList<>();
        String query = "select * from SanPham where SanPham.MaLoaiSP = '"+s.getMaLoaiSP()+"'";
        try{
            Connection conn = getConnection();
            Statement stml = conn.createStatement();
            ResultSet rs = stml.executeQuery(query);
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString("MaSP"), rs.getString("TenSP"), rs.getFloat("DonGia"), rs.getString("MoTa"), rs.getString("MaLoaiSP"));
                SPList.add(sp);
            }
            System.out.println("xxxx");

        }
        catch(Exception ex){
            System.out.println("qlypizza.connSql.findbyID()");
        }
        return SPList;
    }
}