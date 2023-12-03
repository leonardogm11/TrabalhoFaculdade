package Avaliacoes;

public class Recomendavel {

    public void filtrar(Classify classificavel) {

        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre as preferidas do momemento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("O que você esta ouvindo está bombando no momento ");
        } else {
            System.out.println("Coloque na sua lista pra assistir depois");
        }

    }

}
