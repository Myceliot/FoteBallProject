
package projetofootball;



public class Selecoes {
    private String paisRepresentante;
    private String nomeEApelidoDoSelecionador;
    private String capitaoDeEquipa;
    private int numeroDePresencasEmMundiais;
    private int mundiaisConquistados;
    private final static String PAISREPRESENTANTE_POR_OMISSAO="SEM PAIS";
    private final static String NOMEEAPELIDODOREPRESENTANTE_POR_OMISSAO="SEM NOME && APELIDO";
    private final static String CAPITAODEEQUIPA_POR_OMISSAO="SEM CAPITAO";
    private final static int NUMERODEPRESENCASEMMUNDIAIS_POR_OMISSAO=0;
    private final static int MUNDIAISCONQUISTADOS_POR_OMISSAO=0;
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

    public String getPaisRepresentante() {
        return paisRepresentante;
    }

    public void setPaisRepresentante(String paisRepresentante) {
        this.paisRepresentante = paisRepresentante;
    }

    public String getNomeEApelidoDoSelecionador() {
        return nomeEApelidoDoSelecionador;
    }

    public void setNomeEApelidoDoSelecionador(String nomeEApelidoDoSelecionador) {
        this.nomeEApelidoDoSelecionador = nomeEApelidoDoSelecionador;
    }

    public String getCapitaoDeEquipa() {
        return capitaoDeEquipa;
    }

    public void setCapitaoDeEquipa(String capitaoDeEquipa) {
        this.capitaoDeEquipa = capitaoDeEquipa;
    }

    public int getNumeroDePresencasEmMundiais() {
        return numeroDePresencasEmMundiais;
    }

    public void setNumeroDePresencasEmMundiais(int numeroDePresencasEmMundiais) {
        this.numeroDePresencasEmMundiais = numeroDePresencasEmMundiais;
    }

    public int getMundiaisConquistados() {
        return mundiaisConquistados;
    }

    public void setMundiaisConquistados(int mundiaisConquistados) {
        this.mundiaisConquistados = mundiaisConquistados;
    }

    @Override
    public String toString() {
        return "Selecoes{" + "paisRepresentante=" + paisRepresentante + ", nomeEApelidoDoSelecionador=" + nomeEApelidoDoSelecionador + ", capitaoDeEquipa=" + capitaoDeEquipa + ", numeroDePresencasEmMundiais=" + numeroDePresencasEmMundiais + ", mundiaisConquistados=" + mundiaisConquistados + '}';
    }
    
}
