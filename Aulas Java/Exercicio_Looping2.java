package javashow;
import java.util.Scanner;

public class Exercicio_Looping2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String sexo;
        String exp;
        String cont;
        
        int j=1;
        int sf=0;
        int sm=0;
        int nmie=0;
        double mediaM=0;
        do
        {
            System.out.print("Idade: "); 
            idade = ler.nextInt(); 
            
            do
            {
                System.out.print("Sexo M/F: ");
                sexo = ler.next().toUpperCase();
                
            }while(!sexo.equals("F") && !sexo.equals("M"));
            
            do
            {
                System.out.print("Experiencia S/N: ");
                exp = ler.next().toUpperCase();
            
            }while(!exp.equals("S") && !exp.equals("N"));
        
            System.out.print("Deseja continuar? S/N: ");
            cont = ler.next().toUpperCase();
            
            if(sexo.equals("F"))
            {
                sf++;
                
                if(idade < 35)
                    if(exp.equals("S"))
                        nmie++;
            }
            
            else if(sexo.equals("M"))
            {
                sm++;
                if(exp.equals("S"))
                    mediaM = mediaM + idade;
            }
            
        }while(cont.equals("S"));
        
        mediaM = mediaM / sm;
        
        System.out.printf("\n Numero de candidatos Femininos: %s "
                        + "\n Numero de candidatos Masculino: %s "
                        + "\n Idade media dos candidatos Masculinos: %.2f "
                        + "\n Numero de candidatos Femininos com Idade menor 35 e com Experiencia: %s \n",sf,sm,mediaM,nmie);
    }
    
}
