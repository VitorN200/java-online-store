import java.util.ArrayList;

public class Venda {
    private Usuario usuario;
    private ArrayList<ItemVenda> itens;

    public Venda(Usuario usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public void exibirDados() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Itens da Venda:");
        for (ItemVenda item : itens) {
            item.exibirDados();
        }
    }
}
