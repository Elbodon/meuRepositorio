package Projeto.modelo;

public abstract class Produto {
    String nome;
    String codProduto;
    String preco;

    public Produto(String nome, String codProduto, String preco) {
        this.nome = nome;
        this.codProduto = codProduto;
        this.preco = preco;
    }

}
