/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "tb_cd")
public class Cd implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id_commercial;
    
    @Column(nullable = false, length = 50)
    private String nome;
    
    @Column(nullable = false, length = 20)
    private Date dataDeLancamento;
    
    @Column(nullable = false, precision = 2)
    private double preco;
    
    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;
    
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    public int getId_commercial() {
        return id_commercial;
    }

    public void setId_commercial(int id_commercial) {
        this.id_commercial = id_commercial;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(Date dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
}
