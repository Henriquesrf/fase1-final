package sistemapdv;

public class Credito extends Cartao {

    private float limiteDisponivel;
    private int quantidadeParcelas;

    public Credito() {
        super();
        quantidadeParcelas = 1;
    }

    public Credito(int quantidadeParcelas) {
        super();
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public float getValorParcela() {
        if (quantidadeParcelas <= 0) {
            return 0;
        }

        return getValor() / quantidadeParcelas;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            System.out.println("Erro: o valor do pagamento deve ser maior que zero.");
            reprovarPagamento();
            return;
        }

        if (!validarCartao()) {
            reprovarPagamento();
            return;
        }

        if (quantidadeParcelas <= 0) {
            System.out.println("Erro: a quantidade de parcelas deve ser maior que zero.");
            reprovarPagamento();
            return;
        }

        if (limiteDisponivel < getValor()) {
            System.out.println("Pagamento não aprovado: limite insuficiente.");
            reprovarPagamento();
            return;
        }

        limiteDisponivel -= getValor();

        aprovarPagamento();

        System.out.println("Pagamento no crédito realizado com sucesso!");

        if (quantidadeParcelas == 1) {
            System.out.println("Pagamento à vista.");
        } else {
            System.out.println("Pagamento parcelado.");
            System.out.println("Valor total: R$ " + getValor());
            System.out.println("Quantidade de parcelas: " + quantidadeParcelas);
            System.out.println("Valor de cada parcela: R$ " + getValorParcela());
        }
    }

    @Override
    public void mostrarPagamento() {

        System.out.println("\n===== PAGAMENTO CARTÃO DE CRÉDITO =====");
        System.out.println("Número: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Status: " + getStatus());

        mostrarDadosCartao();

        System.out.println("Limite disponível: R$ " + limiteDisponivel);
        System.out.println("Quantidade de parcelas: " + quantidadeParcelas);

        if (quantidadeParcelas > 1) {
            System.out.println("Valor total da compra: R$ " + getValor());
            System.out.println("Valor de cada parcela: R$ " + getValorParcela());
        }
    }
}