
package projetofootball;

public class Selecoes {
    String paisRepresentante;
    String nomeEApelidoDoSelecionador;
    String capitaoDeEquipa;
    int numeroDePresencasEmMundiais;
    int mundiaisConquistados;
    final static String PAISREPRESENTANTE_POR_OMISSAO="SEM PAIS";
    final static String NOMEEAPELIDODOREPRESENTANTE_POR_OMISSAO="SEM NOME && APELIDO";
    final static String CAPITAODEEQUIPA_POR_OMISSAO="SEM CAPITAO";
    final static int NUMERODEPRESENCASEMMUNDIAIS_POR_OMISSAO=0;
    final static int MUNDIAISCONQUISTADOS_POR_OMISSAO=0;
    //construçao Vazia
    public Selecoes() {
        this.paisRepresentante = PAISREPRESENTANTE_POR_OMISSAO;
        this.nomeEApelidoDoSelecionador = NOMEEAPELIDODOREPRESENTANTE_POR_OMISSAO;
        this.capitaoDeEquipa = CAPITAODEEQUIPA_POR_OMISSAO;
        this.numeroDePresencasEmMundiais = NUMERODEPRESENCASEMMUNDIAIS_POR_OMISSAO;
        this.mundiaisConquistados = MUNDIAISCONQUISTADOS_POR_OMISSAO;
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
