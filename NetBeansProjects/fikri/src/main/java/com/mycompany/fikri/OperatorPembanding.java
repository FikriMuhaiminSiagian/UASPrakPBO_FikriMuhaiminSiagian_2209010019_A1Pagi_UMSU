/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fikri;

/**
 *
 * @author Fikri Muhaimin
 */
public class OperatorPembanding {
    public static void main(String[] args) {
        int a = 400;
        int b = 150;
        boolean hasil;

        hasil = a == b;
        System.out.println("Apakah a == b ? " + hasil);

        hasil = a != b;
        System.out.println("Apakah a != b ? " + hasil);

        hasil = a > b;
        System.out.println("Apakah a > b ? " + hasil);

        hasil = a < b;
        System.out.println("Apakah a < b ? " + hasil);

        hasil = a >= b;
        System.out.println("Apakah a >= b ? " + hasil);

        hasil = a <= b;
        System.out.println("Apakah a <= b ? " + hasil);
    }

}