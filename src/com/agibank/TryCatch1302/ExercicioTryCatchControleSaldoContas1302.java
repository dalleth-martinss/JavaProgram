package com.agibank.TryCatch1302;

import java.util.Scanner;

public class ExercicioTryCatchControleSaldoContas1302 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número do índice para ver sua conta (1 a 4): ");

        // Exibição do menu com as opções de conta
        System.out.println(" ╔══════════════════════╗");
        System.out.println(" ║ Conta no índice:     ║");
        System.out.println(" ║ Índice: 1 - conta    ║");
        System.out.println(" ║ Índice: 2 - conta    ║");
        System.out.println(" ║ Índice: 3 - conta    ║");
        System.out.println(" ║ Índice: 4 - conta    ║");
        System.out.println(" ╚══════════════════════╝");

        // Lê o índice da conta
        int indice = -1;
        double saldo = 0;

        try {
            // Lê o índice digitado pelo usuário
            indice = scanner.nextInt();

            // Verifica se o índice está dentro do intervalo correto
            if (indice < 1 || indice > 4) {
                System.out.println("Índice inválido! Por favor, escolha um índice entre 1 e 4.");
                return;
            }

            // Cria o array com os salários
            double[] salarios = {1200, 1300, 1400, 2345};

            // Acessa o salário com base no índice (ajustando para índice 0)
            saldo = salarios[indice - 1]; // O índice 1 corresponde à posição 0 no array, e assim por diante

            // Exibe o saldo da conta selecionada
            System.out.println("Saldo da conta " + indice + ": R$ " + saldo);
        } catch (Exception e) {
            System.out.println("Erro! Por favor, digite um número válido.");
        } finally {
            // Fecha o scanner para evitar vazamento de recursos
            scanner.close();
        }
    }
}
