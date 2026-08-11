package pdv;

public abstract class Cartao extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String bandeira;
    private String cvv;

    public Cartao() {
        super();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    protected boolean validarCartao() {

        if (numeroCartao == null || numeroCartao.trim().isEmpty()) {
            System.out.println("Erro: o número do cartão deve ser informado.");
            return false;
        }

        if (nomeTitular == null || nomeTitular.trim().isEmpty()) {
            System.out.println("Erro: o nome do titular deve ser informado.");
            return false;
        }

        if (bandeira == null || bandeira.trim().isEmpty()) {
            System.out.println("Erro: a bandeira deve ser informada.");
            return false;
        }

        if (cvv == null || cvv.trim().isEmpty()) {
            System.out.println("Erro: o código de segurança deve ser informado.");
            return false;
        }

        return true;
    }

    protected void mostrarDadosCartao() {

        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Bandeira: " + bandeira);
        System.out.println("CVV: " + cvv);
    }
}