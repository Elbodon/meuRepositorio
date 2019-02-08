package Projeto.modelo;

public class PedidoMesa extends Pedido {
    String mesa;
    public PedidoMesa(String numeroPedido, String dataPedido, String notaFiscal, String mesa) {
        super(numeroPedido, dataPedido, notaFiscal);
        this.mesa = mesa;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
}
