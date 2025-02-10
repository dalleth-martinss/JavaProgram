package com.agibank.Metodos1002;

//todo

public class ExercicioMetodoCalcularMediaMovel1002 {

    public static void main(String[] args) {

        double precoDia1 = 100.00;
        double precoDia2 = 105.0;

        double result = calcularCrescimento(precoDia1, precoDia2);
        System.out.printf(" Crescimento: %.1f%%", result );
    }
    public  static double calcularCrescimento(double precoDia1, double precoDia2){
        double formula = ((precoDia2 - precoDia1) / 100) *100;
        return formula;
    }
}


