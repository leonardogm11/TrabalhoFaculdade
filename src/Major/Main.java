package Major;
import java.util.Scanner;
import Models.Gravadora;
import Models.Music;
import Models.Podcast;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Music musicaLegal1 = new Music("O sol",2020);
    musicaLegal1.setDuracaoEmMinutos(3);
    musicaLegal1.setTotalDeAvaliacoes(20000);
    musicaLegal1.setMusico("kvsh");
    musicaLegal1.setEstilo("eletronica");


    Music musicaLegal2 = new Music("Thunderstruck",1990);
    musicaLegal2.setDuracaoEmMinutos(3);
    musicaLegal2.setTotalDeAvaliacoes(100);
    musicaLegal2.setMusico("AcDc");
    musicaLegal2.setEstilo("Rock");

    System.out.println("Nome " + musicaLegal2.getNome());
    System.out.println(musicaLegal1.getTotalDeAvaliacoes());
    System.out.println(musicaLegal1.obterMedia());
    System.out.println("Tempo total da musica: " + musicaLegal1.getDuracaoEmMinutos());

        System.out.println("---------------------------------------------------");
    // musicas acima e podcast abaixo.
    Podcast cochinha = new Podcast("A Cochinha",2022);
    cochinha.setEpisodios(10);
    cochinha.setMintosEpisodio(120);
    System.out.println("Nome do Podcast "+ cochinha.getNome());


    // o que eu vou implementar na web

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (true) {
            System.out.println("Escolha:\n1 - Podcast\n2 - Música");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Opção escolhida: Podcast");
                break;  // Encerra o loop
            } else if (escolha == 2) {
                System.out.println("Opção escolhida: Música");
                break;  // Encerra o loop
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        System.out.println("Aqui estão os estilos de musica");

        ArrayList<String> estilosMusicais = new ArrayList();

        // Adicionando estilos à lista
        estilosMusicais.add("1 Eletronica");
        estilosMusicais.add("2 Sertanejo");
        estilosMusicais.add("3 Rock");
        estilosMusicais.add("4 Pop");

        // Exibindo os estilos de música
        System.out.println("Estilos de Música:");
        for (String estilo : estilosMusicais) {
            System.out.println(estilo);
        }
        System.out.println();
        int musicStyle = 0;
        /*
        switch (musicStyle) {
            case valor 1:
               System.out.println("Aqui estão as musica eletronicas mais bem avaliadas do ano");
                break;
            case valor2:
                // código a ser executado se a expressão for igual a valor2
                break;
            case valor3:
                // código a ser executado se a expressão for igual a valor3
                break;
   ...
            default:
                // código a ser executado se a expressão não for igual a nenhum valor
                break;
            */
















        // if musica else podcast

        // menu de musicas pra ouvir
        System.out.println("Musicas ..estilo que apessoa quis.....");
        // listar os artistas
        // a pessoa escolhe um artista
        // aparesse as musicas recomendadas pra pessoa ouvir
        // e da a opção dela marcar as estrelas


    }
}