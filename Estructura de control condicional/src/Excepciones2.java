import java.util.Scanner;

public class Excepciones2 {
    public void actividad(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero del 1 al 7");
        int i = scanner.nextInt();

        switch(i) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("ERES BOBOLON");
        }
    }

}
