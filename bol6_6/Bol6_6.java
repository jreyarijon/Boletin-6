/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_6;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclee numero de vendas: ");
        int vendas = sc.nextInt();

        if (vendas <= 100) {
            System.out.println("Consumo baixo");
        } else if (vendas <= 500) {
            System.out.println("Consumo medio");
        } else if (vendas <= 1000) {
            System.out.println("Consumo alto");
        } else if (vendas > 1000) {
            System.out.println("Consumo de primerira necesidade");
        }

    }

}
