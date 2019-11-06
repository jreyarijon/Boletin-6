/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_1;

/**
 *
 * @author jreyarijon
 */
public class Numero {

    private int num;

    public Numero() {

    }

    public Numero(int n) {
        num = n;
    }

    public void setNum(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    public void amosar(int num) {
        if (num > 0) {
            System.out.println("é positivo");
        }
    }

    @Override
    public String toString() {
        return "numero :" + num;
    }

}
