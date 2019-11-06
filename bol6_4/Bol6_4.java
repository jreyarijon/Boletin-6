/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_4;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa persoa1 = new Persoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclee nome: ");
        persoa1.setNome(sc.nextLine());
        System.out.println("Teclee peso: ");
        persoa1.setPeso(sc.nextFloat());

        Persoa persoa2 = new Persoa();

        System.out.println("Teclee nome: ");
        persoa2.setNome(sc.next());
        System.out.println("Teclee peso: ");
        persoa2.setPeso(sc.nextFloat());

        if (persoa1.getPeso() < persoa2.getPeso()) {
            System.out.println(persoa2.getNome() + " pesa máis que " + persoa1.getNome() + "\nDiferencia de peso: " + (persoa2.getPeso() - persoa1.getPeso()));
        } else {
            System.out.println(persoa1.getNome() + " pesa máis que " + persoa2.getNome() + "\nDiferencia de peso: " + (persoa1.getPeso() - persoa2.getPeso()));
        }

    }

}
