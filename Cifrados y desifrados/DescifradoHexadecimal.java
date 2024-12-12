package Ejercicios;
import java.util.Scanner;
public class DescifradoHexadecimal {
    public static String decifrar(String mensajeCodificado) {
        String[] codigosHex = mensajeCodificado.split(" ");
        String decodificado = "";

        for (String codigoHex : codigosHex) {
            try {
                int valorAscii = Integer.parseInt(codigoHex, 16);
                char caracter = (char) valorAscii;
                decodificado += caracter;
            } catch (NumberFormatException e) {
                decodificado += "?"; 
            }
        }

        return decodificado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mensaje codificado en hexadecimal: ");
        String mensajeCodificado = scanner.nextLine(); 

        String mensajeDecodificado = decifrar(mensajeCodificado);

        System.out.println("Mensaje codificado: " + mensajeCodificado);
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);
    }
}