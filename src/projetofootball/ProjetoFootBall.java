
package projetofootball;


import java.util.*;
public class ProjetoFootBall {

   
    public static void main(String[] args) {
        String[] Paises= {"a","b","c","d"};
        //Instancias Vazias Das Classes 
        Campeonatos campeonato= new Campeonatos();
        Estadio[] estadios = new Estadio[1];
        Selecoes[] selecoes = new Selecoes[48];
        Grupo grupo = new Grupo();
        //estadios
        estadios[0]= new Estadio();
        estadios[0].setCidadeDePaisAnfritriao("Portugal");
        estadios[0].setDesignaçao("MYC");
        estadios[0].setLotaçaoMaxima(10000);
        //selecoes
        selecoes[0]= new Selecoes();
        selecoes[0].setCapitaoDeEquipa("Miguel");
        selecoes[0].setMundiaisConquistados(10);
        selecoes[0].setNomeEApelidoDoSelecionador("Miguel Pereira");
        selecoes[0].setNumeroDePresencasEmMundiais(10);
        selecoes[0].setPaisRepresentante("Portugal");
        //Campeonato
        campeonato.setAnoAssociado(2000);
        campeonato.setEstadios(estadios);
        campeonato.setNumeroEdicao(2016);
        campeonato.setPaisesOrganizadores(Paises);
        //Grupo
        grupo.setEstadio(estadios[0]);
        grupo.setSelecoesTotal(selecoes);
    }
    
}
