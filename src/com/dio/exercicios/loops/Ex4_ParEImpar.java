package com.dio.exercicios.loops;
/*
* Par e Ímpar: Faça um programa que peça N números inteiros.
* Calcule e mostre a quantidade de números pares e a quantidade
* de números impares.*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int cont = 1;
        int numero;
        int impar = 0;
        int par = 0;

        System.out.println("Digite quantos números vc quer verificar: ");
        n = scan.nextInt();

        do {
            System.out.println("Digite um números");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                par++;
            else
                impar++;
            cont++;
        } while (cont <= n);

        System.out.println("Foram digitados " + par + " números pares");
        System.out.println("Foram digitados " + impar + " números impares");
    }
}
