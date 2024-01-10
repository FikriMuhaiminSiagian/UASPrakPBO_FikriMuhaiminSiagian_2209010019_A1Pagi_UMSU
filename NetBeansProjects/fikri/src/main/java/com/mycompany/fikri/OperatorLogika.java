/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fikri;

/**
 *
 * @author Fikri Muhaimin
 */
public class OperatorLogika {public static void main(String[] args) {
        int a = 16;
        int b = 24;
        int hasil;

        hasil = a & b;
        System.out.println("Hasil dari a & b : " + hasil);

        hasil = a | b;
        System.out.println("Hasil dari a | b : " + hasil);

        hasil = a ^ b;
        System.out.println("Hasil dari a ^ b : " + hasil);

        hasil = ~a;
        System.out.println("Hasil dari ~a : " + hasil);

        hasil = a << 2;
        System.out.println("Hasil dari a << 1 : " + hasil);

        hasil = a >> 1;
        System.out.println("Hasil dari a >> 1 : " + hasil);

        hasil = a >>> 2;
        System.out.println("Hasil dari a >>> 1 : " + hasil);
    
}}
