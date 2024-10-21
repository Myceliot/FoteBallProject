
package projetofootball;

public class Grupo {
    //12 grupos = 48 selecoes
    //1 grupo = 4 selecoes
    private Selecoes[] selecoesTotal;
    private Selecoes[] Grupo= new Selecoes[4];
    private Selecoes[][] SelecoesJogadoras= new Selecoes[6][2];
    private int PegaSelecoes=0;
    private int contagemDeJogosPorGrupo=0;
    private Estadio estadio;
    private boolean JogoRodando;
    private boolean JogoAgendado;
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
    //Forma Um grupo Usando uma linha muito complexa...
    public void FormarGrupo(Selecoes[] selecoes){
        for (int i = 0; i < Grupo.length; i++) {
            Grupo[i]=selecoesTotal[PegaSelecoes];
            PegaSelecoes++;
        }
        //1# 1-2
        SelecoesJogadoras[0][0]=Grupo[0];
        SelecoesJogadoras[0][1]=Grupo[1];
        //2# 1-3
        SelecoesJogadoras[1][0]=Grupo[0];
        SelecoesJogadoras[1][1]=Grupo[2];
        //3# 1-4
        SelecoesJogadoras[2][0]=Grupo[0];
        SelecoesJogadoras[2][1]=Grupo[3];
        //4# 2-3
        SelecoesJogadoras[3][0]=Grupo[1];
        SelecoesJogadoras[3][1]=Grupo[2];
        //5# 2-4
        SelecoesJogadoras[4][0]=Grupo[1];
        SelecoesJogadoras[4][1]=Grupo[3];
        //6# 3-4 Ultima
        SelecoesJogadoras[5][0]=Grupo[2];
        SelecoesJogadoras[5][1]=Grupo[3];
    }
    //auto explicativo Agenda um jogo caso nenhum esteja agendado
    public void AgendarJogo(){
        if (!JogoAgendado) {
            JogoAgendado=true;
        }else{
            System.out.println("Atualmente a jogo agendado tente outra hr");
        }
        
    }
    //Ve se tem jogo rodando e agendado, se nao tiver rodando mas estiver agendado tera a confirmaçao para comecar um novo Jogo
    public void ConfirmaçaoDeJogoPendente(){
    if(JogoRodando=true){
        System.out.println("A um jogo sendo feito");
    }else if(JogoRodando==false&&JogoAgendado==true){
        JogoSorter(SelecoesJogadoras);
        JogoAgendado=false;
        JogoRodando=true;
    }
    
    }
    //Define Que apenas 2 teams Estaram Jogando e serao sempre diferentes
    private void JogoSorter(Selecoes[][] Sorter){
        Selecoes[][] VS = new Selecoes[1][2];
        switch (contagemDeJogosPorGrupo) {
            case 0:
                VS[0][1]=Sorter[0][1];
                NoJogo(VS);
                break;
            case 1:
                VS[0][1]=Sorter[1][1];
                NoJogo(VS);
                break;
            case 2:
                VS[0][1]=Sorter[2][1];
                NoJogo(VS);
                break;
            case 3:
                VS[0][1]=Sorter[3][1];
                NoJogo(VS);
                break;
            case 4:
                VS[0][1]=Sorter[4][1];
                NoJogo(VS);
                break;
            case 5:
                VS[0][1]=Sorter[5][1];
                NoJogo(VS);
                break;
            default:
                System.out.println("Acabou");
        }
    }
    
    private Jogo NoJogo(Selecoes[][] selecoes){
        Jogo jogo= new Jogo(selecoes);
        return jogo;
    }
   
}
