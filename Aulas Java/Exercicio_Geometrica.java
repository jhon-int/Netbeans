package javashow;
import java.util.Scanner;

public class Exercicio_Geometrica {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base, altura, raio, lado, BMaior, BMenor, r=0;
        String op;
        
        do
        {
            System.out.println("*** Menu Formas ***");
            System.out.println("(1) Triangulo");
            System.out.println("(2) Circulo");
            System.out.println("(3) Quadrado");
            System.out.println("(4) Trapezio");
            System.out.println("(S) Sair");
            op = ler.next().toUpperCase();
            
            if (op.equals("S"))
            {
                System.exit(1);
            }
            
            switch(op)
            {
                case "1":
                    System.out.print("Base: ");
                    base = ler.nextDouble();
                    System.out.print("Altura: ");
                    altura = ler.nextDouble();
                    
                    r = (base * altura)/2;
                break;
                case "2":
                    System.out.print("Raio: ");
                    raio = ler.nextDouble();
                    
                    r = Math.PI * (raio*raio);
                break;
                case "3":
                    System.out.print("Lado: ");
                    lado = ler.nextDouble();
                    
                    r = lado * lado;
                break;
                case "4":
                    System.out.print("Base Maior: ");
                    BMaior = ler.nextDouble();
                    System.out.print("Base Menor: ");
                    BMenor = ler.nextDouble();
                    System.out.print("Altura: ");
                    altura = ler.nextDouble();
                    
                    r = ((BMaior + BMenor)*altura)/2;
                break;
            }
            System.out.printf("Area do %s = %.2f \n",op,r);
        }
        while(true);
    }
}
