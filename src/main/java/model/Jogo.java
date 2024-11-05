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
@Table(name = "tb_jogo")
public class Jogo extends Cd{
    @Column(nullable = false, length = 200)
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Genero_Jogo genero_jogo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Genero_Jogo getGenero_jogo() {
        return genero_jogo;
    }

    public void setGenero_jogo(Genero_Jogo genero_jogo) {
        this.genero_jogo = genero_jogo;
    }

    
}
