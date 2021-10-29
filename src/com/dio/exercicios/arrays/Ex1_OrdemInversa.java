package com.dio.exercicios.arrays;

/*
* Ordem Inversa:  Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
* */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] v ={8, 6, 9, 45, 27};


        for (int i = v.length -1; i >= 0; i--)
            System.out.print(v[i] + " ");

    }
}
