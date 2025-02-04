package com.agibank.ExercicioVetores0302;

import java.util.Scanner;

public class ExercicioVetoresMaiorMenorPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10]; // Vetor para armazenar os preços
        int i = 0;

        // Entrada dos preços usando um loop while
        while (i < precos.length) {
            System.out.print("Digite o preço do dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            i++;
        }

        // Inicializa maior e menor com o primeiro valor do vetor
        double maior = precos[0];
        double menor = precos[0];
        i = 1; // Começa a comparação do segundo elemento em diante

        // Loop while para encontrar o maior e o menor valor
        while (i < precos.length) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
            if (precos[i] < menor) {
                menor = precos[i];
            }
            i++;
        }

        // Exibe os resultados
        System.out.println("Maior preço: " + maior);
        System.out.println("Menor preço: " + menor);

        scanner.close();
    }
}
