package br.com.porz.gerenciamento;

public abstract class Produto {
    private String nome, codigo;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, String codigo, double preco, int quantidadeEmEstoque) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O campo 'Nome' não pode estar vazio!");
        }

        if(codigo.isEmpty()){
            throw new IllegalArgumentException("O campo 'Codigo' não pode estar vazio!");
        }

        if(preco <= 0){
            throw new IllegalArgumentException("O campo 'Preco' não pode estar vazio!");
        }

        if(quantidadeEmEstoque <= 0){
            throw new IllegalArgumentException("O campo 'Quantidade de Estoque' não pode estar vazio!");
        }

        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
       if(nome.isEmpty()){
           throw new IllegalArgumentException("O campo 'Nome' não pode estar vazio!");
       }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("O preço não pode ter valor negativo!");
        }
        this.preco = preco;
    }


    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ter valor negativo!");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
