package Avaliacoes;

import Models.Gravadora;

public class CalculaTempo {
    private int tempT = 0;

        public int getTempT (){
            return this.tempT;
        }

    public void inclui(Gravadora gravadora){
        this.tempT += gravadora.getDuracaoEmMinutos();
    }

}
