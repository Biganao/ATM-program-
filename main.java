import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner v1 = new Scanner(System.in);
    int sal = 100000, saq, dep;
    List<String> extr = new ArrayList<String>();

    
    while(true){
      System.out.printf("\n==========\n\nBanco INTER\n\n==========\n\n");
      System.out.println("Escolha 1 para Saque");
      System.out.println("Escolha 2 para Deposito");
      System.out.println("Escolha 3 para Saldo");
      System.out.println("Escolha 4 para Extrato");
      System.out.println("Escolha 0 para Sair");

      int esco = v1.nextInt();
      switch(esco){
        case 0:
          System.exit(0);
        break;
          
        case 1:
          System.out.print("Qual será o valor a ser retirado: ");
          saq = v1.nextInt();

          if(saq == 0){
            while(true){
              System.out.println("Valor inválido. Por favor, digite outro valor!");
              System.out.print("Digite o valor a ser sacado: ");
              saq = v1.nextInt();
              if(saq != 0)
                break;
            } if(sal >= saq){
              sal = sal - saq;
              System.out.println("Por favor, retire seu dinheiro");
            } else {
              System.out.println("Saldo insuficiente");
            }
          }
          
          System.out.println("$" + saq + " sacado com sucesso");
          extr.add("Saque de $" + saq);
          System.out.println();
          break;
          
        case 2:
          System.out.print("Qual será o valor depositado: ");
          dep = v1.nextInt();
          
          if(dep == 0){
            while(true){
              System.out.println("Valor inválido. Por favor, digite outro valor!");
              System.out.print("Digite o valor a ser depositado: ");
              dep = v1.nextInt();
              if(dep != 0)
                break;
            } if(dep > 0){
              sal = sal + dep;
              System.out.println("$" + dep + " depositado com sucesso!");
            }
          }
          
          extr.add("Depósito de $" + dep);
          
          System.out.println("");
          break;

        case 3:
          System.out.println("Saldo Bancario: $" + sal);
          System.out.println("");
          break;

        case 4: 
          extr.add("Saldo atual: $"+ sal);
          for(String string : extr) {
            System.out.println(string);
          }
        break;
      }
    }
  }
