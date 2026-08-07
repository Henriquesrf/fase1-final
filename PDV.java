package pdv;

import java.util.Scanner;

public class PDV {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Listar Caixas");
            System.out.println("6 - Listar Pagamentos");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    Funcionario funcionario = new Funcionario();

                    System.out.print("ID: ");
                    funcionario.setId(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Nome: ");
                    funcionario.setNome(teclado.nextLine());

                    System.out.print("CPF: ");
                    funcionario.setCPF(teclado.nextLine());

                    System.out.print("Salário: ");
                    funcionario.setSalario(teclado.nextFloat());
                    teclado.nextLine();

                    System.out.print("Cargo: ");
                    funcionario.setCargo(teclado.nextLine());

                    loja.novoFuncionario(funcionario);

                    System.out.println("Funcionário cadastrado com sucesso!");

                    break;

                case 2:

                    if (loja.getFuncionarios().isEmpty()) {
                        System.out.println("Cadastre um funcionário primeiro.");
                        break;
                    }

                    Caixa caixa = new Caixa();

                    System.out.print("Número do Caixa: ");
                    caixa.setNumeroCaixa(teclado.nextInt());

                    System.out.println("\nFuncionários:");

                    for (int i = 0; i < loja.getFuncionarios().size(); i++) {

                        System.out.println(i + " - "
                                + loja.getFuncionarios().get(i).getNome());

                    }

                    System.out.print("Escolha o operador: ");
                    int indice = teclado.nextInt();

                    if (indice >= 0 && indice < loja.getFuncionarios().size()) {

                        caixa.setOperador(loja.getFuncionarios().get(indice));
                        caixa.abrirCaixa();

                        loja.novoCaixa(caixa);

                        System.out.println("Caixa cadastrado com sucesso!");

                    } else {

                        System.out.println("Funcionário inválido.");

                    }

                    break;

                case 3:

                    Pagamento pagamento = new Pagamento();

                    System.out.print("Número do pagamento: ");
                    pagamento.setNumeroPagamento(teclado.nextInt());

                    System.out.print("Valor: ");
                    pagamento.setValor(teclado.nextFloat());
                    teclado.nextLine();

                    System.out.print("Modalidade (Dinheiro, PIX, Cartão): ");
                    pagamento.setModalidade(teclado.nextLine());

                    pagamento.realizarPagamento();

                    if (pagamento.getStatus().equals("APROVADO")) {

                        loja.novoPagamento(pagamento);

                    }

                    break;

                case 4:

                    loja.listarFuncionarios();

                    break;

                case 5:

                    loja.listarCaixas();

                    break;

                case 6:

                    loja.listarPagamentos();

                    break;

                case 7:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 7);

        teclado.close();

    }

}