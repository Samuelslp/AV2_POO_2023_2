import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();


        listaProdutos.add(new Produto("Arroz", 10.0, "Desc1", 50));
        listaProdutos.add(new Produto("Feijao", 20.0, "Desc2", 30));
        listaProdutos.add(new Produto("Batata", 15.0, "Desc3", 40));
        listaProdutos.add(new Produto("Macarrao", 25.0, "Desc4", 20));
        listaProdutos.add(new Produto("alface", 30.0, "Desc5", 60));


        ArrayList<Pedido> listaPedidos = new ArrayList<>();


        Pedido pedido1 = new Pedido(1, new Date(), 0.0, 1);
        PedidoItem item1 = new PedidoItem("Arroz", 2, 10.0);
        PedidoItem item2 = new PedidoItem("feijao", 3, 20.0);


        if (listaProdutos.contains(getProdutoPorNome(listaProdutos, item1.getNomeItem()))
                && listaProdutos.contains(getProdutoPorNome(listaProdutos, item2.getNomeItem()))) {

            pedido1.inserirItensPedido(item1);
            pedido1.inserirItensPedido(item2);

            for (PedidoItem item : pedido1.getItensPedido()) {
                Produto produtoCorrespondente = getProdutoPorNome(listaProdutos, item.getNomeItem());
                if (produtoCorrespondente != null) {
                    int novoEstoque = produtoCorrespondente.getEstoqueAtual() - item.getQtdeItem();
                    produtoCorrespondente.setEstoqueAtual(novoEstoque);
                }
            }

            pedido1.setStatusPedido(2);


            double totalPagarPedido1 = pedido1.calculaTotalPagar();
            pedido1.setPrecoTotal(totalPagarPedido1);


            listaPedidos.add(pedido1);
        }

        for (Pedido pedido : listaPedidos) {
            System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
            System.out.println("Data e Hora do Pedido: " + pedido.getDataHoraPedido());
            System.out.println("Status do Pedido: " + pedido.getStatusPedido());
            System.out.println("Preço Total do Pedido: " + pedido.getPrecoTotal());

            System.out.println("Itens do Pedido:");
            for (PedidoItem item : pedido.getItensPedido()) {
                System.out.println("- Nome do Item: " + item.getNomeItem());
                System.out.println("  Quantidade: " + item.getQtdeItem());
                System.out.println("  Preço Unitário: " + item.getPrecoItem());
            }
            
        }
    }

    private static Produto getProdutoPorNome(ArrayList<Produto> listaProdutos, String nomeProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(nomeProduto)) {
                return produto;
            }
        }
        return null;
    }
}
