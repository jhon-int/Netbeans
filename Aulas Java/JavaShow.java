package javashow;
import java.util.Scanner;
public class JavaShow
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Preco de fabrica");
        double precofab = teclado.nextDouble();
        System.out.print("Percentual do distribuidor");
        double percd = teclado.nextDouble();
        System.out.print("Percentual do imposto");
        double perci = teclado.nextDouble();
        double valord = precofab * percd/100;
        double valori = precofab * perci/100;
        System.out.printf("Valor do distribuidor = %.2f \n\n",valord);
        System.out.printf("Valor do imposto = %.2f \n\n",valori);
        System.out.printf("Valor final do carro = %.2f \n\n",(precofab + valord + valori));
    }
}