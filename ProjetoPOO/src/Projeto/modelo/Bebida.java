package Projeto.modelo;

public class Bebida extends Produto {
    String classe;
    String idade;
    public Bebida(String nome, String codProduto, String preco, String classe, String idade) {
        super(nome, codProduto, preco);
        this.classe = classe;
        this.idade = idade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
