/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pertemuan18.tugas1throw;

/**
 *
 * @author ASUS
 */
public class Pertemuan18Tugas1throw {

    public static void validate(int age) {
        if (age < 17) {
            // throw ArithmeticException jika tidak eligible
            throw new ArithmeticException("Orang ini belum eligible untuk vote!!");
        } else {
            System.out.println("Orang ini sudah eligible untuk vote.");
        }
    }

    // main method
    public static void main(String[] args) {
        // calling the function
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code...");
    }
}
