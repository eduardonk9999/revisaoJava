package org.example;

import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        // Tipos primitivos
        //int idade = 753159852465;
        double altura = 1.83;
        Long numerosGrandes = 9999L;


        // Tipos não primitivos
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
         System.out.println(nomeUpperCase);

        mostreMeuNome(nome);


        // Laço de repedicao
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // OOP
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());
        naruto.temBiju = true;


        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        System.out.println(sasuke.getNome());
        sasuke.sharinganAtivado();
    }

    private static void mostreMeuNome(String nome) {
        System.out.println("Meu nome é " + nome);
    }


}