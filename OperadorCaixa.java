package sistemapdv;

public class OperadorCaixa extends Funcionario {

    private int numeroCaixa;
    private String status;
    private int senha;

    public OperadorCaixa(int numeroCaixa, String status, int id, String nome, String CPF, float salario, String cargo, int senha) {
        super(id, nome, CPF, salario, cargo);
        this.numeroCaixa = numeroCaixa;
        this.status = status;
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
    }

    public void fecharCaixa() {
        status = "FECHADO";
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n===== DADOS DO OPERADOR DE CAIXA =====");
        super.mostrarDados();
        System.out.println("Número do Caixa: " + numeroCaixa);
        System.out.println("Status do Caixa: " + status);
    }
}