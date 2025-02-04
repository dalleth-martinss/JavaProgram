package com.agibank.ExercicioVetores0302;


import java.util.Scanner;

public class ExercicioVetoresCrescimentoAcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5]; // Vetor para armazenar os valores das ações
        int i = 0;

        // Entrada dos valores usando um loop while
        while (i < valores.length) {
            System.out.print("Digite o valor da ação no dia " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            i++;
        }

        // Variáveis para calcular o crescimento acumulado
        double crescimentoAcumulado = 1.0;
        i = 1; // Começa no segundo dia, pois precisa comparar com o anterior

        // Loop while para calcular o crescimento percentual acumulado
        while (i < valores.length) {
            if (valores[i - 1] != 0) { // Evita divisão por zero
                double crescimentoDiario = (valores[i] - valores[i - 1]) / valores[i - 1];
                crescimentoAcumulado *= (1 + crescimentoDiario);
            }
            i++;
        }

        crescimentoAcumulado = (crescimentoAcumulado - 1) * 100; // Converte para percentual

        // Exibe o resultado
        System.out.printf("Crescimento percentual acumulado em 5 dias: %.2f%%\n", crescimentoAcumulado);

        scanner.close();
    }
}
