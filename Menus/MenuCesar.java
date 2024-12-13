package Menus;

import java.util.Scanner;

import Cifrados.Cifradocesar;
import Decifrados.Decifradocesar;

public class MenuCesar {
    public static void cesar(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int op = 0;
        System.out.println("Seleccione una opción:");
        System.out.println("\n"+"1 CODIFICAR MENSAJE DE TEXTO A CESAR ");
        System.out.println("2 DECODIFICAR MENSAJE DE CESAR A TEXTO");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.println("Ingrese el mensaje para cifrar");
                String frase = sc.nextLine();
                String a = Cifradocesar.codificar(abecedario, frase);
                System.out.println("El mensaje cifrado es: " + a);
                break;
            case 2:
                System.out.println("Ingrese el mensaje para decifrar");
                String frase1 = sc.nextLine();
                String b = Decifradocesar.decifrado(abecedario, frase1);
                System.out.println("El mensaje decifrado es: " + b);
                break;
            default:
                System.out.println("INGRESE LAS OPCIONES EN PANTALLA");
                break;
        }
    }
}