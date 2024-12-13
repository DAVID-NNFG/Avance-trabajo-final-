package Decifrados;


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
}