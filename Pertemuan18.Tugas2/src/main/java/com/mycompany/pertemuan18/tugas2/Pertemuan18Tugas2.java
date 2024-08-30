/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18.tugas2;

/**
 *
 * @author ASUS
 */
public class Pertemuan18Tugas2 {

    public static void main(String[] args) {
       try {
           //bellow code do not throw any exception
           Float data=500f/ 15;
           System.out.println(data);
       }
       catch (NullPointerException e) {
           System.out.println(e);
       }
       finally {
           System.out.println("blok finally akan selalu di eksekusi ");
       }
    }
}
