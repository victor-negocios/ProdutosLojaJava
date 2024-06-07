package br.com.porz.gerenciamento;

public class Loja {

    int indiceProduto = 0;
    Produto[] produtos;

    public Loja(int quantidadeProdutos) {
        produtos = new Produto[quantidadeProdutos];
    }

    public void adicionarProduto(Produto produto) {
        if(indiceProduto < produtos.length){
            produtos[indiceProduto] = produto;
            indiceProduto++;
        }  else{
            System.out.println("Não é possivel adicionar mais produtos!");
        }
    }

    public void listarProdutos() {
        for (int i = 0; i < indiceProduto; i++) {
            System.out.printf("""
                    ****************************************************
                    Nome: %s       
                    Preço: %.2f                    
                    Código: %s
                    Quantidade Estq.: %d
                    **************************************************** %n
                    """, produtos[i].getNome(), produtos[i].getPreco(), produtos[i].getCodigo(), produtos[i].getQuantidadeEmEstoque());
        }
    }
}
