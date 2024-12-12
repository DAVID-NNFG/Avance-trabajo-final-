package Views;

import java.util.Scanner;

import controller.ejercicios.Cifrado;
import controller.ejercicios.Decifrado;

public class grupal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int op = 0;
        do {
            System.out.println("1 CODIFICAR MENSAJE ");
            System.out.println("2 DECODIFICAR MENSAJE ");
            System.out.println("3 SALIR ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el mensaje para cifrar");
                    String frase = sc.nextLine();
                    String a = Cifrado.codificar(abecedario, frase);
                    System.out.println("El mensaje cifrado es: " + a);
                    break;
                case 2:
                    System.out.println("Ingrese el mensaje para decifrar");
                    String frase1 = sc.nextLine();
                    String b = Decifrado.decifrado(abecedario, frase1);
                    System.out.println("El mensaje decifrado es: " + b);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("INGRESE LAS OPCIONES EN PANTALLA");
                    break;
            }

        } while (op != 3);
        {
            System.out.println("Gracias por usar :)");
        }

    }
}