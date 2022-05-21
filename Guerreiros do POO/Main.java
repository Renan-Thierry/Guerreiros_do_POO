import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    boolean jogo = true;
    Scanner input = new Scanner(System.in);
      Guerreiro Lutador1 = new Guerreiro("01","Rennan");
      Guerreiro Lutador2 = new Guerreiro("02","Solange");

    while (jogo) {
      System.out.println();
      System.out.println(" ========== GUERREIROS ==========\n"); 
      System.out.println("1 - Cadastrar Guerreiros");
      System.out.println("2 - Jogar com laço)");
      System.out.println("3 - Jogar com recursividade)");
      System.out.println("4 - Alimentar um Guerreiro");            
      System.out.println("5 - Exibir as informações de um Guerreiro");  
      System.out.println("6 - Sair do Jogo\n"); 
      System.out.println("Sua opção: ");
      int escolha = input.nextInt();
      input.nextLine();
      System.out.println();
            
    switch (escolha) {
      case 1: {
        System.out.println(" ========== GUERREIROS ==========\n"); 
        System.out.print("Codigo do Guerreiro 1: ");
        Lutador1.setCodigo(input.nextLine());
        System.out.print("Nome do Guerreiro 1: ");
        Lutador1.setNome(input.nextLine());
        System.out.print("Codigo do Guerreiro 2: ");
        Lutador2.setCodigo(input.nextLine());
        System.out.print("Nome do Guerreiro 2: ");
        Lutador2.setNome(input.nextLine());
        System.out.println("\nJogadores cadastrados!!!"); 
        System.out.println("=================================\n"); 
        break;
        }
      case 2: {
        System.out.println(" ========== GUERREIROS ==========\n"); 
        int x = Lutador1.lutar(Lutador2);
        System.out.println();             
        System.out.println("Vencedor:");   
        System.out.println("=================================\n");                 
        if (x == 1) {
          System.out.println(Lutador1);
        }else {
          System.out.println(Lutador2);
        }
        break;
        }
      case 3: {
        System.out.println(" ========== GUERREIROS ==========\n"); 
        int x = Lutador1.lutarRecursivo(Lutador2);
        System.out.println();
        System.out.println("Vencedor:");
        if (x == 1) {
          System.out.println(Lutador1);
        }else {
          System.out.println(Lutador2);
        }
        break;
        }
      case 4: {
        System.out.println(" ========== GUERREIROS ==========\n"); 
        System.out.println("Escolha o Guerreiro: ");
        System.out.println(" 1 - Guerreiro " + Lutador1.getNome());
        System.out.println(" 2 - Guerreiro " + Lutador2.getNome());
        System.out.println(" 3 - Alimentar Ambos Totalmente");
        System.out.print("Sua opção: ");
    switch (input.nextInt()) {
      case 1: {
        Lutador1.alimentar_se();
        break;
        }
      case 2: {
        Lutador2.alimentar_se();  
        break;
        }
      case 3: {
        Lutador1.alimentar_se_Completamente();
        Lutador2.alimentar_se_Completamente();
        }
    }
        break;
  }
      case 5: {
        System.out.println(" ========== GUERREIROS ==========\n"); 
        System.out.println("Escolha o Guerreiro: ");
        System.out.println(" 1 - Guerreiro " + Lutador1.getNome());
        System.out.println(" 2 - Guerreiro " + Lutador2.getNome());
        System.out.print("Sua opção: ");
      if (input.nextInt() == 1) {
          System.out.println(Lutador1);;
      }else {
          System.out.println(Lutador2);
      }   
        break;
      }
      case 6: {
        jogo = false;
        input.close();            
        break;
      }
      }
    }
  }
}