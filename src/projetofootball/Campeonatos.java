
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
       
}
