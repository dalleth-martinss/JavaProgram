package com.agibank.ExercicioVetores0402;

//todo

public class ExercicioVetoresJurosComposto {

    public static void main(String[] args) {
        double valorInicial = 1000.0;
        double taxa = 0.02;
        int meses = 6;
        double[] valoresFuturos = new double[meses];

        // Calculando os valores futuros para cada mês
        for (int i = 0; i < meses; i++) {
            valoresFuturos[i] = valorInicial * Math.pow(1 + taxa, i + 1);
        }

        // Exibindo os valores futuros com um for normal
        System.out.print("Valores futuros: ");
        for (int i = 0; i < valoresFuturos.length; i++) {  // Usando índice para percorrer o vetor
            System.out.printf("%.2f ", valoresFuturos[i]);
        }
    }
}
