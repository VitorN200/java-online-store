public class Produto {

    private String nome;
    private double preco;
    private String counteudo;

    public Produto(String nome, double preco, String counteudo) {
        this.nome = nome;
        this.preco = preco;
        this.counteudo = counteudo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Unidade: " + counteudo);
        System.out.println("Preço: R$ " + preco);
        System.out.println();
    }
}
