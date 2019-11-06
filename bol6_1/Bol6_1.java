/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_1;

import java.util.Scanner;



/**
 *
 * @author jreyarijon
 */
public class Bol6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Numero n = new Numero();
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Teclee o número: ");
        int num = sc.nextInt();
        
        n.amosar(num);
    }
    
}
