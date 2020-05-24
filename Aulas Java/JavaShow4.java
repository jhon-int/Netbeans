
package javashow;
import java.util.Scanner;

public class JavaShow4 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Mostrar salario:");
        double salario = teclado.nextDouble();
        
        if(salario < 900)
        {
            double salarioF = salario * 1.25;
            System.out.printf("Mostrar percentual: %.2f", salarioF);
        }
        
        else if (salario > 900 && salario <= 2500)
        {
            double salarioF = salario * 1.15;
            System.out.printf("Mostrar percentual: %.2f", salarioF);
        }
        
        else
        {
            double salarioF = salario * 1.10;
            System.out.printf("Mostrar percentual: %.2f", salarioF);
        }
    }
}
