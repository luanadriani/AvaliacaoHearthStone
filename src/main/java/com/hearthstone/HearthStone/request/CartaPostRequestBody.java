package com.hearthstone.HearthStone.request;

import com.hearthstone.HearthStone.model.ClasseCarta;
import com.hearthstone.HearthStone.model.TipoCarta;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class CartaPostRequestBody {
    @NotEmpty(message = "O nome da carta não pode ser vazio")
    private String nome;

    @NotEmpty(message = "O descrição da carta não pode ser vazia")
    private String descricao;

    @Min(value = 0, message = "A ataque pode ser no minimo 0")
    @Max(value = 10, message = "A ataque pode ser no maximo 10")
    private int ataque;

    @Min(value = 0, message = "A defesa pode ser no minimo 0")
    @Max(value = 10, message = "A defesa pode ser no maximo 10")
    private int defesa;

    private TipoCarta tipo;

    private ClasseCarta classe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    public ClasseCarta getClasse() {
        return classe;
    }

    public void setClasse(ClasseCarta classe) {
        this.classe = classe;
    }
}
