package Decifrados;

public class Decifradocesar {
    public static String decifrado(String abecedario, String mensaje) {
        String decodificado = "";
        mensaje = mensaje.toUpperCase();
        char caracter;
        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            int posicion = abecedario.indexOf(caracter);
            if (posicion == -1) {
                decodificado += caracter;
            } else {
                if (posicion < 3) {
                    decodificado += abecedario.charAt(abecedario.length() + (posicion - 3));
                } else {
                    decodificado += abecedario.charAt((posicion - 3) % abecedario.length());
                }
            }
        }
        return decodificado;

    }

}
