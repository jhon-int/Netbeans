package javashow;
import java.util.Scanner;

public class Exercicio_Looping1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de Alunos: ");
        int n = ler.nextInt();
        double mediaTotal =0, media=0;
        double n1,n2;
     
        
        int i=1;
        int rep=0;
        int exa=0;
        int apr=0;
        
        while(i<=n)
        {
            System.out.print("Nota1: ");
            n1 = ler.nextDouble();
            System.out.print("Nota2: ");
            n2 = ler.nextDouble();
            media = (n1+n2)/2;
            String situ = "";
            
            if (media <= 3)
            {
                situ = "Reprovado";
                rep++;
            }
            else if (media > 3 && media < 6)
            {
                situ = "Exame";
                exa++;
            }
            else
            {
                situ = "Aprovado";
                apr++;
            }
            
            System.out.printf("O aluno %s foi %s com media %.2f \n",i,situ,media);
            mediaTotal += media;
            i++;
        }
        System.out.printf("\n O total de alunos aprovados é de: %s \n O total de alunos Reprovados é de: %s \n O total de alunos de Exame é de: %s \n A média da sala: %s \n",apr,rep,exa,mediaTotal);
        
    }
    
}
