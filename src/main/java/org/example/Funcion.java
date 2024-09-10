package org.example;
import java.util.Scanner;

public class Funcion {

    Scanner sc= new Scanner(System.in);
    int pasos1;
    int pasos2;
    int pasos3;
    int pasos4;
    int pasos5;
    int pasos6;
    int pasos7;
    int total ;

    public void contadorPasos(){
        String []pasos= new String[8];
        String []tags ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "el total es: "};

        System.out.println("ingrese la cantidad de pasos que dio el lunes:");
        pasos1=sc.nextInt();
        pasos[0]=pasos1+"";
        System.out.println("ingrese la cantidad de pasos que dio el Martes:");
        pasos2=sc.nextInt();
        pasos[1]=pasos2+"";
        System.out.println("ingrese la cantidad de pasos que dio el Miercoles:");
        pasos3=sc.nextInt();
        pasos[2]=pasos3+"";
        System.out.println("ingrese la cantidad de pasos que dio el Jueves:");
        pasos4=sc.nextInt();
        pasos[3]=pasos4+"";
        System.out.println("ingrese la cantidad de pasos que dio el Viernes:");
        pasos5=sc.nextInt();
        pasos[4]=pasos5+"";
        System.out.println("ingrese la cantidad de pasos que dio el Sabado:");
        pasos6=sc.nextInt();
        pasos[5]=pasos6+"";
        System.out.println("ingrese la cantidad de pasos que dio el Domingo:");
        pasos7=sc.nextInt();
        pasos[6]=pasos7+"";
        total = pasos1 + pasos2 + pasos3 + pasos4 + pasos5 + pasos6 + pasos7;
        pasos[7] = total + "";

        for (int j=0; j < tags.length;j++){
            System.out.println(tags[j] + " "+ pasos[j]);
        }


    }



}
