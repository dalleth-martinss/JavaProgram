package com.agibank.ExercicioVetores0402;

//todo

public class ExercicioVetoresDiasAltaQueda {
    public static void main(String[] args) {

        double[] precos = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0};
        int diasAlta = 0;
        int diasQueda = 0;
        // "length -1" vai => 1,2,3,4,5
        // E o indice vai =>  0,1,2,3,4
        // O "for" precisa rodar Até o tamanho do Indice. por isso fazemos length-1.
        //
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                diasAlta++;
            } else if (precos[i] < precos[i - 1]) {
                diasQueda++;
            }
        }

        System.out.println("Dias de alta: " + diasAlta);
        System.out.println("Dias de queda: " + diasQueda);
    }
}
