package javashow;
import java.util.Scanner;
public class JavaShow2
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor inteiro: ");
        int valor = teclado.nextInt();
        int r = valor%2;
        if (r==0)
        {
          System.out.println("O numero e par ");
        }
        else
        {
          System.out.println("O numero e impar ");
        }

    }
}