package com.agibank.ExercicioVetores0402;

//todo

public class ExercicioVetoresCalculoImposto {

    public static void main(String[] args) {
        double[] precosCompra = {10000.0, 8000.0, 12000.0, 7000.0, 15000.0};
        double[] precosVenda = {12000.0, 8500.0, 14000.0, 7200.0, 18000.0};
        double lucroTotal = 0.0;

        // Calculando o lucro ou perda de cada ativo e exibindo o lucro de cada um
        System.out.println("Lucro ou Perda de cada ativo:");
        for (int i = 0; i < precosCompra.length; i++) {
            double lucroOuPerda = precosVenda[i] - precosCompra[i];
            lucroTotal += lucroOuPerda;
            System.out.printf("Ativo %d: Lucro/Perda = R$ %.2f%n", i + 1, lucroOuPerda);
        }

        System.out.printf("%nLucro total: R$ %.2f%n", lucroTotal);

        // Verificando se o lucro total ultrapassa R$ 20.000,00 e calculando o imposto
        if (lucroTotal > 20000.0) {
            double lucroExcedente = lucroTotal - 20000.0;
            double imposto = lucroExcedente * 0.15;
            System.out.printf("Lucro excedente: R$ %.2f%n", lucroExcedente);
            System.out.printf("Imposto devido: R$ %.2f%n", imposto);
        } else {
            System.out.println("Sem imposto devido.");
        }
    }
}


