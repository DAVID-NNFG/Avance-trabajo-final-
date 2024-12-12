package util;

public class binario {
    // Método para convertir texto a binario
    public String convertirTextoABinario(String texto) {
        String binario = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            String binarioChar = convertirCharABinario(caracter);
            binario += binarioChar;
        }
        return binario;
    }

    // Método para convertir binario a texto
    public String convertirBinarioATexto(String binario) {
        String texto = "";
        int i = 0;
        while (i < binario.length()) {
            String byteBinario = "";
            for (int j = 0; j < 8; j++) {
                byteBinario += binario.charAt(i++);
            }
            char caracter = convertirBinarioAChar(byteBinario);
            texto += caracter;
        }
        return texto;
    }

    // Método auxiliar para convertir un carácter a binario
    private String convertirCharABinario(char caracter) {
        int ascii = (int) caracter;
        String binario = "";
        for (int i = 7; i >= 0; i--) {
            binario += (ascii & (1 << i)) != 0 ? "1" : "0";
        }
        return binario;
    }

    // Método auxiliar para convertir un binario (8 bits) a carácter
    private char convertirBinarioAChar(String binario) {
        int valor = 0;
        for (int i = 0; i < 8; i++) {
            valor = (valor << 1) + (binario.charAt(i) - '0');
        }
        return (char) valor;
    }
}




    

