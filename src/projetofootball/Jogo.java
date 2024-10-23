
package projetofootball;


public class Jogo {
    private Selecoes[][] selecoesJogadoras;
    private Estadio estadio;
    private String estadoAtual;
    private int[] PontosPorVitoria= new int[4];
    //Pontos que defenirao quem ganhou,perdeu ou se empatou, gerando assim pontos de vitoria.
    private int pontosTeamA;
    private int pontosTeamB;
    //construçao Vazia
    public Jogo() {
        selecoesJogadoras[0][0]=new Selecoes();
        
    }
    //construçao do Jogo
    public Jogo(Selecoes[][] selecoes) {
        this.selecoesJogadoras = selecoes;
    }
    
    public void TeamAMakeGoal(){
        int VAR = (int)(Math.random()*3);
       pontosTeamA++;
        System.out.println("GOLO! Para a "+selecoesJogadoras[0][0].getPaisRepresentante());
        if (VAR==1) {
            System.out.println("ERRO, GOLO Nao contou!");
        }
    }
    public void TeamBMakeGoal(){
        int VAR = (int)(Math.random()*3);
       pontosTeamB++;
        System.out.println("GOLO! Para a "+selecoesJogadoras[0][1].getPaisRepresentante());
        if (VAR==1) {
            System.out.println("ERRO, GOLO Nao contou!");
        }
    }
    public void Score(){
        System.out.println(pontosTeamA+"-"+pontosTeamB);
    }
    public String FinalizarJogo(){
    return "Finalizado";
    }
}
