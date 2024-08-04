/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class Guevara_Ernesto_EjerciciosTarea {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. Palabra Espaciada");
            System.out.println("2. Piramide de Numeros");
            System.out.println("3. Palindromos y No Palindromos");
            System.out.println("4. Salir");
            int op = lea.nextInt();

            if (op == 1) {
                while (true) {
                    System.out.println("Ingrese una palabra:");
                    String palabra = lea.next();

                    for (int i = 0; i < palabra.length(); i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i));
                    }

                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i));
                    }

                    System.out.println("Desea volver a intentarlo? (s/n)");
                    char volver = lea.next().toLowerCase().charAt(0);

                    if (volver == 'n') {
                        break;
                    }
                }
            }

            if (op == 2) {
                while (true) {
                    System.out.println("Ingrese un numero: ");
                    int fila = lea.nextInt();

                    for (int i = 1; i <= fila; i++) {

                        for (int j = 1; j < i; j++) {
                            System.out.print("  ");
                        }

                        for (int k = i; k <= fila; k++) {
                            System.out.print(k + " ");
                        }

                        for (int l = fila - 1; l >= i; l--) {
                            System.out.print(l + " ");
                        }

                        System.out.print("\n");
                    }

                    System.out.println("Desea volver a intentarlo? (s/n)");
                    char volver = lea.next().toLowerCase().charAt(0);

                    if (volver == 'n') {
                        break;
                    }
                }
            }

            if (op == 3) {
                while (true) {
                    System.out.println("Cantidad de palabra: ");
                    int cantidad = lea.nextInt();
                    int contador = 1;
                    String Palindromos = "";
                    String noPalindromos = "";
                    String palabrainv = "";

                    while (contador <= cantidad) {
                        System.out.println("Palabra " + contador + " ");
                        String palabra = lea.next().toLowerCase();

                        for (int i = palabra.length() - 1; i >= 0; i--) {
                            char letra = palabra.charAt(i);
                            palabrainv += letra;
                        }

                        if (palabrainv.equals(palabra)) {
                            Palindromos += palabra + " ";
                            palabrainv = "";
                        } else {
                            noPalindromos += palabra + " ";
                            palabrainv = "";
                        }

                        contador++;
                    }

                    System.out.println("Palindromos: " + Palindromos);
                    System.out.println("No Palindromos: " + noPalindromos);

                    System.out.println("Desea volver a intentarlo? (s/n)");
                    char volver = lea.next().toLowerCase().charAt(0);
                    
                    if(volver=='n'){
                        break;
                    }
                }
            }
            
            if(op==4){
                System.out.println("Nos vemos!");
                break;
            }
        }

    }
}
