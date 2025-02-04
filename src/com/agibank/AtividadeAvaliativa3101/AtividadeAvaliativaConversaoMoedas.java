package com.agibank.AtividadeAvaliativa3101;

import java.util.Scanner;
import java.util.Scanner;

public class AtividadeAvaliativaConversaoMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = 1000;
        double totalConvertido = 0;
        double taxaCambio = 5; // 1 USD = 5 BRL

        // Enquanto for verdadeiro, esse trecho vai rodar
        while (true) {
            System.out.print("Digite o valor em BRL a converter: ");
            double valor = scanner.nextDouble();

            // Verifica se o valor é negativo
            if (valor < 0) {
                System.out.println("Encerrando conversões. Valor negativo inserido.");
                break;
            }

            // Verifica se o valor limite foi ultrapassado
            if (totalConvertido + valor > limiteDiario) {
                System.out.printf("Erro: o limite diário de R$ %.2f foi ultrapassado! Encerrando conversões.%n", limiteDiario);
                break;
            }

            // Converte o valor para USD
            double valorUsd = valor / taxaCambio;
            System.out.printf("Você receberá: %.2f USD%n", valorUsd);

            // Atualiza o total convertido
            totalConvertido += valor;
        }

        scanner.close();
    }
}


