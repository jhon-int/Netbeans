package javashow;
import java.util.Scanner;
public class JavaShow6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = ler.next();
        System.out.print("Idade: ");
        int idade = ler.nextInt();
        System.out.print("Sexo M/F: ");
        String sexo = ler.next().toUpperCase();
        System.out.print("Estudante S/N: ");
        String est = ler.next().toUpperCase();
        double desc;
        if (idade > 50 && idade < 70)
            desc = 100 - (100 * 0.4);
        
        else if (est.equals("S"))
            desc = 100 - (100 * 0.3);
        
        else if (sexo.equals("F"))
            desc = 100 - (100 * 0.1);
        
        else 
            desc = 100;
        
        System.out.printf("\n Sr(a) %s \n Sua compra foi realizada com sucesso. \n Valor do ingresso R$: %.2f \n Obrigado pela Preferencia! \n", nome, desc);
        
        
    }
    
}
