
package projetofootball;

public class Jogo {
    Grupo grupos;
    Estadio estadio;
    String estadoAtual;

    //construçao Vazia
    public Jogo() {
    }
    //construçao do Jogo
    public Jogo(Grupo grupos, Estadio estadio, String estadoAtual) {
        this.grupos = grupos;
        this.estadio = estadio;
        this.estadoAtual = estadoAtual;
    }
    
}
