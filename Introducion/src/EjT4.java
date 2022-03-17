public class EjT4 {

    public static void main(String[] args) {
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = 4;
        if ( numeroIf > 0) {
            System.out.println("Numero " + numeroIf + " es positivo");
        } else if ( numeroIf < 0) {
            System.out.println("Numero " + numeroIf + " es negativo");
        } else {
            System.out.println("Numero es 0");
        }

        // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a
        // 3, el bloque de código que tendrá el bucle deberá:
        // Incrementar el valor de la variable en uno cada vez que se ejecute.
        // Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("While " + numeroWhile);
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una
        // vez.
        do {
            System.out.println("Do While " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
        // la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
        // mostrarse por pantalla.
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("For " + numeroFor);
        }
        // Por último, para el Switch, deberás crear la variable estacion, y distintos *case* para las cuatro
        // estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
        // informando de la estación en la que está. También habrá que poner un default para cuando el valor de la
        // variable no sea una estación.
        var estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("Estacion es " + estacion);
                break;
            case "primavera":
                System.out.println("Estacion es " + estacion);
                break;
            case "verano":
                System.out.println("Estacion es " + estacion);
                break;
            case "otoño":
                System.out.println("Estacion es " + estacion);
                break;
            default:
                System.out.println("Esperado por nombre de estacion");
        }
    }
}
