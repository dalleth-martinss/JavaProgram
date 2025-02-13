package com.agibank.Metodos1202;

//todo

public class ExercicioMetodoMediaMovelDeAtivo1202 {

    public static void main(String[] args) {
        double[] valoresS = {140.90, 150.90, 210.90, 110.90,250.0,230.90, 30.90}; // 7 posiçoes
        int intervaloy = 3;

        double[] medias = calcularMedia(valoresS, intervaloy);
        System.out.printf(" %.4f", medias );
    }

    public  static double[] calcularMedia(double [] valoresS, int intevaloy){
        int novoVetValores = valoresS.length - intevaloy + 1 ; // numero de grupos de intervalos
        double[] mediasx = new double[novoVetValores];


        for (int i = 0; i <novoVetValores; i++) {
            double soma = 0;
            for (int j = 0; j <intevaloy ; j++) {
                soma +=  valoresS[i+j];
            }

            mediasx[i] = soma/ intervaloy;
        }
        return mediasx;
    }
}



