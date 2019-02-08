package Projeto.modelo;

public abstract class Pedido {
    String numeroPedido;
    String dataPedido;
    String notaFiscal;

    public Pedido(String numeroPedido, String dataPedido, String notaFiscal) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.notaFiscal = notaFiscal;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
