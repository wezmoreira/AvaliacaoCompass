package Entities;

public class Funcionario {
    private String nome;
    private double salario;
    private double bonus;
    private double salarioLiquido;

    public Funcionario(String nome, double salario, double bonus, double salarioLiquido) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
   
}
