import java.util.Scanner;
public class binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        String textoCifrado = convertirABinario(texto);
        System.out.println(textoCifrado);
        
        sc.close();
    }
    
    // Función para convertir un texto a binario
    public static String convertirABinario(String texto) {
        StringBuilder binario = new StringBuilder();
        
        // recorrer por cada carácter del texto
        for (char caracter : texto.toCharArray()) {
            // Obtener la representación binaria del carácter
            String bin = Integer.toBinaryString(caracter);
            
            // Rellenar con ceros a la izquierda para obtener 8 bits
            while (bin.length() < 8) {
                bin = "0" + bin;
            }
            
            // Agregar el binario al resultado
            binario.append(bin).append(" ");
        }
        
        return binario.toString().trim(); 
    }

    public String binario(String texto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'binario'");
    }
}


