package com.company;

public class Pessoa {
    String nome;
    int idade;
    String cnh;
    //String dirigir, dormir, comer;


    public Pessoa(String nome, int idade, String cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void dirigir() {
        System.out.println("Pessoa dirigindo");
    }

    public void comer() {
        System.out.println("Pessoa comendo");
    }

    public void dormir() {
        System.out.println("Pessoa dormindo");
    }
}
