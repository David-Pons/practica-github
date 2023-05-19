/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tasca2exercicis_introductoris.activitat2;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Activitat2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta = 's';
        
        while (resposta == 's' || resposta == 'S') {
            System.out.println("Introdueix un número per mostrar la seva taula de multiplicar:");
            int numero = sc.nextInt();
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            
            System.out.println("Vols mostrar una altra taula de multiplicar? (s/n)");
            resposta = sc.next().charAt(0);
        }
        
        System.out.println("Gràcies per utilitzar la nostra aplicació.");
    }
}
