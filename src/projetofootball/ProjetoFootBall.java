package projetofootball;

import java.util.*;

public class ProjetoFootBall {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("1-Padrao ou 2-custom? ");
        switch(sc.nextInt()){
            case 1:
                Padrao();
                break;
            case 2:
                Custom();
                break;
            default:
                System.out.println("Nao sou pago o suficiente.");
                System.exit(999999999);
        
        
        }
        
        
       
        
    }
    public static void Custom(){
     //==========================================
        Scanner sc = new Scanner(System.in);
        int NumeroEstadios;
        int NumeroParticipantes;
        
        //==========================================
        System.out.println("[===================================]");
        System.out.println("Insira Quantidade De Estadios");
        NumeroEstadios = sc.nextInt();
        System.out.println("Insira Numero De Selecoes Participantes");
        NumeroParticipantes = sc.nextInt();
        System.out.println("[===================================]");
        //==========================================
        Campeonatos campeonato = new Campeonatos();
        Estadio[] estadios = new Estadio[NumeroEstadios];
        Selecoes[] selecoes = new Selecoes[48];
        Grupo grupo = new Grupo();
        //Estadios
        System.out.println("Config Estadio/s");
        for (int i = 0; i < NumeroEstadios; i++) {
            estadios[i] = new Estadio();
            System.out.println("Cidade Pais Anfritriao");
            estadios[i].setCidadeDePaisAnfritriao(sc.next());
            System.out.println("Designacao");
            estadios[i].setDesignaçao(sc.next());
            System.out.println("Lotaçao Maxima");
            estadios[i].setLotaçaoMaxima(sc.nextInt());
        }
        //Campeonato
        System.out.println("Config Campeonato");
        campeonato.setNumeroParticipantes(NumeroParticipantes);
        System.out.println("Ano Associado");
        campeonato.setAnoAssociado(sc.nextInt());
        System.out.println("Numero Edicao");
        campeonato.setNumeroEdicao(sc.nextInt());
        System.out.println("Quantidade De Paises");
        String[] Paises = new String[sc.nextInt()];
        for (int i = 0; i < Paises.length; i++) {
            System.out.println("Adiciona Pais");
            Paises[i] = sc.next();
        }
        campeonato.setPaisesOrganizadores(Paises);
        for (int i = 0; i < NumeroParticipantes; i++) {
            System.out.println("Adiciona Selecoes" + i + "#");
            selecoes[i] = new Selecoes();
            System.out.println("Capitao De Equipa");
            selecoes[i].setCapitaoDeEquipa(sc.next());
            System.out.println("Mundiais Conquistados");
            selecoes[i].setMundiaisConquistados(sc.nextInt());
            System.out.println("Nome e Apelido Do Selecionador");
            selecoes[i].setNomeEApelidoDoSelecionador(sc.next());
            System.out.println("Numero De Presenças Em Mundiais");
            selecoes[i].setNumeroDePresencasEmMundiais(sc.nextInt());
            System.out.println("Pais Representante");
            selecoes[i].setPaisRepresentante(sc.next());
        }
        //Grupo
        System.out.println("Seleciona O estadio Do Grupo Tem:" + estadios.length);
        grupo.setEstadio(estadios[sc.nextInt()]);
        grupo.setSelecoesTotal(campeonato.getSelecoes());
        System.out.println("1-Formar Grupo");
        System.out.println("2-Agendar Grupo");
        System.out.println("3-Confirmacao de Jogo Pendente Grupo");
        System.out.println("4-Teams no Jogo");
        System.out.println("5-Team A Marca Golo");
        System.out.println("6-Team B Marca Golo");
        System.out.println("7-Score Atual");
        System.out.println("8-Finalizar Jogo");
        switch(sc.nextInt()){
            case 1:
                grupo.FormarGrupo();
                break;
            case 2:
                grupo.AgendarJogo();
                break;
            case 3:
                grupo.ConfirmaçaoDeJogoPendente();
                break;
            case 4:
                grupo.NoJogo().TEAMSDEBUG();
                break;
            case 5:
                grupo.NoJogo().TeamAMakeGoal();
                break;
            case 6:
                grupo.NoJogo().TeamBMakeGoal();
                break;
            case 7:
                grupo.NoJogo().Score();
                break;
            case 8:
                grupo.Finalizar();
                break;
            default:
                System.out.println("1,2,3,4,5,6,7,8!");
        
        
        
        }
    }
    public static void Padrao(){
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
