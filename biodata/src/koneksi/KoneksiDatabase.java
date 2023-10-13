/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author JUNIARGO
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
    Connection cn;
    public static Connection BukaKoneksi(){
        try{
            Class.forName   ("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/data_siswa","root","");
            return cn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database tidak tekoneksi");
            return  null;
        }
    }
}
