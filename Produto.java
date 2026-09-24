public class Produto {
    private String nome;
    private static double preco;
    private final int codigo;

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public static void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * (porcentagem / 100));
    }

    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public static void setPreco(double novoPreco) {
        preco = novoPreco;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 500);

        Produto.setPreco(150.0);

        double valor = p1.getPreco();
        System.out.println("Valor: " + valor);

        Produto.aplicarDesconto(10);
        System.out.println("Valor com desconto: " + p1.getPreco());
    }
}
