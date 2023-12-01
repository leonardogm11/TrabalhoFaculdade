package Major;

import Models.Music;
import Models.Podcast;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    Music musicaEletronica = new Music("O sol",2020);
    musicaEletronica.setNome("So track boa");
    musicaEletronica.setDuracaoEmMinutos(3);
    musicaEletronica.setTotalDeAvaliacoes(20000);
    musicaEletronica.setMusico("kvsh");

    System.out.println(musicaEletronica.getTotalDeAvaliacoes());
    System.out.println(musicaEletronica.obterMedia());
    System.out.println("Tempo total da musica: " + musicaEletronica.getDuracaoEmMinutos());

    Podcast cochinha = new Podcast("A Cochinha",2022);




    }
}