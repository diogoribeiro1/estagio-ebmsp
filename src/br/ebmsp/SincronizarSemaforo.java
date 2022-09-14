package br.ebmsp;

import java.util.Scanner;

public class SincronizarSemaforo {
    public static void main(String[] args) {

        // declaracao de variaveis
        Scanner sc = new Scanner(System.in);

        double
                distanciaSemaforo,
                velocidadeFinal,
                aceleracaoCarro,
                tempoVelocidadeFinal,
                distanciaPercorridaVelocidadeFinal,
                distanciaNaVelocidadeConstante,
                tempoTotal,
                tempoVelocidadeCostante;

        System.out.println("Informe a distancia em metros desde o semaforo anterior: ");

        // Obtendo distancia entre os semafors
        distanciaSemaforo = sc.nextDouble();

        System.out.println("Informe a velocidade em km/h (quilômetro por hora) permitida da via: ");

        //Obtendo velocidade final permitida
        velocidadeFinal = sc.nextDouble();

        //Transformado a velocidade de Km/h para m/s
        velocidadeFinal = velocidadeFinal / 3.6;

        System.out.println("Informe a aceleração em m/s (metros por segundo) típica dos carros: ");

        //obtendo acelaracao do carro
        aceleracaoCarro = sc.nextDouble();

        // Descobrindo o tempo que o carro demora pra chegar na velocidade Final
        tempoVelocidadeFinal = velocidadeFinal / aceleracaoCarro ;

        // Descobrindo  a distancia percorrida ate atingir a velocidade final
        distanciaPercorridaVelocidadeFinal = (aceleracaoCarro	* (tempoVelocidadeFinal * tempoVelocidadeFinal)) / 2;

        // Descobrindo a distancia que o carro percorre na velocidade constante
        distanciaNaVelocidadeConstante = distanciaSemaforo - distanciaPercorridaVelocidadeFinal;

        // Descobrindo o tempo na velocidade constante
        tempoVelocidadeCostante = distanciaNaVelocidadeConstante / tempoVelocidadeFinal;

        // Descobrindo o tempo total que o carro leva pra chegar no semaforo
        tempoTotal = tempoVelocidadeCostante + tempoVelocidadeFinal ;

        // Diminuindo o tempo por 3 segundos
        tempoTotal -= 3;

        System.out.println("Tempo que o proximo semaforo deve abrir: " + tempoTotal   + " segundos");

        sc.close();
    }
}
