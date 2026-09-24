public class TesteLivraria {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Livro livro1 = new Livro("Dom Casmurro", 39.90, autor1);

        livro1.exibirDetalhes();
    }
}
