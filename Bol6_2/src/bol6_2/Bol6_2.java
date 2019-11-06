/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_2;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclee 1º número: ");
        num1 = sc.nextShort();
        System.out.println("Teclee 2º número: ");
        num2 = sc.nextShort();

        if (num1 >= num2) {
            System.out.println("Resta: " + (num1 - num2));
        }

        System.out.println("Suma: " + (num1 + num2));

    }

}
