package com.dio.exercicios.loops;

import java.util.Scanner;

/*
* Maior e Média: Faça um programa que leia 5 números e
* informe o maior número e a média desses números.
* */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;
        int cont = 0;

        do{
            System.out.println("digite um número inteiro:");
            numero = scan.nextInt();

            if (numero>maior)
                maior=numero;

            media += numero;
            cont++;

        } while (cont < 5);

        media /=5;

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números é: " + media);
    }
}
