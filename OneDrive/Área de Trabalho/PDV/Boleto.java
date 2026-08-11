package sistemapdv;

public class Boleto extends Pagamento {

    private String codigoBarras;

    public Boleto() {
        super();
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            System.out.println("Erro: o valor do pagamento deve ser maior que zero.");
            reprovarPagamento();
            return;
        }

        if (codigoBarras == null || codigoBarras.trim().isEmpty()) {
            System.out.println("Erro: o código de barras deve ser informado.");
            reprovarPagamento();
            return;
        }

        aprovarPagamento();

        System.out.println("Pagamento por boleto realizado com sucesso!");
    }

    @Override
    public void mostrarPagamento() {

        System.out.println("\n===== PAGAMENTO BOLETO =====");
        System.out.println("Número: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Status: " + getStatus());
        System.out.println("Código de barras: " + codigoBarras);
    }
}