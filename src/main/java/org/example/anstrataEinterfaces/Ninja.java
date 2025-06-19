package org.example.anstrataEinterfaces;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Vamos obrigar o dev a istanciar esse metodo, toda vez que for
    // usar a classe Ninja
    public abstract void nomeDoNinja();
}
