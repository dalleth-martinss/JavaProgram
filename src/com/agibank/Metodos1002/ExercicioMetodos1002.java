package com.agibank.Metodos1002;

//todo

import java.util.Scanner;

public class ExercicioMetodos1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em real ");
        double valorEmReal = scanner.nextDouble();

        System.out.println(" Digite um valor em dolar");
        double valorEmDolar = scanner.nextDouble();

       double result = ConvertMoedas(valorEmReal, valorEmDolar);
        System.out.println(" Valores convertidos: " + result);
    }
    public  static double ConvertMoedas(double valorEmReal, double valorEmdolar){
        double valorConvertido = valorEmReal / valorEmdolar;
        return valorConvertido;
    }
}


