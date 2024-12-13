package Cifrados;

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
}
