
package projetofootball;

public class Jogo {
    Selecoes[] selecoes;
    Estadio estadio;
    String estadoAtual;
    
    //construçao Vazia
    public Jogo() {
        selecoes[0]=new Selecoes();
        estadio =new Estadio();
    }
    //construçao do Jogo
    public Jogo(Selecoes[] selecoes, Estadio estadio) {
        this.selecoes = selecoes;
        this.estadio = estadio;
    }
    
}
