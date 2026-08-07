package pdv;

public class Pagamento {

    private int numeroPagamento;
    private float valor;
    private String modalidade;
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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void realizarPagamento() {

        if (valor <= 0) {
            System.out.println("Erro: o valor do pagamento deve ser maior que zero.");
            return;
        }

        if (modalidade == null || modalidade.trim().isEmpty()) {
            System.out.println("Erro: informe uma modalidade de pagamento.");
            return;
        }

        status = "APROVADO";
        System.out.println("Pagamento realizado com sucesso!");
    }

    public void mostrarPagamento() {

        System.out.println("\n===== PAGAMENTO =====");
        System.out.println("Número: " + numeroPagamento);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Status: " + status);
    }
}