package com.agibank.AtividadeAvaliativa3101;

import java.lang.Math;
import java.util.Scanner;
//DEV: Dalleth
/*Tester: Tulio Jacinto
    Nota: 10
*/

// toda operação de SENO COSENO requer parametros em RADIANOS.
public class MaratonaCalculoTrajetoria {

    public static void main(String[] args) {
       double gravidade = 9.8; // aceleração da gravidade em m/s^2
        double tempoCadaSegundo = 0; // tempos em segundos a cada interação do while vai ser incrementado 0,01
        double intervalo = 0.01;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Ângulo: ");
        double angulo = scanner.nextDouble();
        double teta = Math.toRadians(angulo); // O teta é o ângulo que está sendo convertido em radianos

        System.out.println("Digite uma Velocidade por segundo: ");
        double velocidade = scanner.nextDouble(); // velocidade inicial em m/s

        System.out.printf("Teta: %.2f radianos, Velocidade inicial: %.2f m/s%n", teta, velocidade);
        System.out.println("Listagem de coordenadas (x, y):");

        //Enquanto for vrdd, esse trecho vai rodar, calculando as coordenadas
        while (true) {
            double x = velocidade * Math.cos(teta) * tempoCadaSegundo;
            double y = (velocidade * Math.sin(teta) * tempoCadaSegundo) - (0.5 * gravidade * tempoCadaSegundo * tempoCadaSegundo);
            if (y < 0) {
                break;
            }

            System.out.printf("tempo = %.2f coordenadas -> (%.2f, %.2f)%n", tempoCadaSegundo, x, y);

            tempoCadaSegundo = tempoCadaSegundo + intervalo;
        }
    }
}