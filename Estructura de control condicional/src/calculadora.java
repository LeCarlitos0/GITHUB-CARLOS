
import java.util.Scanner;
public class calculadora {

    public void calculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA RÁPIDA");
        System.out.println("----------------------------------");
        System.out.println("Introduce el Primer numero");
        int primer = scanner.nextInt();

        System.out.println("Introduce el signo a aplicar (+ , - , / , x , R)");
        String signo = scanner.next();


        switch (signo) {
            case "+":
                System.out.println("Introduce el Segundo numero");
                int segundo = scanner.nextInt();
                int suma = segundo + primer;
                System.out.println(+suma);
                break;

            case "-":
                System.out.println("Introduce el Segundo numero");
                int segundo1 = scanner.nextInt();
                int resta = primer - segundo1;
                System.out.println(+resta);
                break;

            case "/":
                System.out.println("Introduce el Segundo numero");
                int segundo3 = scanner.nextInt();
                int division = primer - segundo3;
                System.out.println(+division);
                break;

            case "x":
                System.out.println("Introduce el Segundo numero");
                int segundo4 = scanner.nextInt();
                int multi = primer * segundo4;
                System.out.println(+multi);
                break;

            case "R":

                int raiz = (int) Math.sqrt(primer);
                System.out.println(+raiz);
                break;





        }
    }
}


