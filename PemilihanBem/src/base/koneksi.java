/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.sql.DriverManager;


public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/pemilihanbem";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}
    