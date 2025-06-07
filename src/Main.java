public class Main {
    public static void main(String[] args) {

        // Criando usuários
        Usuario usuario1 = new Usuario("João Silva", "123.456.789-00", "joao@gmail.com");
        Usuario usuario2 = new Usuario("Maria Silva", "124.498.852-02", "maria@gmail.com");
        // Criando produtos
        Produto produto1 = new Produto("Arroz", 19.90, "5kg");
        Produto produto2 = new Produto("Feijão", 9.90, "2kg");
        Produto produto3 = new Produto("Macarrão", 5.49, "500g");
        Produto produto4 = new Produto("Óleo", 8.40, "900ml");
        Produto produto5 = new Produto("Açúcar", 3.20, "1kg");

        //Criando uma venda para cada usuário
        Venda venda1 = new Venda(usuario1);
        venda1.adicionarItem(produto1, 1);
        venda1.adicionarItem(produto2, 2);
        venda1.adicionarItem(produto5, 1);
        Venda venda2 = new Venda(usuario2);
        venda2.adicionarItem(produto3, 3);
        venda2.adicionarItem(produto4, 2);
        
        // Exibindo dados das vendas
        System.out.println("Dados da Venda 1:");
        venda1.exibirDados();
        System.out.println("Dados da Venda 2:");
        venda2.exibirDados();
    }
}
