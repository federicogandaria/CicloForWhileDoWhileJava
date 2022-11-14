import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var salir = false;
        int opcion;

        while (!salir){
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Opción 5");
            System.out.println("6. Opción 6");
            System.out.println("7. Salir");

            System.out.println("Introduce un número: ");
            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Esta es la opción 1");
                    break;
                case 2:
                    System.out.println("Esta es la opción 2");
                    break;
                case 3:
                    System.out.println("Esta es la opción 3");
                    break;
                case 4:
                    System.out.println("Esta es la opción 4");
                    break;
                case 5:
                    System.out.println("Esta es la opción 5");
                    break;
                case 6:
                    System.out.println("Esta es la opción 6");
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 7");
            }
        }

        System.out.println("Fin del menú");
    }
}
