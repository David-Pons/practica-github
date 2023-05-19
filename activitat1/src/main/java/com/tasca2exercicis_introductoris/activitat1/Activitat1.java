/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tasca2exercicis_introductoris.activitat1;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Activitat1 {

    public static void main(String[] args) {
        int numero1 = 0;
        while (numero1 > 10 && numero1 < 0);
        System.out.println("Introdueix un numero entre 1 i 10");
        int resultat1 = 0;
        int resultat2 = 0;
        int resultat3 = 0;
        int resultat4 = 0;
        int resultat5 = 0;
        int resultat6 = 0;  
        int resultat7 = 0;
        int resultat8 = 0;
        int resultat9 = 0;
        int resultat10 = 0;
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        if (0 > numero1){
        System.out.println("Es número que ha introduit no esta entre 1 i 10");
        }
        if (10 < numero1){
        System.out.println("Es número que ha introduit no esta entre 1 i 10");
        } 
        if (1 <= numero1 && 10 >= numero1){
        resultat1 = numero1 * 1;
        resultat2 = numero1 * 2;
        resultat3 = numero1 * 3;
        resultat4 = numero1 * 4;
        resultat5 = numero1 * 5;
        resultat6 = numero1 * 6;
        resultat7 = numero1 * 7;
        resultat8 = numero1 * 8;
        resultat9 = numero1 * 9;
        resultat10 = numero1 * 10;
        System.out.println("Es seu número multiplicat per 1 és " +resultat1);
        System.out.println("Es seu número multiplicat per 2 és " +resultat2);
        System.out.println("Es seu número multiplicat per 3 és " +resultat3);
        System.out.println("Es seu número multiplicat per 4 és " +resultat4);
        System.out.println("Es seu número multiplicat per 5 és " +resultat5);
        System.out.println("Es seu número multiplicat per 6 és " +resultat6);
        System.out.println("Es seu número multiplicat per 7 és " +resultat7);
        System.out.println("Es seu número multiplicat per 8 és " +resultat8);
        System.out.println("Es seu número multiplicat per 9 és " +resultat9);
        System.out.println("Es seu número multiplicat per 10 és " +resultat10);

    }
    }
}
