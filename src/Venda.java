import java.util.ArrayList;

public class Venda {
    private Usuario usuario;
    private ArrayList<ItemVenda> itens;

    public Venda(Usuario usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemVenda item = new ItemVenda(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            item.exibirDados();
            total += item.getValorTotal();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    public void exibirDados() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Itens da Venda:");
        System.out.println("Total da Venda: R$ " + calcularTotal() + "\n");	
    }
}
