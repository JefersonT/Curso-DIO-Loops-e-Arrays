package com.dio.exercicios.loops;

/*
* Fatorial:  Faça um programa que calcule o fatorial de um
* número inteiro fornecido pelo usuário.
* Ex.: 5!=5.4.3.2.1=120
* */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor digite o número que deseja fatorar");
        long num = scan.nextInt();

        for (long fat = num - 1;fat >= 1; fat--)
            num *= fat;

        System.out.println("Fatorial é: "+ num);
    }
}
