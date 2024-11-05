/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author Camargo
 */
@Entity
@Table(name = "tb_filme")
public class Filme extends Cd{
    
    @Column(nullable = false, length = 200)
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Genero_Filme genero_filme;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Genero_Filme getGenero_filme() {
        return genero_filme;
    }

    public void setGenero_filme(Genero_Filme genero_filme) {
        this.genero_filme = genero_filme;
    }
}
