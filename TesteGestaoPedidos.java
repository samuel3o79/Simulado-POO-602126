public class TesteGestaoPedidos {
    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();

        gestao.adicionarPedido("Pizza");
        gestao.adicionarPedido("Refrigerante");
        gestao.adicionarPedido("Sobremesa");

        String atendido = gestao.proximoPedido();
        System.out.println("Pedido atendido: " + atendido);

        System.out.println("Pedidos restantes: " + gestao.quantidadePendentes());
        gestao.listarPedidos();
    }
}
