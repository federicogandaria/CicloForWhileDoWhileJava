
//1.Sé requiere un programa que pueda crear la tabla de multiplicar del número que
// el usuario indique por medio del ciclo FOR;
// esta debe ser impresa del 1 al 10.

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner teclea = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        var factor1 = teclea.nextInt();

        for (var factor2  = 1; factor2 <= 10;factor2++){
            var resultado = factor1*factor2;
            System.out.println(factor1 + "  x  " + factor2 + " =  " +resultado);

        }

    }
}
