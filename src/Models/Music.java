package Models;

import Avaliacoes.Classify;

public class Music extends Gravadora implements Classify {
    private String musico;


    public Music(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getMusico() {
        return musico;
    }

    public void setMusico(String musico) {
        this.musico = musico;
    }

    public int getClassificacao() {
        return (int) obterMedia() / 2;  //casting
    }

    public String toString(){
        return "Musica: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }


}
