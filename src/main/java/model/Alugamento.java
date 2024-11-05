/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Camargo
 */
public class Alugamento {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int idAlug;
    
    @Column(nullable = false, precision = 2)
    private double preco_total;
    
    @Column(nullable = false, length = 400)
    private String comentario;
    
    @Column(nullable = false, length = 20)
    private Date dataDeDevolucao;
    
    @OneToMany
    @JoinColumn(name = "cd_id")
    private Cd cd;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public int getIdAlug() {
        return idAlug;
    }

    public void setIdAlug(int idAlug) {
        this.idAlug = idAlug;
    }

    public double getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Date dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
