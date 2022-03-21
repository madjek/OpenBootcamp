package data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class JavaBEjT789 {

    public static void main(String[] args){

        //1. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar
        // "odnum aloh".
        System.out.print("1. ");
        String txt = "Hola Mundo";
        for (int i = (txt.length()-1); i >= 0; i--){
            System.out.print(txt.charAt(i));
        }
            System.out.println("");

        //2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.print("2. ");
        String[] unid = {"A", "r", "r", "a", "y"};
        for (String i : unid){
            System.out.print(i);
        }
            System.out.println("");

        //3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
        // ambas dimensiones.
        System.out.print("3. ");
        int[][] bid = {{1, 2, 3, 4}, {10, 20, 30, 40}};
        for (int i = 0; i < bid.length; i++){
            System.out.print("array:" + (i + 1) + " [ ");
            for(int j = 0; j < bid[i].length; j++){
                System.out.print("pos:" + j + " val:" + bid[i][j] + " ");
            }
            System.out.print("] ");
        }
        System.out.println("");

        //4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y
        // muestra el resultado final.
        System.out.print("4. ");
        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.print(vector);
        System.out.print(" - 2 y 3 = ");
        vector.subList(1,3).clear();
        System.out.print(vector);
        System.out.println("");

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
        // únicamente el valor de cada elemento.
        System.out.print("5. ");
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Element1");
        alist.add("Element2");
        alist.add("Element3");
        alist.add("Element4");
        LinkedList<String> lndlist = new LinkedList<String>(alist);
            System.out.print("ArrayList: ");
        for(String el : alist) {
            System.out.print(el + " ");
        }
            System.out.print(", ");
            System.out.print("LinkedList: ");
        for(String el : lndlist) {
            System.out.print(el + " ");
        }
        System.out.println("");

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
        // ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de
        // relleno.
        System.out.print("6. ");
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            intlist.add(i+1);
        }
        System.out.print(intlist);
        System.out.print(", Sin numeros pares: ");
        for (int i = 0; i < intlist.size(); i++ ) {
            if (intlist.get(i) % 2 == 0) {
                intlist.remove(i);
            }
        }
        System.out.print(intlist);
    }
}
