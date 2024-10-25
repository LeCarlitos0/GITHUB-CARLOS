
import java.util.Scanner;


public class Baterias
{
    public void ejercicio3()
    {
        Scanner hola = new Scanner(System.in);


        System.out.println("Introduce primer numero:");
        double num1 = hola.nextDouble();


        System.out.print("Introduce el segundo número: ");
        double num2 = hola.nextDouble();


        if (num2 == 0)
        {
            System.out.println("Error numero no se puede dividir entre 0");
        }


        else
        {
            double resultado = num1 / num2;
            System.out.println(+resultado);
        }


    }
