package Entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    
    private ArrayList<Usuario> Usuario = new ArrayList<Usuario>();
    private LocalTime horario =  LocalTime.now();

    public void cadastro(){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o login para cadastrar: ");
        String login = sc.nextLine();
        System.out.println("Digite a senha para cadastrar: ");
        String senha = sc.nextLine();

        Usuario pessoa = new Usuario(login, senha);
        Usuario.add(pessoa);
    }

    public void validarLogin(String login, String senha){
        boolean execute = true;
        for(int i = 0; i < Usuario.size(); i++) {
            if(Usuario.get(i).getUsuario().equals(login) && Usuario.get(i).getSenha().equals(senha)){                
                if(horario.isAfter(LocalTime.of(06, 00)) && horario.isBefore(LocalTime.of(11, 59))){
                    System.out.println("Bom dia, você se logou ao nosso sistema.");
                    execute = false;
                    break;
                }
                else if(horario.isAfter(LocalTime.of(12, 00)) && horario.isBefore(LocalTime.of(17, 59))){
                    System.out.println("Boa tarde, você se logou ao nosso sistema.");
                    execute = false;
                    break;
                }
                else if(horario.isAfter(LocalTime.of(18, 00)) && horario.isBefore(LocalTime.of(23, 59))){
                    System.out.println("Boa noite, você se logou ao nosso sistema.”");
                    execute = false;
                    break;
                }
                else if(horario.isAfter(LocalTime.of(00, 00)) && horario.isBefore(LocalTime.of(05, 59))){
                    System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                    execute = false;
                    break;
                }                
            }         
        }
        if(execute){
            System.out.println("****************Usuário e/ou senha incorretos.****************");
        }

    }
}
