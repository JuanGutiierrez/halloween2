package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado =new Invitado();
        Fiesta objetoFiesta=new Fiesta();
        Lugar objetoLugar = new Lugar();

        System.out.println("FIESTA");
        System.out.print("1. Gastos de comida: $");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de alimetos fue: $"+objetoFiesta.getCostosAlimentos());
        System.out.print("2. Gastos de bebidas: $");
        objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
        System.out.println("El costo las bebidas fue: $"+objetoFiesta.getCostosBebidas());
        System.out.print("3. Gastos del lugar: $");
        objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
        System.out.println("El costo del lugar fue: $"+objetoFiesta.getCostosLugar());
        System.out.print("4. Gastos de equipos: $");
        objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de los equipos fue: $"+objetoFiesta.getCostosEquipos());




    }
}