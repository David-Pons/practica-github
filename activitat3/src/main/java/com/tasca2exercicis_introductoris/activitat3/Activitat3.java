/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tasca2exercicis_introductoris.activitat3;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;


public class Activitat3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notasIngresadas = 0;
        int aprobados = 0;
        int puedenAprobar = 0;
        int noAprobados = 0;

        while (notasIngresadas < 6) {
            System.out.print("Ingresa la nota " + (notasIngresadas + 1) + ": ");
            int nota = scanner.nextInt();
            notasIngresadas++;

            if (nota >= 4 && nota < 5) {
                puedenAprobar++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                noAprobados++;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos que pueden aprobar: " + puedenAprobar);
        System.out.println("Alumnos no aprobados: " + noAprobados);
    }
}
