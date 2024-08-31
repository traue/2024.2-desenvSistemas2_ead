package br.mack.aula;


public class Aluno {

    public Aluno() {
    }

    public Aluno(String nome, int ra, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    String nome;
    int ra;
    String email;
    Endereco endereco;


}
