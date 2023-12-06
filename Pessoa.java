/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {
    private String nome;
    private Endereco endereco;
    private List<Telefone> telefones;

    public Pessoa(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone(s):");
        for (Telefone telefone : telefones) {
            System.out.println(telefone.getNum());
        }
    }
}
