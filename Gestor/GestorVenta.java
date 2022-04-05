package Gestor;

import java.util.Scanner;

public class GestorVenta {
    public static void vender(){
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion != 3) {
            menu();
            eleccion = teclado.nextInt();

            switch (eleccion) {

                case 1:

                    break;
                case 2:

                    break;

                default:
                    System.out.println("\nOpcion no valida\n");
                    break;
            }
        }
        System.out.println("Saliendo . . .");

    }




    private static void menu(){
        System.out.println("\nQue deseas comprar: \n" );
        System.out.println("1. Un modulo individual");
        System.out.println("2. Un kit (Varios modulos)");
        System.out.println("3. Salir\n");
    }
}