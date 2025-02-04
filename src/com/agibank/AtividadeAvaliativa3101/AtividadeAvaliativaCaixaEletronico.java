package com.agibank.AtividadeAvaliativa3101;

import java.util.Scanner;


public class AtividadeAvaliativaCaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Saldo Inicial: R$ ");
        double saldo = scanner.nextDouble();

        //Ele vai repetir até a conta zerar
        while (true) {
            System.out.print("Digite o valor do saque: ");
            double saque = scanner.nextDouble();

                //verifica se o valor é menor que zero
            if (saque < 0) {
                System.out.println("Programa encerrado. Valor de saque negativo inserido.");
                break;
            }
                //verifica se o saque é maior que saldo
            if (saque > saldo) {
                System.out.println("Erro: saldo insuficiente!");
            } else {
                saldo -= saque;
                if (saldo == 0) {
                    System.out.println("Saldo zerado! Conta vazia.");
                    break;
                } else {
                    System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                }
            }
        }
        scanner.close();
    }
}


