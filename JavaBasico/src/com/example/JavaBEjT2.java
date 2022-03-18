package com.example;

import java.util.Scanner;

public class JavaBEjT2 {
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static int precioIva(int p, int i){
        int resultado = p + p * i / 100;
        return resultado;
    };

    public static void main(String[] args) {
        System.out.println("Introduzca el precio:");
        Scanner input = new Scanner(System.in);
        int precio = input.nextInt();
        int iva = 15;
        System.out.println("Precio con IVA: " + precioIva(precio, iva));
    }

}
