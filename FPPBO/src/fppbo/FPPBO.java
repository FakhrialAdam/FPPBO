/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppbo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Samsung
 */
public class FPPBO {
    public static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    public static final String url ="jdbc:mysql://localhost/akun";
    public static final String user="root";
    public static final String pass="";
    
    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;
    
    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader input = new BufferedReader(inputStreamReader);
    
    public static int hargadibayar;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here

        boolean menu=true,loginwoi=true;
        

            try {
                Class.forName(JDBC_Driver);
                con =DriverManager.getConnection(url,user,pass);
                stm = con.createStatement();
                String sql;
                while(loginwoi){
                    AKUN akun = new AKUN();
                    switch(akun.kembali()){
                        case 1 : {
                            Koneksi login = new Koneksi();

                            sql = "SELECT * FROM pengguna WHERE ID='"+login.ID+"' AND pass='"+login.pass+"'";
                            rs = stm.executeQuery(sql);

                            if(rs.next()){
                                System.out.println("Berhasil Masuk");
                                System.out.println("\n_______________[ TRIP_and_TRAVEL__AERENISA ]_______________");
                                System.out.println("                _Solusi_Perjalanan_Anda_");

                                while(menu){
                                    UTAMA menuutama = new UTAMA();
                                    switch (menuutama.kembali()){
                                        case 1 : {
                                            sql = "SELECT * FROM profil WHERE username='"+login.ID+"'";
                                            rs = stm.executeQuery(sql);

                                            if(rs.next()){
                                                System.out.println("-----PROFIL ANDA-----");
                                                System.out.println("\nNo. KTP   : "+rs.getString("NIK"));
                                                System.out.println("\nNama      : "+rs.getString("nama"));
                                                System.out.println("\nAlamat    : "+rs.getString("alamat"));
                                                System.out.println("\nEmail     : "+rs.getString("email"));
                                                System.out.println("\nNo. HP    : "+rs.getString("no_hp"));

                                            }
                                            break;
                                        }
                                        case 2 : {
                                            PESAN pesan = new PESAN();
                                            switch (pesan.Kembali()) {
                                                case 1 : {
                                                    System.out.println("\nDaftar Traveling Wisata Yang Tersedia");
                                                    for (int i = 1; i <= 41; i++) {
                                                        System.out.print("=");
                                                    }
                                                    System.out.println("\n|\tTempat  |  Lama |     Harga     |");
                                                    for (int i = 1; i <= 41; i++) {
                                                        System.out.print("-");
                                                    }
                                                    System.out.println();
                                                    for (int i = 1; i < pesan.wisata[0].length; i++) {
                                                        System.out.println("| "+i+". "+pesan.wisata[0][i]+"\t| "+pesan.wisata[1][i]+" | Rp."+pesan.wisata[2][i]+",- |");
                                                    }
                                                    for (int i = 1; i <= 41; i++) {
                                                        System.out.print("-");
                                                    }
                                                    WISATA wst = new WISATA();
                                                    System.out.println(wst.Tampilkan());
                                                    hargadibayar = wst.Total();
                                                    break;
                                                }
                                                case 2 : {
                                                    System.out.println("\n\t\t= Paket Tour Ziarah =");
                                                    for (int i = 1; i <= 56; i++) {
                                                        System.out.print("=");
                                                    }
                                                    System.out.println("\n|\t\tTempat  \t|  Lama |     Harga    |");
                                                    for (int i = 1; i <= 56; i++) {
                                                        System.out.print("-");
                                                    }System.out.println();
                                                    for (int i = 1; i < pesan.ziarah[0].length; i++) {
                                                        System.out.println("| "+i+". "+pesan.ziarah[0][i]+" \t| "+pesan.ziarah[1][i]+" | Rp."+pesan.ziarah[2][i]+",- |");
                                                    }
                                                    for (int i = 1; i <= 56; i++) {
                                                        System.out.print("-");
                                                    }
                                                    ZIARAH zrh = new ZIARAH();
                                                    System.out.println(zrh.Tampilkan());
                                                    hargadibayar = zrh.Total();
                                                    break;
                                                }
                                                case 3 : {
                                                    System.out.println("\nPilihan Tujuan Yang Tersedia");
                                                    for (int i = 1; i <= 29; i++) {
                                                        System.out.print("=");
                                                    }
                                                    System.out.println("\n|    Tempat    |   perhari   |");
                                                    for (int i = 1; i <= 29; i++) {
                                                        System.out.print("-");
                                                    }System.out.println();
                                                    for (int i = 1; i < pesan.custom[0].length; i++) {
                                                        System.out.println("| "+i+". "+pesan.custom[0][i]+"\t| Rp."+pesan.custom[1][i]+" |");
                                                    }
                                                    for (int i = 1; i <= 29; i++) {
                                                        System.out.print("-");
                                                    }
                                                    System.out.println("\n*nb : minimal pengambilan 3 hari dan 2 org.");
                                                    HARIAN hrn = new HARIAN();
                                                    System.out.println(hrn.Tampilkan());
                                                    hargadibayar = hrn.Total();
                                                    break;
                                                }
                                                default : {
                                                    System.out.println("Menu yang anda pilih tidak ada");
                                                    System.out.print("Masukan Menu Yng Tersedia : ");

                                                }
                                            }
                                            menu=false;
                                        }
                                    }
                                }
                                loginwoi=false;
                            }else{
                                System.out.println("Username atau Password Salah!");
                                loginwoi = true;
                            }
                            break;
                        }
                        case 2 : {
                            boolean gagal=true;
                            while(gagal){
                                System.out.println("-----PENDAFTARAN-----\n");
                                System.out.print("\nNama            : ");
                                String nama = input.readLine().trim();
                                System.out.print("\nNo. KTP         : ");
                                String NIK = input.readLine().trim();
                                System.out.print("\nAlamat          : ");
                                String alamat = input.readLine().trim();
                                System.out.print("\nEmail           : ");
                                String email = input.readLine().trim();
                                System.out.print("\nNo. Handphone   : ");
                                String no_hp = input.readLine().trim();
                                System.out.print("\nUsername        : ");
                                String username = input.readLine().trim();
                                System.out.print("\nPassword        : ");
                                String password = input.readLine().trim();

                                sql = "SELECT * FROM pengguna WHERE ID='"+username+"'";
                                rs = stm.executeQuery(sql);

                                if(rs.next()){
                                    System.out.println("Username sudah ada! Harap ganti!");
                                }else{
                                    sql = "INSERT INTO pengguna(ID, pass) VALUES ('%s','%s')";
                                    sql = String.format(sql, username, password);

                                    stm.execute(sql);

                                    sql = "INSERT INTO profil(NIK, nama, alamat, email, no_hp, username) VALUES ('%s','%s','%s','%s','%s','%s')";
                                    sql = String.format(sql, NIK, nama, alamat, email, no_hp, username);

                                    stm.execute(sql);
                                    
                                    gagal=false;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("koneksi gagal" +e.getMessage());
            }    
        BAYAR bayar = new BAYAR();
        System.out.println(bayar.Tampil());
        
        for (int i = 1; i <= 56; i++) {
                System.out.print("_");
            }

        System.out.println("\n         ---- TERIMAKASIH ----");
        System.out.println("       Selamat Ber-Traveling-ria");
        System.out.println("   Kepercayaan Anda, Kepuasan Bagi Kami");
        System.out.println("==========================================");
    }
    
}
