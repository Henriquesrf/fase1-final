package sistemapdv;

public abstract class Pagamento {

    private int numeroPagamento;
    private float valor;
    private String status;

    public Pagamento() {
        status = "PENDENTE";
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    protected void aprovarPagamento() {
        status = "APROVADO";
    }

    protected void reprovarPagamento() {
        status = "REPROVADO";
    }

    public abstract void realizarPagamento();

    public abstract void mostrarPagamento();
}