
package projetofootball;

public class Grupo {
    //12 grupos = 48 selecoes
    //1 grupo = 4 selecoes
    static int jogosJogados = 0;
    Selecoes[] selecoesTotal;
    Selecoes[] jogadoras = new Selecoes[4];
    Estadio estadio;
    //construçao Vazia
    public Grupo() {
        selecoesTotal[0]= new Selecoes();
        estadio= new Estadio();
    }
    
    //construçao do Grupo
    public Grupo(Selecoes[] selecoes,Estadio estadio) {
        this.selecoesTotal = selecoes;
        this.estadio=estadio;
    }
    
    public void IniciarJogo(Selecoes[] selecoes,Estadio estadio){
        //Organiza 1 grupo de 4 Selecoes, quando outro for iniciado selecionará outras 4 selecoes, pois jogosJogados seguirá e nao sera reiniciado por objeto
        for (int i = 0; i < jogadoras.length; i++) {
            jogadoras[i]=selecoesTotal[jogosJogados];
            jogosJogados++;
        }
        Jogo jogo= new Jogo();
    }
    
}
