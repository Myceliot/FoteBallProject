
package projetofootball;


public class Campeonatos {
    private String vencedor;
    private int numeroEdicao;
    private int anoAssociado;
    private String[] paisesOrganizadores;
    private Estadio[] Estadios;
    
    //construçao Vazia
    public Campeonatos() {
    }
    //construçao do Campeonato
    public Campeonatos(String vencedor, int numeroEdicao, int anoAssociado, String[] paisesOrganizadores, Estadio[] Estadios) {
        this.vencedor = vencedor;
        this.numeroEdicao = numeroEdicao;
        this.anoAssociado = anoAssociado;
        this.paisesOrganizadores = paisesOrganizadores;
        this.Estadios = Estadios;
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
