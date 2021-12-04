package com.hearthstone.HearthStone.model;

public class Carta {
    private int id;
    private String nome;
    private String descricao;
    private int ataque;
    private int defesa;
    private TipoCarta tipo;
    private ClasseCarta classe;

    public Carta(int id, String nome, String descricao, int ataque, int defesa, TipoCarta tipo, ClasseCarta classe) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
        this.classe = classe;
    }

    public Carta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
