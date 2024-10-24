
package projetofootball;

public class Campeonatos {
    //Atributos
    private String vencedor;
    private int numeroEdicao;
    private int anoAssociado;
    private String[] paisesOrganizadores;
    private Estadio[] estadios ;
    private int numeroParticipantes;
    private int numeroSelecoesInscritas;
    private Selecoes[] selecoes;
    
    
    //Constantes
    private int numeroEdicao_POR_OMISSAO=0;
    private int anoAssociado_POR_OMISSAO=0;
    private static final String[] paisesOrganizadores_POR_OMISSAO={""};
    private static final Estadio[] estadios_POR_OMISSAO = new Estadio[1];
    private static final int NUMERO_PARTICIPANTES_POR_OMISSAO=0;
    //construçao Vazia
    public Campeonatos() {
        this.numeroEdicao = numeroEdicao_POR_OMISSAO;
        this.anoAssociado = anoAssociado_POR_OMISSAO;
        this.paisesOrganizadores = paisesOrganizadores_POR_OMISSAO;
        this.estadios = estadios_POR_OMISSAO;
        this.numeroParticipantes = NUMERO_PARTICIPANTES_POR_OMISSAO;
    }
    //construçao do Campeonato

    public Campeonatos(int anoAssociado, int numeroParticipantes) {
        this.anoAssociado = anoAssociado;
        this.numeroParticipantes = numeroParticipantes;
        this.selecoes = new Selecoes[numeroParticipantes];
    }
    
    public void AdicionaSelecao(Selecoes selecoes){
    this.selecoes[numeroSelecoesInscritas]=selecoes;
           numeroSelecoesInscritas++;
    
    
    }

    public Selecoes[] getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(Selecoes[] selecoes) {
        this.selecoes = selecoes;
    }
    
    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getAnoAssociado() {
        return anoAssociado;
    }

    public void setAnoAssociado(int anoAssociado) {
        this.anoAssociado = anoAssociado;
    }

    public String[] getPaisesOrganizadores() {
        return paisesOrganizadores;
    }

    public void setPaisesOrganizadores(String[] paisesOrganizadores) {
        this.paisesOrganizadores = paisesOrganizadores;
    }

    public Estadio[] getEstadios() {
        return estadios;
    }

    public void setEstadios(Estadio[] Estadios) {
        this.estadios = Estadios;
    }
    
       
}
