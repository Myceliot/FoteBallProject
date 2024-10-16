
package projetofootball;

public class Estadio {
    String designaçao;
    String cidadeDePaisAnfritriao;
    int lootaçaoMaxima;
    
    //construçao Vazia
    public Estadio() {
    }
    //construçao do Estadio
    public Estadio(String designaçao, String cidadeDePaisAnfritriao, int lootaçaoMaxima) {
        this.designaçao = designaçao;
        this.cidadeDePaisAnfritriao = cidadeDePaisAnfritriao;
        this.lootaçaoMaxima = lootaçaoMaxima;
    }
    
}
