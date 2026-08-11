package sistemapdv;

public class Pix extends Pagamento {

    private String chavePix;

    public Pix() {
        super();
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            System.out.println("Erro: o valor do pagamento deve ser maior que zero.");
            reprovarPagamento();
            return;
        }

        if (chavePix == null || chavePix.trim().isEmpty()) {
            System.out.println("Erro: a chave PIX deve ser informada.");
            reprovarPagamento();
            return;
        }

        aprovarPagamento();

        System.out.println("Pagamento PIX realizado com sucesso!");
    }

    @Override
    public void mostrarPagamento() {

        System.out.println("\n===== PAGAMENTO PIX =====");
        System.out.println("Número: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Status: " + getStatus());
        System.out.println("Chave PIX: " + chavePix);
    }
}