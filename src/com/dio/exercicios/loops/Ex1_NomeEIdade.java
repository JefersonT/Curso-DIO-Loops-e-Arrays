package com.dio.exercicios.loops;

/*
* Nome e Idade: Faça um programa que leia conjuntos de dois valores,
* o primeiro representando a matrícula do aluno e o segundo representando
* a sua altura em centímetros. (Pare o programa inserindo o valor 0 no campo nome)
* */

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;
        while (true){
            System.out.println("Favor digite o nome do aluno ou 0 (zero) para sair");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.println("Favor digite a idade do aluno");
            idade = scan.nextInt();
        }

    }
}
