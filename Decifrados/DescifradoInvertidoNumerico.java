package Decifrados;

import java.util.Scanner;

public class DescifradoInvertidoNumerico {
    public static String decodificar(String mensaje) {
        String decodificado = "";
        mensaje = mensaje.toUpperCase();
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (i + 2 < mensaje.length() && Character.isDigit(mensaje.charAt(i + 1))) {
                String codigo = "" + caracter + mensaje.charAt(i + 1);
                if (i + 3 < mensaje.length() && Character.isDigit(mensaje.charAt(i + 2))) {
                    codigo += mensaje.charAt(i + 2);
                    i += 2;
                } else {
                    i += 1;
                }
                switch (codigo) {
                    case "Z1":
                        decodificado += "A";
                        break;
                    case "Y2":
                        decodificado += "B";
                        break;
                    case "X3":
                        decodificado += "C";
                        break;
                    case "W4":
                        decodificado += "D";
                        break;
                    case "V5":
                        decodificado += "E";
                        break;
                    case "U6":
                        decodificado += "F";
                        break;
                    case "T7":
                        decodificado += "G";
                        break;
                    case "S8":
                        decodificado += "H";
                        break;
                    case "R9":
                        decodificado += "I";
                        break;
                    case "Q10":
                        decodificado += "J";
                        break;
                    case "P11":
                        decodificado += "K";
                        break;
                    case "O12":
                        decodificado += "L";
                        break;
                    case "N13":
                        decodificado += "M";
                        break;
                    case "M14":
                        decodificado += "N";
                        break;
                    case "L15":
                        decodificado += "O";
                        break;
                    case "K16":
                        decodificado += "P";
                        break;
                    case "J17":
                        decodificado += "Q";
                        break;
                    case "I18":
                        decodificado += "R";
                        break;
                    case "H19":
                        decodificado += "S";
                        break;
                    case "G20":
                        decodificado += "T";
                        break;
                    case "F21":
                        decodificado += "U";
                        break;
                    case "E22":
                        decodificado += "V";
                        break;
                    case "D23":
                        decodificado += "W";
                        break;
                    case "C24":
                        decodificado += "X";
                        break;
                    case "B25":
                        decodificado += "Y";
                        break;
                    case "A26":
                        decodificado += "Z";
                        break;
                    case "9A":
                        decodificado += "0";
                        break;
                    case "8B":
                        decodificado += "1";
                        break;
                    case "7C":
                        decodificado += "2";
                        break;
                    case "6D":
                        decodificado += "3";
                        break;
                    case "5E":
                        decodificado += "4";
                        break;
                    case "4F":
                        decodificado += "5";
                        break;
                    case "3G":
                        decodificado += "6";
                        break;
                    case "2H":
                        decodificado += "7";
                        break;
                    case "1I":
                        decodificado += "8";
                        break;
                    case "0J":
                        decodificado += "9";
                        break;
                    default:
                        decodificado += "?";
                }
            } else {
                decodificado += caracter;
            }
        }
        return decodificado;
    }
}
