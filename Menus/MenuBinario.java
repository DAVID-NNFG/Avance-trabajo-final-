package Menus;

import Cifrados.binario;
import java.util.Scanner;

public class MenuBinario {

    public static void binario(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("\n"+"1. Cifrar texto a binario");
        System.out.println("2. Descifrar binario a texto");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el texto para convertir a binario:");
                String texto = sc.nextLine();
                String textoBinario = binario.convertirTextoABinario(texto);
                System.out.println("Texto en binario: " + textoBinario);
                break;
            }

            case 2: {
                System.out.println("Ingrese el binario para convertir a texto:");
                String binarioInput = sc.nextLine();

                if (binarioInput.matches("([01]{8}\\s?)+")) {
                    String textoOriginal = binario.convertirBinarioATexto(binarioInput);
                    System.out.println("Texto original: " + textoOriginal);
                } else {
                    System.out.println("Error: El binario ingresado no es válido.");
                }
                break;
            }

        }
    }
}
