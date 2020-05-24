package javashow;
import java.util.Scanner;

public class JavaShow_Vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //int v[] = {10,20,30,40};
        
        //Declaração do vetor
        int V[] = new int[4];
        
        //Carregar vetor
        for (int i=0; i<4; i++){
            System.out.print("Digite o conteudo da posicao " + (i+1) + " indicado pelo indice [" + (i) + "]: ");
            V[i] = ler.nextInt();
        }
        
        //apresentar o conteudo do vetor
        for (int i=0; i<4; i++){
            System.out.println("Conteudo do Vetor " + V[i]);
        }
        
    }
    
}
