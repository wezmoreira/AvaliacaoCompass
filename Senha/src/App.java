import java.util.Scanner;
import Entities.Cadastro;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        int opcao;

        do {
            System.out.println("1 - Cadastro de usuário.");
            System.out.println("2 - Efetuar login.");
            System.out.println("3 - Sair do Sistema.");
            System.out.println("********************************");

            opcao = sc.nextInt();

            switch (opcao) {
    
                case 1: {
                    cadastro.cadastro();
                    System.out.println("********************************");
                    break;
                }
    
                case 2: {
                    Scanner input = new Scanner(System.in);
                    System.out.println("********************************");
                    System.out.println("Login: ");
                    String login = input.nextLine();
                    System.out.println("********************************");
                    System.out.println("Senha: ");
                    String senha = input.nextLine();
                    cadastro.validarLogin(login, senha);
                    System.out.println("********************************");
                    break;
                }
    
                case 3: {
                    opcao = 3;
                }
            }
    
        } while (opcao != 3);
    }
}
