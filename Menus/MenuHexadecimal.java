package Menus;

import java.util.Scanner;

import Cifrados.CifradoHexadecimal;
import Decifrados.DescifradoHexadecimal;

public class MenuHexadecimal {
    public static void hexadecimal(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Seleccione una opción:");
        System.out.println("\n"+"1 CODIFICAR MENSAJE DE TEXTO A HEXADECIMAL ");
        System.out.println("2 DECODIFICAR MENSAJE DE HEXADECIMAL A TEXTO");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.print("Ingresa el mensaje a codificar: ");
                String mensaje = sc.nextLine(); // Entrada del usuario
                String mensajeCodificado = CifradoHexadecimal.codificar(mensaje);
                System.out.println("Mensaje original: " + mensaje);
                System.out.println("Mensaje codificado: " + mensajeCodificado);
                break;
            case 2:
                System.out.print("Ingresa el mensaje codificado en hexadecimal: ");
                String mensajeCodificado1 = sc.nextLine();

                String mensajeDecodificado = DescifradoHexadecimal.decifrar(mensajeCodificado1);

                System.out.println("Mensaje codificado: " + mensajeCodificado1);
                System.out.println("Mensaje decodificado: " + mensajeDecodificado);
                break;
            default:
                System.out.println("INGRESE LAS OPCIONES EN PANTALLA");
                break;
        }

    }
}
