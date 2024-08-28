/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11.tugas1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Pertemuan11Tugas1 {

    public static void main(String[] args) {
     Scanner myInput = new Scanner(System.in);
     
     //input data karyawan
     System.out.println("Masukan ID Karyawan: ");
     String idKaryawan = myInput.nextLine();
     
     System.out.println("Masukan Nama Karyawan: ");
     String namaKaryawan = myInput.nextLine();
     
     System.out.println("Masukan Golongan: ");
     String golongan = myInput.nextLine();
     
     System.out.println("Masukan Jabatan: ");
     String Jabatan = myInput.nextLine();
     
     System.out.println("Masukan Gaji Pokok: ");
     double gajiPokok = myInput.nextDouble();
     
     //Membuat objek dengan data yang di input
     Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, Jabatan, gajiPokok);
     
     //Menampilkan data karyawan
     System.out.println("\nData Karyawan");
     karyawan.tampilkanData();
    }
}
