package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Financeiro {
    
    ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

    public void cadastro(int qtd){       
        for(int i = 0; i < qtd; i++){ 
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome para o cadastro: ");
            String nome = sc.nextLine();
            
            System.out.println();
            
            System.out.println("Digite o salario para o cadastro: ");
            double salario = sc.nextDouble();
            System.out.println("*****************************************************");

            double bonus = calculaBonus(salario);
            double salarioLiquido;

            if(salario > 2000){
                salarioLiquido = salario - bonus;
            }
            else{
                salarioLiquido = salario + bonus;
            }

            Funcionario pessoa = new Funcionario(nome, salario, bonus, salarioLiquido); 
            funcionario.add(pessoa);

        }
    }


    public double calculaBonus(double salario){
        if(salario <= 1000){
            return salario * 0.2;
        }
        else if(salario > 1000 && salario <= 2000){
            return salario * 0.1;
        }
        else if(salario > 2000){
            return salario * 0.1;
        }
        return 0;
    }

    public void listaFuncionario(){
        System.out.println();
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("********************FUNCIONARIOS*********************");
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println();

        for(int i = 0; i < funcionario.size(); i++) {
            if(funcionario.get(i).getSalario() > 2000){
            System.out.println("Funcionario: " + funcionario.get(i).getNome() +
            "\nSalario: " + funcionario.get(i).getSalario() +
            "\nDesconto: " + funcionario.get(i).getBonus() +
            "\nSalario Liquido: " + funcionario.get(i).getSalarioLiquido());         
            
            System.out.println("*****************************************************");
            
            }       
            else{
                System.out.println("Funcionario: " + funcionario.get(i).getNome() +
                "\nSalario: " + funcionario.get(i).getSalario() +
                "\nBônus: " + funcionario.get(i).getBonus() +
                "\nSalario Liquido: " + funcionario.get(i).getSalarioLiquido());

                System.out.println("*****************************************************");
            }
        }
    }
}
