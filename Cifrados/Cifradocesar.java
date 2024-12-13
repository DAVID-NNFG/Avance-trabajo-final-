package Cifrados;

public class Cifradocesar {
    public static String codificar(String abecedario, String mensaje) {
        String codificado = "";
        mensaje = mensaje.toUpperCase();
        char caracter;
        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            int posicion = abecedario.indexOf(caracter);
            if (posicion == -1) {
                codificado += caracter;
            } else {
                codificado += abecedario.charAt((posicion + 3) % abecedario.length());
            }
        }
        return codificado;

    }

}
    