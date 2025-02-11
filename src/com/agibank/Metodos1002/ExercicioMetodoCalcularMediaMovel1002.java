package com.agibank.Metodos1002;

//todo

public class ExercicioMetodoCalcularMediaMovel1002 {

    public static void main(String[] args) {

        double[] valores = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 3;

        double[] medias =  calcularMediaMovel(valores, intervalo);

        System.out.printf(" Medias moveis: " );
        for (int i = 0; i < medias.length; i++) {
            System.out.printf(" %.2f",medias[i]);
            if (i < medias.length){
                System.out.printf(" , ");
            }
        }
    }
    public  static double[] calcularMediaMovel(double [] valores, int intervalo){
        int tamanhoResultado = valores.length - intervalo + 1;
        // é uma formula padrao para calcular numeros de intervalos (ou) medias moveis, que podemos obter de dentro de um array de tamanho k
        double[] medias = new double[ tamanhoResultado];
        //O for do 'i' vai calcular cada grupo de valores
        for (int i = 0; i < tamanhoResultado; i++) {
        //For do 'j' vai calcular cada valor de dentro do grupo; o 'i' só vai atualizar quando terminar de rodar o 'j'.
            double soma = 0;
            for (int j = 0; j < intervalo; j++) {
                soma += valores[i+j];
            }
           medias[i] = soma/ intervalo;
        }
        return medias;
    }
}



