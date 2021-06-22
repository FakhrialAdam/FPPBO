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
public class AKUN {
    int pilihan;
    public Scanner inputan;
    public AKUN(){
        this.inputan = new Scanner (System.in);
        System.out.println("\n1. Login\n2. Daftar");
        System.out.print("Masukkan pilihan : ");
        this.pilihan = inputan.nextInt();
    }
    int kembali(){
        return pilihan;
    }
}
