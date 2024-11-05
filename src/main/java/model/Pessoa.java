/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Camargo
 */
@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int cpf;
    
    @Column(nullable = false, length = 37)
    private String nome;
    
    @Column(nullable = false, length = 13)
    private String fone;
    
    @Column(nullable = false, length = 400)
    private String endereço;
    
    @ManyToOne
    @JoinColumn(name = "cd_id")
    private Alugamento alugamento;

    public Alugamento getAlugamento() {
        return alugamento;
    }

    public void setAlugamento(Alugamento alugamento) {
        this.alugamento = alugamento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
