package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Creamos los arrays para los dos caracoles e instauramos la clase Random. Además iniciamos la variable de tiempo.
        int [] caracol_Shakira = new int [50];
        int [] caracol_Pique = new int [50];
        Random rd = new Random();
        caracol_Shakira[0] = 1;
        caracol_Pique[0] = 1;
        int tiempo = 0;
        System.out.println("Comienza la trepidante carrera de caracoles!");
        System.out.println("Los contrincantes son el caracol Pique y la caracola Shakira!");

        while (caracol_Shakira[49] == 0 && caracol_Pique[49] == 0) {
            tiempo++;
            // Avanzar cada caracol aleatoriamente
            for (int i = 0; i < 50; i++) {
                if (caracol_Shakira[i] != 0) {
                    int avanzar = rd.nextInt(3) + 1;
                    System.out.println("Shakira avanza " + avanzar + " cm.");
                    int nuevaPosicion = i + avanzar;
                    if (nuevaPosicion >= 50) {
                        caracol_Shakira[49] = 1;
                        break;
                    } else {
                        caracol_Shakira[nuevaPosicion] = caracol_Shakira[i];
                        caracol_Shakira[i] = 0;
                    }
                }
                if (caracol_Pique[i] != 0) {
                    int avanzar = rd.nextInt(3) + 1;
                    System.out.println("Pique avanza " + avanzar + " cm.");
                    int nuevaPosicion = i + avanzar;
                    if (nuevaPosicion >= 50) {
                        caracol_Pique[49] = 1;
                        break;
                    } else {
                        caracol_Pique[nuevaPosicion] = caracol_Pique[i];
                        caracol_Pique[i] = 0;
                    }
                }
            }
        }

        if (caracol_Shakira[49] == 1 && caracol_Pique[49]  == 1)
        {
            System.out.println("La carrera ha terminado en empate en " + tiempo + " minutos");
        }
        else if (caracol_Shakira[49]  == 1)
        {
            System.out.println("La ganadora es la caracola Shakira en " + tiempo + " minutos");
        }
        else
        {
            System.out.println("El ganador es el caracol Pique en " + tiempo + " minutos");
        }
    }
}
