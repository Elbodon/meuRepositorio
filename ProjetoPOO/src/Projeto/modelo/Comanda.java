package Projeto.modelo;

public class Comanda {
    protected String numeroComanda;
    String mesa;
    String valor;

    public Comanda(String numeroComanda, String mesa, String valor) {
        this.numeroComanda = numeroComanda;
        this.mesa = mesa;
        this.valor = valor;
    }

    public String getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(String numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
