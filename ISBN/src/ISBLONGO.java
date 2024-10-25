import java.util.Scanner;

public class ISBLONGO {

    public void ejercicio10()
    {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el ISBN
        System.out.println("Introduce un ISBN de 10 dígitos:");
        String isbn = scanner.nextLine();

        // Inicializamos la suma que vamos a calcular
        int suma = 0;
   
        // Bucle para multiplicar los dígitos por 10, 9, 8, etc.
        for (int i = 0; i < 9; i++) {
            int numero = isbn.charAt(i) - '0'; // Convertimos cada carácter en número
            suma += numero * (10 - i);  // Multiplicamos por (10 - posición)
        }

        // Para el último dígito (el número de control)
        char ultimo = isbn.charAt(9);
        if (ultimo == 'X') {
            suma += 10; // Si el último es 'X', cuenta como 10
        } else {
            int numeroUltimo = ultimo - '0'; // Convertimos el último carácter en número
            suma += numeroUltimo;  // Lo sumamos
        }

        // Verificamos si la suma es múltiplo de 11
        if (suma % 11 == 0) {
            System.out.println("El ISBN es válido.");
        } else {
            System.out.println("El ISBN es inválido.");
        }





    }
}
