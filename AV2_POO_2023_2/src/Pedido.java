import java.util.ArrayList;
import java.util.Date;


public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido = new ArrayList<>();

    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem item) {
        this.itensPedido.add(item);
    }

    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
    }

    public double calculaTotalPagar() {
        double total = 0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoItem();
        }
        return total;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }
}
