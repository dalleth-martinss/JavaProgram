package com.agibank.Metodos1002;

//todo

public class ExercicioMetodoComprarAtivos1002 {

    public static void main(String[] args) {
        double ativo1 = 5.0;
        double ativo2 = 4.5;
        String resultado =  comprarAtivos(ativo1, ativo2);
        System.out.println(resultado+"%");
    }
    public  static String comprarAtivos(double ativo1, double ativo2){
          String result =  ativo1 > ativo2 ? " Ativo com maior retorno é: " + ativo1 : " Ativo com maior retorno é: " + ativo2;
        return result ;
    }
}



