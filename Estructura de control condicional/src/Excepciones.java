import java.util.Scanner;

public class Excepciones {


    public void actividad(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribeme la altura");
        int altura = scanner.nextInt();

        if (altura <= 150) {
            System.out.println("Persona de altura baja");

        } else if (altura > 151 && altura <= 175) {
            System.out.println("Persona de altura media");
        }

        else{
            System.out.println("ERES TOPE DE ALTO COMPADRE");
        }

    }
}
