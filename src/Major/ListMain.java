package Major;
import Models.Gravadora;
import Models.Music;
import Models.Podcast;

import java.util.ArrayList;
public class ListMain {

    public static void main(String[] args) {
        Music sertanejo = new Music("Filhos de alguém", 1970);
        Music musicaEletronica = new Music("O sol", 2023);
        var popMusic = new Music("I'm Not The Only One", 2014);
        Podcast ltda = new Podcast("LTDA", 2021);

        ArrayList<Gravadora> lista = new ArrayList<>();
        lista.add(sertanejo);
        lista.add(musicaEletronica);
        lista.add(popMusic);
        lista.add(ltda);

    }
}



