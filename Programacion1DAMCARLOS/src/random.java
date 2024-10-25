import java.util.Scanner;
import java.util.Random;

public class random
{
    public void ejercicio3()
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar el rango mínimo y máximo
        System.out.println("Ingrese el valor mínimo del rango:");
        int min = sc.nextInt();

        System.out.println("Ingrese el valor máximo del rango:");
        int max = sc.nextInt();

        // Validar que el mínimo sea menor que el máximo
        while (min >= max) {
            System.out.println("El valor mínimo debe ser menor que el valor máximo. Inténtelo de nuevo.");
            System.out.println("Ingrese el valor mínimo del rango:");
            min = sc.nextInt();
            System.out.println("Ingrese el valor máximo del rango:");
            max = sc.nextInt();
        }

        // Solicitar cuántos números aleatorios se desean
        System.out.println("¿Cuántos números aleatorios quiere generar?");
        int N = sc.nextInt();

        System.out.println("Los números aleatorios generados son:");

        // Generar y mostrar los N números aleatorios en el rango [min, max]
        for (int i = 0; i < N; i++) {
            int numeroAleatorio = random.nextInt((max - min + 1)) + min;
            System.out.println(numeroAleatorio);
        }



    }
}
