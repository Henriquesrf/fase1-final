package pdv;

public class Debito extends Cartao {

    private float saldoDisponivel;
    private String senha;

    public Debito() {
        super();
    }

    public float getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(float saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

        if (senha == null || senha.trim().isEmpty()) {
            System.out.println("Erro: a senha do cartão deve ser informada.");
            reprovarPagamento();
            return;
        }

        if (saldoDisponivel < getValor()) {
            System.out.println("Pagamento não aprovado: saldo insuficiente.");
            reprovarPagamento();
            return;
        }

        saldoDisponivel -= getValor();

        aprovarPagamento();

        System.out.println("Pagamento no débito realizado com sucesso!");
    }

    @Override
    public void mostrarPagamento() {

        System.out.println("\n===== PAGAMENTO CARTÃO DE DÉBITO =====");
        System.out.println("Número: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Status: " + getStatus());

        mostrarDadosCartao();

        System.out.println("Saldo disponível: R$ " + saldoDisponivel);
        System.out.println("Senha: " + senha);
    }
}