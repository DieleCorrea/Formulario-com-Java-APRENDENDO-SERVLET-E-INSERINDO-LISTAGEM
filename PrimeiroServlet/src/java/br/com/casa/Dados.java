/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diéle
 */
public class Dados {

    public static List<Dados> getLista() {
        return lista;
    }

    public static void setLista(List<Dados> aLista) {
        lista = aLista;
    }

    private String nome;
    private String endereco;
    private String cidade;
    private String fone;
    private int idade;
    private static List<Dados> lista = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
