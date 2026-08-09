package pdv;

import java.util.Scanner;

public class PDV {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("          SISTEMA PDV");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Operador de Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Listar Pagamentos");
            System.out.println("6 - Sair");
            System.out.println("==============================");

            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    Gerente gerente = new Gerente();

                    System.out.println("\n===== CADASTRO DE GERENTE =====");

                    System.out.print("ID: ");
                    gerente.setId(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Nome: ");
                    gerente.setNome(teclado.nextLine());

                    System.out.print("CPF: ");
                    gerente.setCPF(teclado.nextLine());

                    System.out.print("Salário: ");
                    gerente.setSalario(teclado.nextFloat());
                    teclado.nextLine();

                    System.out.print("Setor: ");
                    gerente.setSetor(teclado.nextLine());

                    System.out.print("Bônus: ");
                    gerente.setBonus(teclado.nextFloat());
                    teclado.nextLine();

                    loja.novoFuncionario(gerente);

                    break;

                case 2:

                    OperadorCaixa operador = new OperadorCaixa();

                    System.out.println("\n===== CADASTRO DE OPERADOR DE CAIXA =====");

                    System.out.print("ID: ");
                    operador.setId(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Nome: ");
                    operador.setNome(teclado.nextLine());

                    System.out.print("CPF: ");
                    operador.setCPF(teclado.nextLine());

                    System.out.print("Salário: ");
                    operador.setSalario(teclado.nextFloat());
                    teclado.nextLine();

                    System.out.print("Número do Caixa: ");
                    operador.setNumeroCaixa(teclado.nextInt());
                    teclado.nextLine();

                    loja.novoFuncionario(operador);

                    break;

                case 3:

                    Pagamento pagamento = new Pagamento();

                    System.out.println("\n===== REALIZAR PAGAMENTO =====");

                    System.out.print("Número do pagamento: ");
                    pagamento.setNumeroPagamento(teclado.nextInt());

                    System.out.print("Valor: R$ ");
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

                    loja.listarPagamentos();

                    break;

                case 6:

                    System.out.println("\nSistema encerrado.");

                    break;

                default:

                    System.out.println("\nOpção inválida!");

                    break;
            }

        } while (opcao != 6);

        teclado.close();
    }
}