package Cifrados;

import java.util.Scanner;

public class CifradoInvertidoNumerico {
    public static String codificar(String mensaje) {
        String codificado = "";
        mensaje = mensaje.toUpperCase();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            switch (caracter) {
                case 'A':
                    codificado += "Z1";
                    break;
                case 'B':
                    codificado += "Y2";
                    break;
                case 'C':
                    codificado += "X3";
                    break;
                case 'D':
                    codificado += "W4";
                    break;
                case 'E':
                    codificado += "V5";
                    break;
                case 'F':
                    codificado += "U6";
                    break;
                case 'G':
                    codificado += "T7";
                    break;
                case 'H':
                    codificado += "S8";
                    break;
                case 'I':
                    codificado += "R9";
                    break;
                case 'J':
                    codificado += "Q10";
                    break;
                case 'K':
                    codificado += "P11";
                    break;
                case 'L':
                    codificado += "O12";
                    break;
                case 'M':
                    codificado += "N13";
                    break;
                case 'N':
                    codificado += "M14";
                    break;
                case 'O':
                    codificado += "L15";
                    break;
                case 'P':
                    codificado += "K16";
                    break;
                case 'Q':
                    codificado += "J17";
                    break;
                case 'R':
                    codificado += "I18";
                    break;
                case 'S':
                    codificado += "H19";
                    break;
                case 'T':
                    codificado += "G20";
                    break;
                case 'U':
                    codificado += "F21";
                    break;
                case 'V':
                    codificado += "E22";
                    break;
                case 'W':
                    codificado += "D23";
                    break;
                case 'X':
                    codificado += "C24";
                    break;
                case 'Y':
                    codificado += "B25";
                    break;
                case 'Z':
                    codificado += "A26";
                    break;
                case '0':
                    codificado += "9A";
                    break;
                case '1':
                    codificado += "8B";
                    break;
                case '2':
                    codificado += "7C";
                    break;
                case '3':
                    codificado += "6D";
                    break;
                case '4':
                    codificado += "5E";
                    break;
                case '5':
                    codificado += "4F";
                    break;
                case '6':
                    codificado += "3G";
                    break;
                case '7':
                    codificado += "2H";
                    break;
                case '8':
                    codificado += "1I";
                    break;
                case '9':
                    codificado += "0J";
                    break;
                default:
                    codificado += caracter;
            }
        }
        return codificado;
    }
}
