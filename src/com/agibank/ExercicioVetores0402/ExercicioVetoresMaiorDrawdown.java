package com.agibank.ExercicioVetores0402;

//todo

public class ExercicioVetoresMaiorDrawdown {

    public static void main(String[] args) {
        double[] precos = {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0, 103.0};
        double picoMaximoAnterior = precos[0];
        double maiorDrawdown = 0.0;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > picoMaximoAnterior) {
                picoMaximoAnterior = precos[i];
            } else {
                double drawdown = ((precos[i] - picoMaximoAnterior) / picoMaximoAnterior) * 100;
                if (drawdown < maiorDrawdown) {
                    maiorDrawdown = drawdown;
                }
            }
        }

        System.out.printf("Maior Drawdown: %.2f%%%n", maiorDrawdown);
    }

}
