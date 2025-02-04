package com.agibank.ExercicioVetores0302;

//todo
//Fazer um vetor com valores tamanho 5;
// Fazer a formula de variação

public class ExercicioVetoresVariacaoPreco {

    public static void main(String[] args) {

    // cria um vetor com os valores fixos
    double[] precos = {100.0, 101.5, 99.0, 102.0, 105.0};

    //cria um novo vetor vazio para armazenar as variações - 1, porque a variação de valores do dia
        // é dia 1 -> dia 2
        // dia 2 -> dia 3
        // dia 3 ->  dia 4
        // dia 4 -> dia 5 então teremos 4 variações.

    double[] variacoes = new double[precos.length - 1];

    for (int i = 1; i < precos.length; i++) {
        variacoes[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;

        }
        System.out.println("Variações diárias:");
           for (int i = 0; i < variacoes.length; i++) {
                System.out.printf("%.2f%%\n", variacoes[i]);
            }
        }

}