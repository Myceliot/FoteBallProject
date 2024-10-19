
package projetofootball;

public class Jogo {
    private Selecoes[] selecoesJogadoras;
    private Estadio estadio;
    private String estadoAtual;
    private int[] Pontos= new int[4];
    //0-primeira Time
    //1-segunda Time
    //2-terceira time
    //3-quarta time
    
    //construçao Vazia
    public Jogo() {
        selecoesJogadoras[0]=new Selecoes();
        estadio =new Estadio();
    }
    //construçao do Jogo
    public Jogo(Selecoes[] selecoes, Estadio estadio) {
        this.selecoesJogadoras = selecoes;
        this.estadio = estadio;
    }
    
    public void JogoRodando(){
        estadoAtual="Rodando";
      
        for (int i = 0; i < selecoesJogadoras.length; i++) {
            //1,2,3,4
            //2,3,4
            //3,4
            //4
            for (int j = 1 + i; j < selecoesJogadoras.length; j++) {
                //1-2,3,4
                //2-3,4
                //3-4
                for (int k = 0; k < 10; k++) {
                    //logica Do jogo tera 10 chances de Marcar
                    System.out.println("Qual selecao Marcou?1-"+selecoesJogadoras);
                }
            }
        }
    }
}
