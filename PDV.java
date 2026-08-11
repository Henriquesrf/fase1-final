package pdv;

import java.util.Scanner;

public class PDV {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {

            System.out.println("\n===== BEM VINDO AO PDV =====");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Operador de Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Listar Pagamentos");
            System.out.println("6 - Sair");
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

                    System.out.println("\n===== FORMA DE PAGAMENTO =====");
                    System.out.println("1 - PIX");
                    System.out.println("2 - Boleto");
                    System.out.println("3 - Cartão");
                    System.out.print("Escolha uma opção: ");

                    int formaPagamento = teclado.nextInt();
                    teclado.nextLine();

                    Pagamento pagamento = null;

                    if (formaPagamento == 1) {

                        Pix pix = new Pix();

                        System.out.println("\n===== PAGAMENTO PIX =====");

                        System.out.print("Número do pagamento: ");
                        pix.setNumeroPagamento(teclado.nextInt());
                        teclado.nextLine();

                        System.out.print("Valor: R$ ");
                        pix.setValor(teclado.nextFloat());
                        teclado.nextLine();

                        System.out.print("Chave PIX: ");
                        pix.setChavePix(teclado.nextLine());

                        pagamento = pix;

                    } else if (formaPagamento == 2) {

                        Boleto boleto = new Boleto();

                        System.out.println("\n===== PAGAMENTO BOLETO =====");

                        System.out.print("Número do pagamento: ");
                        boleto.setNumeroPagamento(teclado.nextInt());
                        teclado.nextLine();

                        System.out.print("Valor: R$ ");
                        boleto.setValor(teclado.nextFloat());
                        teclado.nextLine();

                        System.out.print("Código de barras: ");
                        boleto.setCodigoBarras(teclado.nextLine());

                        pagamento = boleto;

                    } else if (formaPagamento == 3) {

                        System.out.println("\n===== TIPO DE CARTÃO =====");
                        System.out.println("1 - Débito");
                        System.out.println("2 - Crédito");
                        System.out.print("Escolha uma opção: ");

                        int tipoCartao = teclado.nextInt();
                        teclado.nextLine();

                        if (tipoCartao == 1) {

                            Debito debito = new Debito();

                            System.out.println("\n===== CARTÃO DE DÉBITO =====");

                            System.out.print("Número do pagamento: ");
                            debito.setNumeroPagamento(teclado.nextInt());
                            teclado.nextLine();

                            System.out.print("Valor: R$ ");
                            debito.setValor(teclado.nextFloat());
                            teclado.nextLine();

                            System.out.print("Número do cartão: ");
                            debito.setNumeroCartao(teclado.nextLine());

                            System.out.print("Nome do titular: ");
                            debito.setNomeTitular(teclado.nextLine());

                            System.out.print("Bandeira: ");
                            debito.setBandeira(teclado.nextLine());

                            System.out.print("CVV: ");
                            debito.setCvv(teclado.nextLine());

                            System.out.print("Saldo disponível: R$ ");
                            debito.setSaldoDisponivel(teclado.nextFloat());
                            teclado.nextLine();

                            System.out.print("Senha: ");
                            debito.setSenha(teclado.nextLine());

                            pagamento = debito;

                        } else if (tipoCartao == 2) {

                            System.out.println("\n===== CARTÃO DE CRÉDITO =====");
                            System.out.println("1 - À vista");
                            System.out.println("2 - Parcelado");
                            System.out.print("Escolha uma opção: ");

                            int tipoCredito = teclado.nextInt();
                            teclado.nextLine();

                            Credito credito;

                            if (tipoCredito == 1) {
                                credito = new Credito();
                            } else if (tipoCredito == 2) {

                                System.out.print("Quantidade de parcelas: ");
                                int parcelas = teclado.nextInt();
                                teclado.nextLine();

                                credito = new Credito(parcelas);

                            } else {
                                System.out.println("Opção inválida.");
                                break;
                            }

                            System.out.print("Número do pagamento: ");
                            credito.setNumeroPagamento(teclado.nextInt());
                            teclado.nextLine();

                            System.out.print("Valor: R$ ");
                            credito.setValor(teclado.nextFloat());
                            teclado.nextLine();

                            System.out.print("Número do cartão: ");
                            credito.setNumeroCartao(teclado.nextLine());

                            System.out.print("Nome do titular: ");
                            credito.setNomeTitular(teclado.nextLine());

                            System.out.print("Bandeira: ");
                            credito.setBandeira(teclado.nextLine());

                            System.out.print("CVV: ");
                            credito.setCvv(teclado.nextLine());

                            System.out.print("Limite disponível: R$ ");
                            credito.setLimiteDisponivel(teclado.nextFloat());
                            teclado.nextLine();

                            pagamento = credito;

                        } else {

                            System.out.println("Opção inválida.");
                            break;
                        }

                    } else {

                        System.out.println("Opção inválida.");
                        break;
                    }

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

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");

                    break;
            }

        } while (opcao != 6);

        teclado.close();
    }
}