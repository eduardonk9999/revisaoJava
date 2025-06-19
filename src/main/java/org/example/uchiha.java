package org.example;


// Herança
public class uchiha extends ninja{


    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    // Polimorfismo, trabalhar com o mesmo trecho de código
    // para trabalhar com dois objetos ou mais ao mesmo tempo.
    // Override coloco o polimorfismo pra funcionar.
    @Override
    public void ataqueBase() {
        System.out.println("Taquei uma Kunai do elmento fogo");
    }

}
