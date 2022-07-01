/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jajimenez
 */
public class Main {

    public static void main(String[] arga) {
        List<Carta> deck = new ArrayList<>();
        String tipoCartas[] = {"corazon", "pika", "diamante", "trebol"};
        String comodines[] = {"J", "Q", "K", "A"};
        String color[] = {"rojo", "negro"};
        int cont = 0;
        for (int i = 0; i < tipoCartas.length; i++) {
            Carta carta = new Carta();
            if (i % 2 == 0) {
                System.out.println("Color-->" + "rojo");
                carta.color = "rojo";
            } else {
                System.out.println("Color-->" + "negro");
                carta.color = "negro";
            }
            System.out.println("carta->" + tipoCartas[i]);
            for (int j = 2; j <= 14; j++) {
                if (j < 11) {
                    System.out.println("valor->" + j);
                    carta.valor = j + "";
                } else {
                    System.out.println("valor->" + comodines[cont]);
                    carta.valor = comodines[cont];
                    cont++;
                }
                deck.add(carta);
            }
            cont = 0;

        }

        System.out.println("Tamaño deck-->" + deck.size());
    }

}
