
package projetofootball;

public class Jogo {
    //static int a=0;
    private Estadio estadio;
    private Selecoes TeamA;
    private Selecoes TeamB;
    //construçao do Jogo
    public Jogo(Selecoes[][] selecoes) {
        this.TeamA = selecoes[0][0];
        this.TeamB = selecoes[0][1];
    }
    /**
     * Faz Um debug das teams "ToString nas classes"
     */
    public void TEAMSDEBUG(){
        System.out.println("=====================================");
        System.out.println(TeamA.toString());
        System.out.println(TeamB.toString());
        System.out.println("=====================================");
    }
    /**
     * Faz a TeamA Marcar Ponto
     */
    public void TeamAMakeGoal(){
        int VAR = (int)(Math.random()*3);
            TeamA.setPontos(1);
            System.out.println("=====================================");
        System.out.println("GOLO! Para a "+TeamA.getPaisRepresentante());
        System.out.println("=====================================");
        if (VAR==1) {
            System.out.println("=====================================");
            System.out.println("ERRO, GOLO Nao contou!");
            System.out.println("=====================================");
            TeamA.setPontos(-1);
        }
    }
    /**
     * Faz a TeamB Marcar Ponto
     */
    public void TeamBMakeGoal(){
        int VAR = (int)(Math.random()*3);
       TeamB.setPontos(1);
       System.out.println("=====================================");
        System.out.println("GOLO! Para a "+TeamB.getPaisRepresentante());
        System.out.println("=====================================");
        if (VAR==1) {
            System.out.println("=====================================");
            System.out.println("ERRO, GOLO Nao contou!");
            System.out.println("=====================================");
           TeamB.setPontos(-1);
        }
    }
    /**
     * Metodo autoExplicativo
     * Mostra os Pontos Atuais Do Jogo
     */
    public void Score(){
        System.out.println("=====================================");
        System.out.println(TeamA.getPontos()+"-"+TeamB.getPontos());
    }
    /**
     * Metodo usado para Finalizar Jogo Em Andamento.
     * Ele define Vitorias,Derrotas e Empates.
     */
    public void FinalizarJogo(){
        
        if (TeamA.getPontos()>TeamB.getPontos()) {
            TeamA.setPontosPorVitoria(3);
            System.out.println("=====================================");
            System.out.println("VITORIA:"+TeamA.getPaisRepresentante());
            System.out.println("=====================================");
        }else if(TeamA.getPontos()<TeamB.getPontos()){
            TeamB.setPontosPorVitoria(3);
            System.out.println("=====================================");
            System.out.println("VITORIA:"+TeamB.getPaisRepresentante());
            System.out.println("=====================================");
        }else{
            System.out.println("=====================================");
            System.out.println("EMPATE +1 PARA TODOS!");
            System.out.println("=====================================");
            TeamB.setPontosPorVitoria(1);
            TeamB.setPontosPorVitoria(1);
        }
        TeamA.setPontos(-TeamA.getPontos());
        TeamB.setPontos(-TeamB.getPontos());
    }
}
