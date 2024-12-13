package Menus;

import java.util.Scanner;

import Cifrados.CifradoInvertidoNumerico;
import Decifrados.DescifradoInvertidoNumerico;

public class MenuInvertidoNum {
    public static void Invertido(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Seleccione una opción:");
        System.out.println("\n"+"1 CODIFICAR MENSAJE DE TEXTO A Invertido Numerico ");
        System.out.println("2 DECODIFICAR MENSAJE DE Invertido Numerico A TEXTO");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.print("Ingresa el mensaje a codificar: ");
                String mensaje = sc.nextLine();
                String mensajeCodificado = CifradoInvertidoNumerico.codificar(mensaje);
                System.out.println("Mensaje original: " + mensaje);
                System.out.println("Mensaje codificado: " + mensajeCodificado);
                break;
            case 2:

                System.out.print("Ingresa el mensaje codificado: ");
                String mensaje1 = sc.nextLine(); // Entrada del usuario
                String mensajeDecodificado = DescifradoInvertidoNumerico.decodificar(mensaje1);
                System.out.println("Mensaje codificado: " + mensaje1);
                System.out.println("Mensaje decodificado: " + mensajeDecodificado);
                break;
            default:
                System.out.println("INGRESE LAS OPCIONES EN PANTALLA");
                break;

        }

    }
}
