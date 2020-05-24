package javashow;
import java.util.Scanner;
public class JavaShow5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = ler.next();
        System.out.print("Nota 1: ");
        double n1 = ler.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = ler.nextDouble();
        double media = (n1+n2)/2;
        String situ = "";
        if (media <= 3)
            situ = "Reprovado";
        
        else if (media > 3 && media < 6)
            situ = "Exame";
        
        else
            situ = "Aprovado";
        
        System.out.printf("O aluno %s foi %s com media %.2f \n", nome, situ, media);
    }
    
}
