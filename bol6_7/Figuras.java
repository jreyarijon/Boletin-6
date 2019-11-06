/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_7;

/**
 *
 * @author Josemolamazo
 */
public class Figuras {

    private int base;
    private int altura;
    private int radio;

    public Figuras() {

    }

    public Figuras(int b, int h, int r) {
        base = b;
        altura = h;
        radio = r;
    }

    public void setBase(int b) {
        base = b;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int h) {
        altura = h;
    }

    public int getAltura() {
        return altura;
    }

    public void setRadio(int r) {
        radio = r;
    }

    public int getRadio() {
        return radio;
    }

    public void areaCuadrado(int b) {
        base = b;
        System.out.println("Area del cuadrado = " + Math.pow(b, 2));
    }

    public void areaTriangulo(int b, int h) {
        base = b;
        altura = h;
        System.out.println("Área do triángulo = " + b * h / 2);
    }

    public void areaCirculo(int r) {
        radio = r;
        System.out.println("Área do círculo = " + Math.PI * Math.pow(r, 2));
    }
}
