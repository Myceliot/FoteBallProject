
package projetofootball;

public class Grupo {
    //12 grupos = 48 selecoes
    //1 grupo = 4 selecoes
    private Jogo jogo;
    private int NumeroParticipantes=10;
    private int IncrementaPonto=0;
    private int[] Pontos = new int[NumeroParticipantes];
    private Selecoes[] selecoesTotal;
    private Selecoes[] Grupo= new Selecoes[4];
    private Selecoes[][] SelecoesJogadoras= new Selecoes[6][2];
    private int PegaSelecoes=0;
    private int contagemDeJogosPorGrupo=0;
    private Estadio estadio;
    private boolean JogoRodando=false;
    private boolean JogoAgendado=false;
    private static final Selecoes[] selecoesTotal_POR_OMISSAO={new Selecoes()};
    //construçao Vazia
    public Grupo() {
        selecoesTotal=selecoesTotal_POR_OMISSAO;
        estadio= new Estadio();
    }
    
    //construçao do Grupo
    public Grupo(Selecoes[] selecoes,Estadio estadio,int NumeroParticipantes) {
        this.selecoesTotal = selecoes;
        this.estadio=estadio;
        this.NumeroParticipantes=NumeroParticipantes;
        
    }
    
    //Forma Um grupo Usando uma linha muito complexa...
    public void FormarGrupo(){
        if (contagemDeJogosPorGrupo==6) {
            contagemDeJogosPorGrupo=0;
        }
        if (contagemDeJogosPorGrupo==0) {
        
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
        //2# 1-3
        SelecoesJogadoras[1][0]=Grupo[0];
        SelecoesJogadoras[1][1]=Grupo[2];
        System.out.println("2#");
        //3# 1-4
        SelecoesJogadoras[2][0]=Grupo[0];
        SelecoesJogadoras[2][1]=Grupo[3];
        System.out.println("3#");
        //4# 2-3
        SelecoesJogadoras[3][0]=Grupo[1];
        SelecoesJogadoras[3][1]=Grupo[2];
        System.out.println("4#");
        //5# 2-4
        SelecoesJogadoras[4][0]=Grupo[1];
        SelecoesJogadoras[4][1]=Grupo[3];
        System.out.println("5#");
        //6# 3-4 Ultima
        SelecoesJogadoras[5][0]=Grupo[2];
        SelecoesJogadoras[5][1]=Grupo[3];
        System.out.println("6#");
        }else{
            System.out.println("Grupos Nao podem ser feitos se os jogos dentro deles nao acabou.");
        }
        
    }
    //auto explicativo Agenda um jogo caso nenhum esteja agendado
    public void AgendarJogo(){
        if (JogoAgendado==false) {
            JogoAgendado=true;
            System.out.println("Jogo Agendado!");
        }else{
            System.out.println("Atualmente a jogo agendado tente outra hr");
        }
        
    }
    //Ve se tem jogo rodando e agendado, se nao tiver rodando mas estiver agendado tera a confirmaçao para comecar um novo Jogo
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
  
    
    //Define Que apenas 2 teams Estaram Jogando e serao sempre diferentes
    private Selecoes[][] JogoSorter(Selecoes[][] Sorter){
        Selecoes[][] VS = new Selecoes[1][2];
        switch (contagemDeJogosPorGrupo) {
            case 0:
                VS[0][0]=Sorter[0][0];
                VS[0][1]=Sorter[0][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 1:
                VS[0][0]=Sorter[1][0];
                VS[0][1]=Sorter[1][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 2:
                VS[0][0]=Sorter[2][0];
                VS[0][1]=Sorter[2][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 3:
                VS[0][0]=Sorter[3][0];
                VS[0][1]=Sorter[3][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 4:
                VS[0][0]=Sorter[4][0];
                VS[0][1]=Sorter[4][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            case 5:
                VS[0][0]=Sorter[5][0];
                VS[0][1]=Sorter[5][1];
                jogo = new Jogo(VS);
                contagemDeJogosPorGrupo++;
                break;
            default:
                System.out.println("Acabou");
        }
        return Sorter;
    }
    
    public Jogo NoJogo(){
        if (JogoRodando=true) {
            return this.jogo;
        }
        return null; 
    }
    public void Finalizar(){
    Pontos[IncrementaPonto]=jogo.FinalizarJogo()[0];
    IncrementaPonto++;
    Pontos[IncrementaPonto]=jogo.FinalizarJogo()[1];
    IncrementaPonto++;
    JogoRodando=false;
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
    public void ShowPoints(){
        for (int i = 0; i < Pontos.length; i++) {
            System.out.println(i+"-"+Pontos[i]);
        }
    }
}
