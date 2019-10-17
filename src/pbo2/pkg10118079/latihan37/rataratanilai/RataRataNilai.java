/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan37.rataratanilai;

import java.util.Scanner;

/**
 * 
 * @author  
 * NAMA     : Wiarnto
 * KELAS    : IF-2
 * NIM      : 10118079
 */
public class RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setJmlMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getJmlMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " +
                mahasiswa.hitungRataRata());
        
        System.out.println("Developed by : Wiranto");
    }
    
}
