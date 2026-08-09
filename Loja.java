package pdv;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Pagamento> pagamentos;

    public Loja() {
        funcionarios = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    public boolean novoFuncionario(Funcionario funcionario) {

        for (Funcionario f : funcionarios) {

            if (f.getId() == funcionario.getId()) {
                System.out.println("Erro: já existe um funcionário com esse ID.");
                return false;
            }
        }

        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");

        return true;
    }

    public void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n===== FUNCIONÁRIOS CADASTRADOS =====");

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println();
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void novoPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarPagamentos() {

        if (pagamentos.isEmpty()) {
            System.out.println("\nNenhum pagamento registrado.");
            return;
        }

        System.out.println("\n===== PAGAMENTOS =====");

        for (Pagamento pagamento : pagamentos) {
            pagamento.mostrarPagamento();
            System.out.println();
        }
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }
}