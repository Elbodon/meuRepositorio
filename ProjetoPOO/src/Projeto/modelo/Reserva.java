package Projeto.modelo;

public class Reserva {
    protected String numeroReserva;
    int numeroPessoas;
    int mesa;

    public Reserva(String numeroReserva, int numeroPessoas, int mesa) {
        this.numeroReserva = numeroReserva;
        this.numeroPessoas = numeroPessoas;
        this.mesa = mesa;
    }

    public String getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(String numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
