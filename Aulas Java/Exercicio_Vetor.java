package javashow;
import java.util.Scanner;

public class Exercicio_Vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo[] = {1000, 3000, 5000, 8000, 500}, depositar=0, sacar=0;
        int conta = 0;
        String op;
        

        do
        {
            System.out.println("*** CX Eletronico ***");
            System.out.println("(1) Consultar");
            System.out.println("(2) Depositar");
            System.out.println("(3) Sacar");
            System.out.println("(4) Sair");

            op = ler.next().toUpperCase();

            if(op == "4")
                break;
            
            switch(op)
            {
                case "1":
                    System.out.println("Informe o numero da conta: ");
                    conta = ler.nextInt();
                    if (conta < 4){
                        System.out.println("Saldo da conta: " + saldo[conta-1]);
                    }
                    else{
                        System.out.println("Conta não existe");
                    }
                break;
                case "2":
                    System.out.println("Informe o numero da conta: ");
                    conta = ler.nextInt();
                    if (conta < 4){
                        System.out.println("Valor do deposito: ");
                        depositar = ler.nextDouble();
                        saldo[conta-1] += depositar;
                        System.out.println("Saldo da conta atual: " + saldo[conta-1]);
                    }
                    else{
                        System.out.println("Conta não existe");
                    }
                break;
                case "3":
                    System.out.println("Informe o numero da conta: ");
                    conta = ler.nextInt();
                    if (conta < 4){
                        System.out.println("Valor do saque: ");
                        sacar = ler.nextDouble();
                        if (sacar <= saldo[conta-1]){
                            saldo[conta-1] -= sacar;
                            System.out.println("Saldo da conta atual: " + saldo[conta-1]);
                        }
                        else{
                            System.out.println("Saldo insuficiente");
                        }
                    }
                    else{
                        System.out.println("Conta não existe");
                    }
                break;
            }
        }
        while(true);   
        
    }
}
