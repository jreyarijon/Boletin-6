/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_4;

/**
 *
 * @author jreyarijon
 */
public class Persoa {

    private String nome;
    private float peso;

    public Persoa() {

    }

    public Persoa(String nome, float p) {
        this.nome = nome;
        peso = p;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(float p) {
        peso = p;
    }

    public float getPeso() {
        return peso;
    }

}
