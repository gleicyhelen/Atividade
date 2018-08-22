package atividade.exemplo.gleicy.atividade.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import atividade.exemplo.gleicy.atividade.R;

public class Parente {

    private String nome;
    private int idade;
    private String grauParentesco;
    private String cidade;
    private int telefone;

    public Parente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
