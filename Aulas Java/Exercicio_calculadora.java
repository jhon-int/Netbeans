package javashow;
import java.util.Scanner;

public class Exercicio_calculadora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double op1, op2, r=0;
        String op;
        
        do
        {
            System.out.println("*** Menu Operacoes ***");
            System.out.println("(+) Soma");
            System.out.println("(-) Subtracao");
            System.out.println("(*) Multiplicacao");
            System.out.println("(/) Divisão");
            System.out.println("(S) Soma");
            op = ler.next().toUpperCase();
            
            if (op.equals("S"))
            {
                System.exit(1);
            }
            
            System.out.print("Operador 1: ");
            op1 = ler.nextDouble();
            System.out.print("Operador 2: ");
            op2 = ler.nextDouble();
            
            switch(op)
            {
                case "+":
                    r = op1 + op2;
                break;
                case "-":
                    r = op1 - op2;
                break;
                case "*":
                    r = op1 * op2;
                break;
                case "/":
                    if (op2==0){
                        System.out.print("Não é possivel dividir por 0");
                    }
                    else{
                        r = op1 / op2;
                    }
                break;
            }
            System.out.printf("%.2f %s %.2f = %.2f \n",op1,op,op2,r);
        }
        while(true);
    }
    
}
