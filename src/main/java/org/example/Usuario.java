package org.example;


import java.util.Scanner;
import java.util.Random;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    // Atributos
    String nombre;
    String apellido;
    String correo;
    int contraseña;
    String usuario1;
    String[] datosUsuario = new String[4];

    public void Registrarse() {
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        datosUsuario[0] = nombre;

        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();
        datosUsuario[1] = apellido;

        System.out.println("Ingrese su correo: ");
        correo = sc.nextLine();
        datosUsuario[2] = correo;

        System.out.println("Crear una contraseña:");
        contraseña = sc.nextInt();
        sc.nextLine();
        datosUsuario[3] = String.valueOf(contraseña);

        usuario1 = nombre.toLowerCase() + "." + apellido.toLowerCase();
        System.out.println("Su nombre de usuario es: " + usuario1);
    }

    public void iniciarsesion() {
        System.out.println("Ingrese el usuario:");
        String usuarioIngresado = sc.nextLine();
        if (usuarioIngresado.equalsIgnoreCase(usuario1)) {
            System.out.println("Bienvenido " + usuario1);
            System.out.println("Ingrese su contraseña:");
            int contraseñaIngresada = sc.nextInt();
            if (contraseñaIngresada == Integer.parseInt(datosUsuario[3])) {
                System.out.println("TE HAS LOGEADO EXITOSAMENTE");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Su usuario es incorrecto");
        }
    }
}
