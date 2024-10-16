
package projetofootball;

public class Selecoes {
    String paisRepresentante;
    String nomeEApelidoDoSelecionador;
    String capitaoDeEquipa;
    int numeroDePresencasEmMundiais;
    int mundiaisConquistados;

    //construçao Vazia
    public Selecoes() {
    }

    //construçao da Selecao
    public Selecoes(String paisRepresentante, String nomeEApelidoDoSelecionador, String capitaoDeEquipa, int numeroDePresencasEmMundiais, int mundiaisConquistados) {
        this.paisRepresentante = paisRepresentante;
        this.nomeEApelidoDoSelecionador = nomeEApelidoDoSelecionador;
        this.capitaoDeEquipa = capitaoDeEquipa;
        this.numeroDePresencasEmMundiais = numeroDePresencasEmMundiais;
        this.mundiaisConquistados = mundiaisConquistados;
    }
    
}
