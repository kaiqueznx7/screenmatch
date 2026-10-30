import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Diario de uma paixão");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setAnoDeLancamento(126);


        meuFilme.exibirFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);
        meuFilme.avaliacao(5);

        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2010);
        serie.setTemporadas(7);
        serie.setEpPorTemporada(12);
    }
}
