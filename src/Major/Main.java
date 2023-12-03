package Major;

import Models.Gravadora;
import Models.Music;
import Models.Podcast;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Music musicaEletronica = new Music("O sol",2020);
    musicaEletronica.setDuracaoEmMinutos(3);
    musicaEletronica.setTotalDeAvaliacoes(20000);
    musicaEletronica.setMusico("kvsh");

    Music rockMusic = new Music("Thunderstruck",1990);
    rockMusic.setDuracaoEmMinutos(3);
    rockMusic.setTotalDeAvaliacoes(100);
    rockMusic.setMusico("AcDc");

    System.out.println("Nome " + rockMusic.getNome());
    System.out.println(musicaEletronica.getTotalDeAvaliacoes());
    System.out.println(musicaEletronica.obterMedia());
    System.out.println("Tempo total da musica: " + musicaEletronica.getDuracaoEmMinutos());

        System.out.println("---------------------------------------------------");
    // musicas acima e podcast abaixo.
    Podcast cochinha = new Podcast("A Cochinha",2022);
    cochinha.setEpisodios(10);
    cochinha.setMintosEpisodio(120);
    System.out.println("Nome do Podcast "+ cochinha.getNome());


    // o que eu vou implementar na web
        System.out.println("Bem vindo ao site\n");
        System.out.println("Você deseja ouvir podcast ou musica?");
        // if musica else podcast
        System.out.println("Aqui estão os estilos de musica");
        // menu de musicas pra ouvir
        System.out.println("Musicas ..estilo que apessoa quis.....");
        // listar os artistas
        // a pessoa escolhe um artista
        // aparesse as musicas recomendadas pra pessoa ouvir
        // e da a opção dela marcar as estrelas


    }
}