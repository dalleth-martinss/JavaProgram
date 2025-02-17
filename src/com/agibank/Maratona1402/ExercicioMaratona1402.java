package com.agibank.Maratona1402;

import java.util.InputMismatchException;

public class ExercicioMaratona1402 {

    public static void main(String[] args) {
        try {
            // Simulando os preços das ações (matriz 4x4)
            double[][] precos = {
                    {1000, 1020, 1010, 1030}, // PETR4
                    {2000, 2025, 1990, 2050}, // VALE3
                    {3000, 3030, 2995, 3070}, // ITAU4
                    {4000, 4020, 3980, 4100}  // BB
            };

            // Exemplo de uso dos métodos
            System.out.println("Média PETR4: " + calcularMediaLinha(precos, 0));
            System.out.println("Dia de maior variação: " + calcularMaiorVariacao(precos));
            System.out.println("Valor de ITAU4 no dia 3: " + consultarValor(precos, 2, 2));

        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de formato nos dados inseridos.");
        }
    }

    public static double calcularMediaLinha(double[][] precos, int linha) {
        double soma = 0;
        for (int i = 0; i < precos[linha].length; i++) {
            soma += precos[linha][i];
        }
        return soma / precos[linha].length;
    }

    public static int calcularMaiorVariacao(double[][] precos) {
        int diaMaiorVariacao = 0;
        double maiorVariacao = 0;

        for (int acao = 0; acao < precos.length; acao++) {

            double variacaoDia = 0;

            for (int dia = 1; dia < precos[0].length; dia++) {
                variacaoDia += Math.abs(precos[acao][dia] - precos[acao][dia - 1]);
            }

            if (variacaoDia > maiorVariacao) {
                maiorVariacao = variacaoDia;
                diaMaiorVariacao = acao;
            }
        }
        return diaMaiorVariacao + 1;
    }

    public static double consultarValor(double[][] precos, int linha, int coluna) {
        return precos[linha][coluna];
    }

}
