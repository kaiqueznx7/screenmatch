import calculos.CalculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Diario de uma paixão");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setAnoDeLancamento(126);
        meuFilme.setDuracaoEmMinutos(180);


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
        serie.setMinutosPorEpsodio(50);

        System.out.println("Nome da série: " + serie.getNome());
        System.out.println("Número de temporadas: " + serie.getTemporadas());
        System.out.println("Epsódios por temporada: " + serie.getEpPorTemporada());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setAnoDeLancamento(126);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(serie);
        System.out.println(calc.getTempoTotal());


    }
}
