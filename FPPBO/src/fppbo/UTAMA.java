/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppbo;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class UTAMA {
    int pilihan;
    public Scanner inputan;
    public UTAMA(){
        this.inputan = new Scanner(System.in);
        
        System.out.println("\n1. Profil\n2. Menu");
        System.out.print("Masukkan Pilihan : ");
        this.pilihan = inputan.nextInt();
    }
    int kembali(){
        return pilihan;
    }
}
