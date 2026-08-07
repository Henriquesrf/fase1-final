package pdv;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Caixa> caixas;
    private ArrayList<Pagamento> pagamentos;

    public Loja() {
        funcionarios = new ArrayList<>();
        caixas = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    // ================= FUNCIONÁRIOS =================

    public void novoFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println();
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // ================= CAIXAS =================

    public void novoCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public void listarCaixas() {

        if (caixas.isEmpty()) {
            System.out.println("\nNenhum caixa cadastrado.");
            return;
        }

        for (Caixa caixa : caixas) {
            caixa.mostrarDados();
            System.out.println();
        }
    }

    public ArrayList<Caixa> getCaixas() {
        return caixas;
    }

    // ================= PAGAMENTOS =================

    public void novoPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarPagamentos() {

        if (pagamentos.isEmpty()) {
            System.out.println("\nNenhum pagamento registrado.");
            return;
        }

        for (Pagamento pagamento : pagamentos) {
            pagamento.mostrarPagamento();
            System.out.println();
        }
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

}