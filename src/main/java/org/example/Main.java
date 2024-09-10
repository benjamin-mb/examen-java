package org.example;
import java.util.Scanner;

public class Main {
            static Scanner sc = new Scanner(System.in);
            static Usuario usuario = new Usuario();
            static Funcion funcion1 = new Funcion();

            public static void menu() {
                System.out.println("-------MENU-------" + "\n" +
                        "1. REGISTRARSE" + "\n" +
                        "2. INICIAR SESION" + "\n");
                int decision = sc.nextInt();
                switch (decision) {
                    case 1:
                        usuario.Registrarse();
                        menu();
                        break;
                    case 2:
                        usuario.iniciarsesion();
                        System.out.println("Empecemos");
                        funcion1.contadorPasos();
                        menu();
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }

            public static void main(String[] args) {
                menu();
            }
        }
