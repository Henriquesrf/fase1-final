package sistemapdv;

import java.util.Scanner;

public class PDV {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();
        
        
        Gerente gerente = new Gerente(1, "HENRIQUE", "0987654321", 1.2f ,"T.I", 10+1, 4321 );
    
        OperadorCaixa operador = new OperadorCaixa(1,"Aberto",2, "EDUARDO", "0123812471", 20f, "Faxineiro", 1234);
        
        int opcao;

        do {
            
            System.out.println("1 - Acessar o sistema");
            System.out.println("2 - Sair");
            
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
               
                case 1: System.out.println("Qual o seu cargo?");              
                   opcao = teclado.nextInt();
                   
                   
                   switch (opcao) {
                       
                   }
            
            
                case 2: System.out.println("Opção inválida");
                    
                    
                    
            }
            
        } while (opcao != 2);
    }
}
        
        
        
        
              
       
