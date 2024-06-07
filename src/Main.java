import br.com.porz.gerenciamento.Loja;
import br.com.porz.gerenciamento.ProdutoAlimentar;
import br.com.porz.gerenciamento.ProdutoEletronico;

public class Main {
    public static void main(String[] args) {

        Loja CasasBahia = new Loja(3);

        ProdutoAlimentar banana = new ProdutoAlimentar("Banana", "6422", 4.99, 5, "19/06/2024");
        ProdutoAlimentar carambola = new ProdutoAlimentar("Carambola", "5623", 5.98, 6, "15/06/2024");

        ProdutoEletronico computer = new ProdutoEletronico("Acer","4312", 459.99, 3, "5");
        ProdutoEletronico iphone = new ProdutoEletronico("Iphone 19", "7983", 7999.90, 1, "7");


        CasasBahia.adicionarProduto(banana);
        CasasBahia.adicionarProduto(carambola);
        CasasBahia.adicionarProduto(computer);
        CasasBahia.adicionarProduto(iphone);

        CasasBahia.listarProdutos();


    }
}