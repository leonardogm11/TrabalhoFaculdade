package Models;

import Avaliacoes.Classify;

public class Episodio implements Classify {

    private int numero;
    private String nome;
    private Podcast podcast;
    private int totaViews;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    public int getTotaViews() {
        return totaViews;
    }

    public void setTotaViews(int totaViews) {
        this.totaViews = totaViews;
    }

    public int getClassificacao() {
        if (totaViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }



}
