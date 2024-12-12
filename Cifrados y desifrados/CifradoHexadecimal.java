package Ejercicios;
import java.util.Scanner;
public class CifradoHexadecimal {
    public static String codificar(String mensaje) {
        String codificado = "";
        mensaje = mensaje.toUpperCase(); 
        
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            String hexadecimal = Integer.toHexString((int) caracter).toUpperCase();
            codificado += hexadecimal + " "; 
        }
        return codificado.trim(); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mensaje a codificar: ");
        String mensaje = scanner.nextLine(); // Entrada del usuario

        String mensajeCodificado = codificar(mensaje);
        
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje codificado: " + mensajeCodificado);
    }
}