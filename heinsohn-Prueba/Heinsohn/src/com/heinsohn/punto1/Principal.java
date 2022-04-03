package com.heinsohn.punto1;

import punto2.NumeroMayor;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //punto1
            lista lista = new lista();
            Algoritmo algo = new Algoritmo();

            ArrayList<Integer>numeros=lista.Agregarlista();
            ArrayList<Integer>resultado;

            var sc = new Scanner(System.in);
            System.out.println("Ingrese las permutaciones ");
            int permutaciones = sc.nextInt();

            resultado= algo.ArmarNuevoVector(numeros,permutaciones);
            algo.imprimir(resultado);


    }
}
