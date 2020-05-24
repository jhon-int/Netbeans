/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Aluno;



/**
 *
 * @author Alex
 */
public class AlunoControle {
           
    public static void main(String[] args) {
        // Criação e instância do objeto Aluno
        Aluno aluno = new Aluno();
        //Classe variavel = new Classe();
        
        Aluno aluno2 = new Aluno(201802, "Jessica", "18", "Feminino");
        
        //Dados do aluno
        aluno.setRm(201801);
        aluno.setNome("Carlos Oliveira");
        aluno.setIdade("18");
        aluno.setSexo("Masculino");
        
        //Imprimir dados do aluno 1
                
        System.out.println("RM: " + aluno.getRm());        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Sexo: " + aluno.getSexo());
        
        System.out.print("\n");
        
         //Imprimir dados do aluno 2
        System.out.println("RM: " + aluno2.getRm());        
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Sexo: " + aluno2.getSexo());
        
        System.exit(0);        
    }
}
