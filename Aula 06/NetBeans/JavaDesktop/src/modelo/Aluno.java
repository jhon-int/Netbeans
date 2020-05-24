/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Aluno {
    private int rm;
    private String nome;
    private String idade;
    private String sexo;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com todos os Parâmetros
    public Aluno(int rm, String nome, String idade, String sexo) {
        this.rm = rm;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
   
    
}
