package com.agibank.Metodos1102;

//todo

public class ExercicioMetodoDesvioPadrão1102 {

    public static void main(String[] args) {
        double[] valores = {0.01, 0.02, -0.01, 0.03, -0.02};
        double desvioPadraoResult =  calcularDesvioPadrao(valores);
        System.out.printf(" %.4f", desvioPadraoResult);
    }
    public  static double calcularDesvioPadrao(double[] valores){
        double formulaDiferencaEAoQuadrado = 0;
        double result = 0;
                
        for (int i = 0; i < valores.length ; i++) {
             formulaDiferencaEAoQuadrado += Math.pow (valores[i] - calcularMedia(valores),2);
            double div = formulaDiferencaEAoQuadrado /valores.length ;  // divisão da soma da diferença do quadrado.
            result = Math.sqrt(div);  // raiz quadrada do resultado;
        }
        return  result;
    }
    public  static double calcularMedia(double [] valores){
        double resultMedia = 0;
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma +=  valores[i];
            resultMedia = soma / valores.length;
        }
        return resultMedia;
    }
}



