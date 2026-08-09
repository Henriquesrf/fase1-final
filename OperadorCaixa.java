package pdv;

public class OperadorCaixa extends Funcionario {

    private int numeroCaixa;
    private String status;

    public OperadorCaixa() {
        setCargo("Operador de Caixa");
        status = "FECHADO";
    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public String getStatus() {
        return status;
    }

    public void abrirCaixa() {
        status = "ABERTO";
        System.out.println("Caixa aberto com sucesso!");
    }

    public void fecharCaixa() {
        status = "FECHADO";
        System.out.println("Caixa fechado com sucesso!");
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n===== DADOS DO OPERADOR DE CAIXA =====");
        super.mostrarDados();
        System.out.println("Número do Caixa: " + numeroCaixa);
        System.out.println("Status do Caixa: " + status);
    }
}