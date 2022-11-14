
//3. Con el ciclo Do-While solicitar un número y cuando se ingrese uno mayor que 500 debe detenerse, así que la condición
// para que se siga ejecutando es que el número sea menor a 500. Si para que se detenga,
// el número debe ser mayor a 500, entonces para seguirse ejecutando el número debe ser menor o igual a 500

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        do{

            System.out.println("Escribe un número");
            numero = sc.nextInt();


        }while ( (numero <= 500));
        System.out.println("Has escrito " +numero);
    }
}
