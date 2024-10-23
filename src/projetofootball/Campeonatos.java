
package projetofootball;

public class Campeonatos {
    private String vencedor;
    private int numeroEdicao;
    private int anoAssociado;
    private String[] paisesOrganizadores;
    private Estadio[] Estadios ;
    private Selecoes[] selecoes;
    private int numeroEdicao_POR_OMISSAO=0;
    private int anoAssociado_POR_OMISSAO=0;
    private String[] paisesOrganizadores_POR_OMISSAO={""};
    private Estadio[] Estadios_POR_OMISSAO={new Estadio()};
    private Selecoes[] selecoes_POR_OMISSAO={new Selecoes()};
    //construçao Vazia
    public Campeonatos() {
        this.selecoes= selecoes_POR_OMISSAO;
        this.numeroEdicao = numeroEdicao_POR_OMISSAO;
        this.anoAssociado = anoAssociado_POR_OMISSAO;
        this.paisesOrganizadores = paisesOrganizadores_POR_OMISSAO;
        this.Estadios = Estadios_POR_OMISSAO;
    }
    //construçao do Campeonato
    public Campeonatos(int numeroEdicao, int anoAssociado, String[] paisesOrganizadores, Estadio[] Estadios, Selecoes[] selecoes) {
        this.selecoes=selecoes;
        this.numeroEdicao = numeroEdicao;
        this.anoAssociado = anoAssociado;
        this.paisesOrganizadores = paisesOrganizadores;
        this.Estadios = Estadios;
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
        return Estadios;
    }

    public void setEstadios(Estadio[] Estadios) {
        this.Estadios = Estadios;
    }
    
       
}
