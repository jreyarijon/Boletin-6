/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_7;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figuras menu = new Figuras();

        Scanner sc = new Scanner(System.in);

        System.out.println("Teclee tamaño da base: ");
        int b = sc.nextInt();
        System.out.println("Teclee tamaño da altura: ");
        int h = sc.nextInt();
        System.out.println("Teclee tamaño do radio: ");
        int r = sc.nextInt();

        System.out.println("Teclee a opción que quera utilizar: ");
        String opciones = sc.next();

        switch (opciones) {
            case "cuadrado":
                menu.areaCuadrado(b);
                break;
            case "triangulo":
                menu.areaTriangulo(b, h);
                break;
            case "circulo":
                menu.areaCirculo(r);
                break;
            default:
                System.out.println("Opción incorrecta");

        }

    }

}
