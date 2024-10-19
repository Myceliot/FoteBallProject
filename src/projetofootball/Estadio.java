
package projetofootball;

public class Estadio {

    String designaçao;
    String cidadeDePaisAnfritriao;
    int lotaçaoMaxima;
    final static String DESEIGNACA_POR_OMISSAO = "Sem Dados";
    final static String CIDADEDEPAISANFRITRIAO_POR_OMISSAO = "Sem Dados";
    final static int LOTACAOMAXIMA_POR_OMISSAO = 0;

    //construçao Vazia
    public Estadio() {
        this.designaçao = DESEIGNACA_POR_OMISSAO;
        this.cidadeDePaisAnfritriao = CIDADEDEPAISANFRITRIAO_POR_OMISSAO;
        this.lotaçaoMaxima = LOTACAOMAXIMA_POR_OMISSAO;
    }
    //construçao do Estadio
    public Estadio(String designaçao, String cidadeDePaisAnfritriao, int lotaçaoMaxima) {
        this.designaçao = designaçao;
        this.cidadeDePaisAnfritriao = cidadeDePaisAnfritriao;
        this.lotaçaoMaxima = lotaçaoMaxima;
    }
    
}
