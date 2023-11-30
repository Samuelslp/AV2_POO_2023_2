import java.util.ArrayList;
import java.util.Date;


public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;

    public Produto(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public boolean buscarProduto(Produto produto) {
        return this.nomeProduto.equals(produto.getNomeProduto());
    }
}