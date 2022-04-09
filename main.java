import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Scanner v1 = new Scanner(System.in);
    int sal = 100000, saq, dep;
    List<String> extrato = new ArrayList<String>();

    while(true){
      System.out.printf("\n\n==========\n\nBanco INTER\n\n==========\n\n");
      System.out.println("Escolha 1 para Saque");
      System.out.println("Escolha 2 para Deposito");
      System.out.println("Escolha 3 para Saldo");
      System.out.println("Escolha 4 para Extrato");
      System.out.println("Escolha 0 para Sair");

      int esco = v1.nextInt();
      switch(esco){
        case 1:
          System.out.print("Qual será o valor a ser retirado: ");
          saq = v1.nextInt();

          if(sal >= saq){
            sal = sal - saq;
            System.out.println("Por favor, pegue seu dinheiro.");
          } else {
            System.out.println("Saldo insuficiente!");
          } 
          System.out.println("$" + saq + "sacado com sucesso");
          extrato.add(" Saque de $" + saq);

          System.out.println();
          break;

        case 2:
          System.out.print("Qual será o valor depositado: ");
          dep = v1.nextInt();

          sal = sal + dep;
          System.out.println("$" + dep + "depositado com sucesso!");
          extrato.add(" Depósito de $" + dep);

          System.out.println("");
          break;

        case 3:
          System.out.println("Saldo Bancario: $" + sal);
          System.out.println("");
          break;

        case 4: 
          extrato.add(" Saldo atual: $"+ sal);
          for(String string : extrato) {
            System.out.println(string);
            Break;
          }

        case 0:
          System.exit(0);
          Break;
      }
    }
  }
}
