package com.dio.exercicios.arrays;

/*
* Números Aleatórios:  Faça um Programa que leia 20
* números inteiros aleatórios (entre 0 e 100) armazene-os
* num vetor. Ao final, mostre os números e seus sucessores.
* */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosaleatorios = new int[20];

        for (int i = 0; i < numerosaleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosaleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios: ");
        for (int numero: numerosaleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores:");
        for (int numero: numerosaleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
