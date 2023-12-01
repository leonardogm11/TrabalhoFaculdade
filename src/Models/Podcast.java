package Models;

public class Podcast extends Gravadora {
    private int episodios;
    private int mintosEpisodio;

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMintosEpisodio() {
        return mintosEpisodio;
    }

    public void setMintosEpisodio(int mintosEpisodio) {
        this.mintosEpisodio = mintosEpisodio;
    }

    public Podcast (String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

}
