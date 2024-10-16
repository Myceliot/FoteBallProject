
package projetofootball;


public class Campeonatos {
    String vencedor;
    int numeroEdicao;
    int anoAssociado;
    String[] paisesOrganizadores;
    Estadio[] Estadios;
    
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
