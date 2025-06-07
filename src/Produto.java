public class Produto {

    private String nome;
    private double preco;
    private String unidade;

    public Produto(String nome, double preco, String unidade) {
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Unidade: " + unidade);
        System.out.println("Preço: R$ " + preco);
        System.out.println();
    }
}
