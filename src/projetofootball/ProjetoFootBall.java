
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
        //selecoes #2
        selecoes[1]= new Selecoes();
        selecoes[1].setCapitaoDeEquipa("Tulio");
        selecoes[1].setMundiaisConquistados(10);
        selecoes[1].setNomeEApelidoDoSelecionador("Tulio Rogerio");
        selecoes[1].setNumeroDePresencasEmMundiais(10);
        selecoes[1].setPaisRepresentante("Gracia");
        //selecoes #3
        selecoes[2]= new Selecoes();
        selecoes[2].setCapitaoDeEquipa("Lucas");
        selecoes[2].setMundiaisConquistados(10);
        selecoes[2].setNomeEApelidoDoSelecionador("Lucas Pinto");
        selecoes[2].setNumeroDePresencasEmMundiais(10);
        selecoes[2].setPaisRepresentante("Chile");
        //selecoes #4
        selecoes[3]= new Selecoes();
        selecoes[3].setCapitaoDeEquipa("Guilherme");
        selecoes[3].setMundiaisConquistados(10);
        selecoes[3].setNomeEApelidoDoSelecionador("Guilherme Moura");
        selecoes[3].setNumeroDePresencasEmMundiais(10);
        selecoes[3].setPaisRepresentante("Argentina");
        //Campeonato
        campeonato.setAnoAssociado(2000);
        //campeonato.setEstadios(estadios);
        campeonato.setNumeroEdicao(2016);
        campeonato.setPaisesOrganizadores(Paises);
        //Grupo
        grupo.setEstadio(estadios[0]);
        grupo.setSelecoesTotal(selecoes);
        grupo.FormarGrupo();
        grupo.AgendarJogo();
        grupo.ConfirmaçaoDeJogoPendente();
        grupo.NoJogo().TEAMSDEBUG();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamBMakeGoal();
        grupo.NoJogo().Score();
        grupo.Finalizar();
        grupo.AgendarJogo();
        grupo.ConfirmaçaoDeJogoPendente();
        grupo.NoJogo().TEAMSDEBUG();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamAMakeGoal();
        grupo.NoJogo().TeamBMakeGoal();
        grupo.NoJogo().Score();
        grupo.Finalizar();
        
        
    }
    
}
