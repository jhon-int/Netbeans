package javashow;
import java.util.Scanner;

public class Exercicio_Lanchonete {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double preco = 0, valor = 0;
        String op;
        String perg;
        String perg2;
        int quant = 0;
        
        do
        {
            do
            {
                System.out.println("       *** Menu ***       ");
                System.out.println("(1001) Hot Dog        7.50");
                System.out.println("(2001) Hamburguer     9.50");
                System.out.println("(3001) Refrigerante   3.50");
                System.out.println("(4001) Suco           4.50");
                System.out.println("(5001) Pastel         3.50");
                System.out.println("(6001) Cerveja Zero   5.50");
                System.out.println("(0)    Sair");
                op = ler.next().toUpperCase();
                
                if(op == "0")
                    break;
                
                System.out.println("Informe a quantidade:");
                quant = ler.nextInt();
                switch(op)
                {
                    case "1001":
                        
                        preco = preco + 7.5 * quant;
                    break;
                    case "2001":
                        preco = preco + 9.5 * quant;
                    break;
                    case "3001":
                        preco = preco + 3.5 * quant;
                    break;
                    case "4001":
                        preco = preco + 4.5 * quant;
                    break;
                    case "5001":
                        preco = preco + 3.5 * quant;
                    break;
                    case "6001":
                        preco = preco + 5.5 * quant;
                    break;
                }
                
                System.out.printf("SubTotal = %.2f \n",preco);
            }
            while(true);
            
            if(preco != 0)
            {
                System.out.println("Informe o valor pago:");
                valor = ler.nextDouble();

                System.out.printf("\n Total = %.2f \n Valor pago = %.2f \n Troco = %.2f \n",preco,valor,valor-preco);

                System.out.println("Deseja fazer outra Venda S/N?");
                perg2 = ler.next().toUpperCase();
            }
            else
                break;
        }
        while(perg2.equals("S"));
    }
    
}
