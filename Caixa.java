package pdv;

public class Caixa {

    private int numeroCaixa;
    private Funcionario operador;
    private boolean status; // true = aberto | false = fechado

    public Caixa() {
        status = false;
    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public Funcionario getOperador() {
        return operador;
    }

    public void setOperador(Funcionario operador) {
        this.operador = operador;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirCaixa() {
        status = true;
    }

    public void fecharCaixa() {
        status = false;
    }

    public void mostrarDados() {

        System.out.println("\n===== DADOS DO CAIXA =====");
        System.out.println("Número do Caixa: " + numeroCaixa);

        if (operador != null) {
            System.out.println("Operador: " + operador.getNome());
        } else {
            System.out.println("Operador: Não definido");
        }

        if (status) {
            System.out.println("Status: ABERTO");
        } else {
            System.out.println("Status: FECHADO");
        }
    }
}