/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_5;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclee numero a: ");
        a = sc.nextInt();
        System.out.println("Teclee numero b: ");
        b = sc.nextInt();
        System.out.println("Teclee numero c: ");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("a é o maior");
        }
        if ((b > a) && (b > c)) {
            System.out.println("b é o maior");
        }
        if ((c > a) && (c > b)) {
            System.out.println("c é o maior");
        }

    }

}
