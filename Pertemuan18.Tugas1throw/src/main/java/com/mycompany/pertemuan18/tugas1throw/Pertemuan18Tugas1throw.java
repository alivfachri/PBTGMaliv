/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18.tugas1throw;

/**
 *
 * @author ASUS
 */
public class Pertemuan18Tugas1throw {

    public static void validate(int age){
        if (age < 17) {
            //throw Arithmetic exception jika eligible
            throw new ArithmeticException(
            "Orang ini Belum eligible untuk vote!!");
        }
        else{
            System.out.println(
            "Orang ini Sudah eligible untuk vote");
        }
    }
    //main method
    public static void main (String[] args) {
        //calling the fuction
        validate(13);
        System.out.println("rest of the code...");
    }
}