import modelos.Filme;

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

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
    }
}
