/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppbo;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class HARIAN {
    String [][]custom = {{"","Bali","Lombok","Danau Toba","P.Komodo","Belitung"},
                         {"","525000","675000","720000","759000","473000"}};
    public Scanner input;
    String tujuan, lama;
    int pilihan, harga, tagihan,org,total,hari;
    float disc;
    boolean prs=true, day=true;
    
    public HARIAN(){
        this.input = new Scanner(System.in);
        System.out.print("\n Pilih Tujuan Daily Tour : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1 : {
                tujuan = custom[0][pilihan];
                harga = Integer.parseInt(custom[1][pilihan]);
                break;
            }
            case 2 : {
                tujuan = custom[0][pilihan];
                harga = Integer.parseInt(custom[1][pilihan]);
                break;
            }
            case 3 : {
                tujuan = custom[0][pilihan];
                harga = Integer.parseInt(custom[1][pilihan]);
                break;
            }
            case 4 : {
                tujuan = custom[0][pilihan];
                harga = Integer.parseInt(custom[1][pilihan]);
                break;
            }
            case 5 : {
                tujuan = custom[0][pilihan];
                harga = Integer.parseInt(custom[1][pilihan]);
                break;
            }
            default : System.out.println("Daily Tour tidak ada");
        }
        while (prs){
            System.out.print(" masukan jumlah org : ");
            org = input.nextInt();
            if(org < 2){
                System.out.println("minimal 2 org.");
                prs = true;
            }else{
                prs = false;
                }
            }
        while (day){
            System.out.print(" masukan jumlah Hari : ");
            hari = input.nextInt();
            if(hari < 3){
                System.out.println("minimal 3 Hari.");
                day = true;
            }else{
                day = false;
                }
            }
        tagihan = harga*hari*org;
    }
    
    public float Diskon(float disc){
        if (org <= 5){
            System.out.println(" diskon 5%");
            this.disc = (int) (tagihan*0.05);
        }else if (org <= 15){
            System.out.println(" diskon 10%");
            this.disc = (int) (tagihan*0.10);
        }else if (org <= 40){
            System.out.println(" diskon 20%");
            this.disc = (int) (tagihan*0.20);
        }else if (org >= 50){
            System.out.println(" diskon 25%");
            this.disc = (int) (tagihan*0.25);
            }
        return this.disc;
    }
    int Total(){
        this.total = (int) (tagihan - Diskon(disc));
        return this.total;
    }
    
    String Tampilkan(){
        System.out.println("\nRincian perjalanan Wisata anda");
        System.out.println("----------------------------------");
        System.out.println("Perjalanan       : "+tujuan);
        System.out.println("Lama perjalanan  : "+hari+" Hari");
        System.out.println("jumlah pembelian : "+org+" Kursi");
        System.out.println("Harga            : Rp."+harga+",-/org");
        System.out.println("Total harga      : Rp."+Total()+",-");
        
        return ("");
    }
}
