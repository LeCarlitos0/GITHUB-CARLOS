
    import java.util.Scanner;


    public class ejercicios
    {
        public void ejercicio1() {
            Scanner scanner = new Scanner(System.in);

            // 0. Pedir al usuario que introduzca una cadena de caracteres
            System.out.println("Introduce una cadena de caracteres:");
            String texto = scanner.nextLine();

            // Mostrar el texto original introducido
            System.out.println("Texto original: " + texto);

            // 1. Mostrar la longitud del texto introducido
            int longitud = texto.length();
            System.out.println("Longitud del texto: " + longitud);

            // 2. Eliminar los espacios del texto y mostrar el resultado
            String textoSinEspacios = texto.replace(" ", "");
            System.out.println("Texto sin espacios: " + textoSinEspacios);

            // 3. Dividir la cadena de texto en dos partes iguales y concatenarlas
            int mitad = longitud / 2;
            String mitad1 = texto.substring(0, mitad);
            String mitad2 = texto.substring(mitad);
            String textoConcatenado = "Primera mitad del texto es " + mitad1 + " y la segunda mitad del texto es " + mitad2;
            System.out.println(textoConcatenado);

            // 4. Transformar la cadena de texto a mayúsculas
            String textoMayusculas = texto.toUpperCase();
            System.out.println("Texto en mayúsculas: " + textoMayusculas);

        }

        public void ejercicio2()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce una cadena de caracteres:");
            String texto1 = scanner.nextLine();

            System.out.println("Introduce una cadena de caracteres:");
            String texto2 = scanner.nextLine();

            int longitud1 = texto1.length();
            System.out.println("Longitud del texto: " + longitud1);

            int longitud2 = texto2.length();
            System.out.println("Longitud del texto: " + longitud2);

            if (longitud1 > longitud2)
                System.out.println("La primera frase es mas larga");
                else
                System.out.println("La segunda frase es mas larga");
        }

        public void ejercicio3()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce una cadena de caracteres:");
            int N = scanner.nextInt();
            System.out.println(+N);

            System.out.println("Introduce el numero que caracteres que le vamos a quitar:");
            int M = scanner.nextInt();

            String numeroComoCadena = Integer.toString(N);
            int numeroDeDigitos = numeroComoCadena.length();

            int resultado = numeroDeDigitos - M;


            String primerosNumeros = numeroComoCadena.substring(0,resultado);
            System.out.println(primerosNumeros);

        }
    }


