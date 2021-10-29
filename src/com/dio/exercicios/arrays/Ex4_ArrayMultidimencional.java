package com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                matriz[l][c] = random.nextInt(9);
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println("\n");
        }
    }
}
