public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirDados() {
        System.out.print("Produto: " + produto.getNome());
        System.out.print("  Quantidade: " + quantidade);
        System.out.println("  Valor: R$ " + valorTotal);
    }
}
