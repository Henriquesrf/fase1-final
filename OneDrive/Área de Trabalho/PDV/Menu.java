package sistemapdv;

import java.util.Scanner;

public class Menu {
    
    Scanner teclado = new Scanner(System.in);
     Loja loja = new Loja();
      OperadorCaixa operador = new OperadorCaixa(1,"Aberto",2, "EDUARDO", "0123812471", 20f, "Faxineiro", 1234);
    
    
    public void menuGerente(){
         int opcao;

        do { System.out.println(" ----- MENU DO GERENTINHO DE 10 CENTAVOS ------ ");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Listar funcionários");
        System.out.println("3 - Listar Pagamentos");
        System.out.println("4 - Gerar relatórios");
        
              opcao = teclado.nextInt();
            teclado.nextLine();

    switch (opcao) {
               
                case 1: 

                    System.out.println("\n===== CADASTRO DE FUNCIONARIO =====");

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
                    
                case 2:     loja.listarFuncionarios();

                    break;
                    
                case 3:     loja.listarPagamentos();

                    break;
                    
                case 4: loj
                    
                    
                    default:

                    System.out.println("Opção inválida.");

                    break;  
            }
            
        } while (opcao != 4);
        
   
    }

public void menuFuncionario(){
    
           int opcao;

        do { System.out.println(" ----- MENU DO FUNCIONARIO(RUIM) DE 10 CENTAVOS ------ ");
        System.out.println("1 - Abrir Caixa");
        System.out.println("2 - Fechar Caixa");
        System.out.println("3 - Realizar Pagamentos");
        System.out.println("4 - Listar pagamentos");
        
              opcao = teclado.nextInt();
            teclado.nextLine();

    switch (opcao) {
               
                case 1:  operador.abrirCaixa();
                
                 break;
                    
                case 2:  operador.fecharCaixa();

                    break;
                    
                case 3:
                    
                    if (operador.abrirCaixa() = true) {
                        
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

                    break;}

                  
                    
                case 4:    loja.listarPagamentos();

                    break;
                    
                      default:

                    System.out.println("Opção inválida.");

                    break;
                    
                    
                    
            }
            
        } while (opcao != 4);
    }
}



