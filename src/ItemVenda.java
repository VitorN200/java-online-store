public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirDados() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println();
    }
}
