import java.time.LocalDateTime;
import java.util.Scanner;

public class GeneracionPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int añoActual = hoy.getYear();

        System.out.println("Elige el modo de ejecución (1 o 2):");
        int modo = scanner.nextInt();

        if (modo == 1) {
            scanner.nextLine(); // Consumir el salto de línea
            System.out.println("Introduce tu año de nacimiento:");
            String añoNacimientoStr = scanner.nextLine();
            try {
                int añoNacimiento = Integer.parseInt(añoNacimientoStr);
                if (añoNacimiento >= 1900 && añoNacimiento <= añoActual) {
                    mostrarGeneracion(añoNacimiento);
                } else {
                    System.out.println("Año de nacimiento no válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes introducir un número.");
            }
        } else if (modo == 2) {
            System.out.println("Introduce tu edad:");
            int edad = scanner.nextInt();
            if (edad >= 0) {
                int añoNacimiento = añoActual - edad;
                mostrarGeneracion(añoNacimiento);
            } else {
                System.out.println("Edad no válida.");
            }
        } else {
            System.out.println("Modo no válido.");
        }

        scanner.close();
    }

    public static void mostrarGeneracion(int añoNacimiento) {
        if (añoNacimiento >= 1900 && añoNacimiento <= 1927) {
            System.out.println("Sin Generación bautizada.");
        } else if (añoNacimiento >= 1928 && añoNacimiento <= 1944) {
            System.out.println("Generación Silent.");
        } else if (añoNacimiento >= 1945 && añoNacimiento <= 1964) {
            System.out.println("Baby Boomers.");
        } else if (añoNacimiento >= 1965 && añoNacimiento <= 1981) {
            System.out.println("Generación X.");
        } else if (añoNacimiento >= 1982 && añoNacimiento <= 1994) {
            System.out.println("Generación Y o Millennials.");
        } else if (añoNacimiento >= 1995 && añoNacimiento <= 2009) {
            System.out.println("Generación Z o Centennials.");
        } else {
            System.out.println("Generación no identificada.");
        }
    }
}
