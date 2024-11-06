
package projetofootball;

public class Grupo {
    //12 grupos = 48 selecoes
    //1 grupo = 4 selecoes
    private Selecoes TeamA;
    private Selecoes TeamB;
    private Jogo jogo;
    private int NumeroParticipantes=0;
    private int IncrementaPonto=0;
    
    private Selecoes[] selecoesTotal;
    private Selecoes[] Grupo= new Selecoes[4];
    private Selecoes[][] SelecoesJogadoras= new Selecoes[6][2];
    private int PegaSelecoes=0;
    private int contagemDeJogosPorGrupo=-1;
    private Estadio estadio;
    private boolean JogoRodando=false;
    private boolean JogoAgendado=false;
    
    //Constantes
    private static final Selecoes[] selecoesTotal_POR_OMISSAO={new Selecoes()};
    private static final int INSCRITAS_POR_OMISSAO=0;
    
    //construçao Vazia
    public Grupo() {
        selecoesTotal=selecoesTotal_POR_OMISSAO;
        estadio= new Estadio();
        this.NumeroParticipantes=INSCRITAS_POR_OMISSAO;
    }
    
    //construçao do Grupo
    public Grupo(Selecoes[] selecoes,Estadio estadio,int NumeroParticipantes) {
        this.selecoesTotal = selecoes;
        this.estadio=estadio;
        this.NumeroParticipantes=NumeroParticipantes;
        
    }
    
    /**
     * Faz Um Grupo de 4 Selecoes
     * Apenas Faz Caso As Teams Anteriores Tenham Feito Os seus 6 Jogos
     */
    public void FormarGrupo(){
        if (contagemDeJogosPorGrupo==6) {
            contagemDeJogosPorGrupo=-1;
        }
        
        if (contagemDeJogosPorGrupo==-1) {
        contagemDeJogosPorGrupo++;
        for (int i = 0; i < Grupo.length; i++) {
            Grupo[i]=selecoesTotal[PegaSelecoes];
            PegaSelecoes++;
        }
        
        System.out.println("Grupo Formado!");
        System.out.println(Grupo[0].getPaisRepresentante());
        System.out.println(Grupo[1].getPaisRepresentante());
        System.out.println(Grupo[2].getPaisRepresentante());
        System.out.println(Grupo[3].getPaisRepresentante());
        //1# 1-2
        SelecoesJogadoras[0][0]=Grupo[0];
        SelecoesJogadoras[0][1]=Grupo[1];
        System.out.println("1#");
        System.out.println(SelecoesJogadoras[0][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[0][1].getPaisRepresentante());
        //2# 1-3
        SelecoesJogadoras[1][0]=Grupo[0];
        SelecoesJogadoras[1][1]=Grupo[2];
        System.out.println("2#");
        System.out.println(SelecoesJogadoras[1][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[1][1].getPaisRepresentante());
        //3# 1-4
        SelecoesJogadoras[2][0]=Grupo[0];
        SelecoesJogadoras[2][1]=Grupo[3];
        System.out.println("3#");
        System.out.println(SelecoesJogadoras[2][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[2][1].getPaisRepresentante());
        //4# 2-3
        SelecoesJogadoras[3][0]=Grupo[1];
        SelecoesJogadoras[3][1]=Grupo[2];
        System.out.println("4#");
        System.out.println(SelecoesJogadoras[3][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[3][1].getPaisRepresentante());
        //5# 2-4
        SelecoesJogadoras[4][0]=Grupo[1];
        SelecoesJogadoras[4][1]=Grupo[3];
        System.out.println("5#");
        System.out.println(SelecoesJogadoras[4][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[4][1].getPaisRepresentante());
        //6# 3-4 Ultima
        SelecoesJogadoras[5][0]=Grupo[2];
        SelecoesJogadoras[5][1]=Grupo[3];
        
        System.out.println("6#");
        System.out.println(SelecoesJogadoras[5][0].getPaisRepresentante()+" VS "+SelecoesJogadoras[5][1].getPaisRepresentante());
        }else{
            System.out.println("Grupos Nao podem ser feitos se os jogos dentro deles nao acabou.");
        }
        
    }
    /**
     * Agenda Um Jogo Caso nenhum esteja agendado
     */
    public void AgendarJogo(){
        if (JogoAgendado==false) {
            JogoAgendado=true;
            System.out.println("Jogo Agendado!");
        }else{
            System.out.println("Atualmente a jogo agendado tente outra hr");
        }
        
    }
    /**
     * Ve se tem jogo rodando e agendado.
     * Caso nao aja um Jogo Rodando, Mas Esteja Agendado, enverte os papeis(!Agendando&&rodando)
     */
    public void ConfirmaçaoDeJogoPendente(){
    if(JogoRodando==true){
        System.out.println("A um jogo sendo feito");
    }else if(JogoRodando==false&&JogoAgendado==true){
        System.out.println("Escolhendo Teams!");
        JogoSorter(SelecoesJogadoras);
        JogoAgendado=false;
        JogoRodando=true;
    }
    }
  
    
    /**
     * Sorteia Jogos de forma que jogos repetidos nao acontecam.
     * Apos o inicio de cada jogo a var contagemDeJogos é Incrementada para evitar repeticoes.
     * @param Sorter
     * @return 
     */
    private Selecoes[][] JogoSorter(Selecoes[][] Sorter){
        Selecoes[][] VS = new Selecoes[1][2];
        switch (contagemDeJogosPorGrupo) {
            case 0:
                VS[0][0]=Sorter[0][0];
                VS[0][1]=Sorter[0][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 1:
                VS[0][0]=Sorter[1][0];
                VS[0][1]=Sorter[1][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 2:
                VS[0][0]=Sorter[2][0];
                VS[0][1]=Sorter[2][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 3:
                VS[0][0]=Sorter[3][0];
                VS[0][1]=Sorter[3][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 4:
                VS[0][0]=Sorter[4][0];
                VS[0][1]=Sorter[4][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 5:
                VS[0][0]=Sorter[5][0];
                VS[0][1]=Sorter[5][1];
                TeamA=VS[0][0];
                TeamB=VS[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            default:
                System.out.println("Acabou");
        }
        return Sorter;
    }
    /**
     * Serve para usar todo do Objeto Jogo incluindo Finalizar do objeto Grupo.
     * @return 
     */
    public Jogo NoJogo(){
        if (JogoRodando=true) {
            return this.jogo;
        }
        return null; 
    }
    /**
     * Finaliza o Jogo Envertendo o JogoRodando.
     * E chamando o Finalizar do Objeto Jogo
     * @param Jogo 
     */
    public void Finalizar(Jogo Jogo){
    
    jogo.FinalizarJogo();
    JogoRodando=false;
    }
    
    
    
    
    //SETS GETS
    public int getNumeroParticipantes() {
        return NumeroParticipantes;
    }

    public void setNumeroParticipantes(int NumeroParticipantes) {
        this.NumeroParticipantes = NumeroParticipantes;
        
    }

    public Selecoes[] getSelecoesTotal() {
        return selecoesTotal;
    }

    public void setSelecoesTotal(Selecoes[] selecoesTotal) {
        this.selecoesTotal = selecoesTotal;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
}
