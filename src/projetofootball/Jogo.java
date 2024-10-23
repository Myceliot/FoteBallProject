
package projetofootball;

public class Jogo {
    private Selecoes[][] selecoesJogadoras;
    private Estadio estadio;
    private String estadoAtual;
    private int[] PontosPorVitoria= new int[2];
    //Pontos que defenirao quem ganhou,perdeu ou se empatou, gerando assim pontos de vitoria.
    private int pontosTeamA;
    private int pontosTeamB;
    //construçao do Jogo
    public Jogo(Selecoes[][] selecoes) {
        this.selecoesJogadoras = selecoes;
    }
    public void TEAMSDEBUG(){
        System.out.println("==========");
        System.out.println(selecoesJogadoras[0][1].toString());
        System.out.println(selecoesJogadoras[0][0].toString());
        System.out.println("==========");
    }
    public void TeamAMakeGoal(){
        int VAR = (int)(Math.random()*3);
            pontosTeamA++;
        System.out.println("GOLO! Para a "+selecoesJogadoras[0][0].getPaisRepresentante());
        if (VAR==1) {
            System.out.println("ERRO, GOLO Nao contou!");
            pontosTeamA--;
        }
    }
    public void TeamBMakeGoal(){
        int VAR = (int)(Math.random()*3);
       pontosTeamB++;
        System.out.println("GOLO! Para a "+selecoesJogadoras[0][1].getPaisRepresentante());
        if (VAR==1) {
            System.out.println("ERRO, GOLO Nao contou!");
            pontosTeamB--;
        }
    }
    public void Score(){
        System.out.println(pontosTeamA+"-"+pontosTeamB);
    }
    public int[] FinalizarJogo(){
        if (pontosTeamA<pontosTeamB) {
            PontosPorVitoria[0]+=3;
        }else if(pontosTeamA>pontosTeamB){
            PontosPorVitoria[1]+=3;
        }else{
        PontosPorVitoria[0]+=1;
        PontosPorVitoria[1]+=1;
        }
        
    return PontosPorVitoria;
    }
}
