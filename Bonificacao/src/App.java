import java.util.Scanner;

import Entities.Financeiro;

public class App {
    public static void main(String[] args) throws Exception {
        Financeiro usuario = new Financeiro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionarios que serão cadastrados: ");
        int qtd = sc.nextInt();

        usuario.cadastro(qtd);
        usuario.listaFuncionario();
    }
}
