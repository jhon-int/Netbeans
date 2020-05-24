package javashow;
import java.util.Scanner;
public class Looping {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = ler.nextInt();
        
        //for
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        
        //while
        int i=1;
        while(i<=10)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
        
        //do while
        int j=1;
        do
        {
            System.out.println(n + " x " + j + " = " + (n*j));
            j++;
        }while(j<=10);
    }
    
}
