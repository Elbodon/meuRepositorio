package Projeto.modelo;

public class Prato extends Produto{
    String tipo;

    public Prato(String nome, String codProduto, String preco, String tipo) {
        super(nome, codProduto, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
