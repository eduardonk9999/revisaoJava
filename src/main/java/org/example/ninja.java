package org.example;



// Classe é um molde para construir um objeto
public class ninja {
    private String nome;
    String aldeia;
    int idade;

    // Polimorfismo, trabalhar com o mesmo trecho de código
    // para trabalhar com dois objetos ou mais ao mesmo tempo.

    public void ataqueBase() {
        System.out.println("Taquei uma Kunai");
    }

    // Encapsulamento: Uma forma de blindar nossos objetos, para não usar eles de forma errada.
    // Por isso usamos o get e setrs


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
