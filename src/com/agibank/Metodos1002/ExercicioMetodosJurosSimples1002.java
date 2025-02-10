package com.agibank.Metodos1002;

//todo

import java.util.Scanner;

public class ExercicioMetodosJurosSimples1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor de Capital Inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.println("Digite a quantidade de anos que você pretende investir ");
        int qntddAnos = scanner.nextInt();

        System.out.println("Digite o valor da taxa anual: ");
        double taxa = scanner.nextDouble();

       double result = calcularJurosSimples(capitalInicial,taxa, qntddAnos);
        System.out.printf("O valor do seu investimento até o presente ano é de : %.2f\n " , result);
    }
    public  static double calcularJurosSimples(double capitalInicial, double taxa, int qntddAnos){
        double formulaJurosSimples = capitalInicial * (1+taxa / 100  * qntddAnos);
        return formulaJurosSimples;
    }
}


