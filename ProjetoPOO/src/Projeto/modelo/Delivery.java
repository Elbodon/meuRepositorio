package Projeto.modelo;

public class Delivery extends Pedido {

    String valor;
    public Delivery(String numeroPedido, String dataPedido, String notaFiscal, String valor) {
        super(numeroPedido, dataPedido, notaFiscal);
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
