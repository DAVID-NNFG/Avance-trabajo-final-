package views;

import java.util.Scanner;

import Menus.MenuBinario;
import Menus.MenuCesar;
import Menus.MenuHexadecimal;
import Menus.MenuInvertidoNum;

public class MenuGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuBinario a = new MenuBinario();
        MenuCesar b = new MenuCesar();
        MenuHexadecimal c = new MenuHexadecimal();
        MenuInvertidoNum d = new MenuInvertidoNum();
        int opciones = 0;
        System.out.println("----------MENU DE METODOS DE CIFRADO----------");
        do {
            System.out.println("\n" + "1 METODO BINARIO");
            System.out.println("2 METODO DE CESAR");
            System.out.println("3 METODO HEXADECIMAL");
            System.out.println("4 METODO INVERTIDO DE NUMERO");
            System.out.println("5 SALIR ");
            opciones = sc.nextInt();
            sc.nextLine();
            switch (opciones) {
                case 1:
                    a.binario(args);
                    break;
                case 2:
                    b.cesar(args);
                    break;
                case 3:
                    c.hexadecimal(args);
                    break;
                case 4:
                    d.Invertido(args);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingresar solo las opciones pantalla por favor");
                    break;
            }
        } while (opciones != 5);
        {
            System.out.println("GRACIAS POR USAR :)");
        }
    }

}
