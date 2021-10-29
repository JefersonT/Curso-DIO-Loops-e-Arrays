package com.dio.exercicios.arrays;

/*
* Consoantes:  Faça um Programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas. Imprima as consoantes.
* */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] palavra = new String[6];
        int consoates = 0;

        for (int i = 0; i < palavra.length; i++) {
            System.out.println("digite a " + i +"ª letra: ");
            palavra[i] = scan.next();
            if (!(palavra[i].equalsIgnoreCase("a") ||
                    palavra[i].equalsIgnoreCase("e") ||
                    palavra[i].equalsIgnoreCase("i") ||
                    palavra[i].equalsIgnoreCase("o") ||
                    palavra[i].equalsIgnoreCase("u"))){
                consoates++;
            }
        }

        System.out.println("Qtd Consoantes: " + consoates);
        for (String letra : palavra) {
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")))
                System.out.print(letra + " ");
        }
    }
}
