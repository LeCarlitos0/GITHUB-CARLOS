package org.example;

import java.util.Scanner;

public class bateriasfor {

    public void ejercicio2 (){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un num ...");
        int numero = teclado.nextInt();

        for(int i=numero;i>=1;i--){
            System.out.println(i);
        }


    }

    public void ejercicio3 (){


        for(int i=0;i<50;i++){
           if (i % 3 == 0){
               System.out.println(i);
           }
        }
    }

    public void ejercicio4(){
        
    }

}
