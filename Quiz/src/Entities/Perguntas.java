package Entities;

import java.util.Scanner;

public class Perguntas {
    public String matriz[][] =
    {
        {"Qual a capital do Brasil? \n[1] - Brasilia \n[2] - São Paulo \n[3] - Rio de Janeiro \n[4] - Maringá", "1"},
        {"C#, Java, C++ são: \n[1] - Comida \n[2] - Banda \n[3] - Linguagem de Programação \n[4] - Carros", "3"},
        {"De onde é a invenção do chuveiro elétrico?: \n[1] - França \n[2] - brasil \n[3] - Inglaterra \n[4] - Australia", "2"},
        {"Quais o menor e o maior país do mundo?: \n[1] - Nauru e China \n[2] - Vaticano e Rússia \n[3] - Mônaco e Canadá \n[4] - São Marino e Índia", "2"},
        {"Quantas casas decimais tem o número pi?: \n[1] - Duas \n[2] - Centenas \n[3] - Milhares \n[4] - Infinitas", "4"}
    };

    public void quiz(){
    Scanner sc = new Scanner(System.in);
    int acertos = 0;
    int erros = 0;

    System.out.println("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.println("*****************************");

    for(int indice = 0; indice < matriz.length; indice++) {
        String[] conjunto = matriz[indice];
        for(int indiceConjunto = 0; indiceConjunto < conjunto.length; indiceConjunto++) {
           System.out.println(conjunto[indiceConjunto++]);	
           System.out.println();
           System.out.println("Digite sua resposta: ");
           String resposta = sc.nextLine();
           if(resposta.equals(conjunto[indiceConjunto])){
                System.out.println();
                System.out.println("******* Resposta Certa *******");
                acertos++;
           }
           else{
               System.out.println();
               System.out.println("******* Resposta Errada *******");
               erros++;
           }                           
        }
        System.out.println();
     }

     System.out.println();
     System.out.println("*****************************");
     System.out.println("*********  JOGADOR  *********");
     System.out.println("*****************************");

     System.out.println("Usuário " + nome + 
        "\nAcertos: " + acertos +
        "\nErros: " + erros);
    }
}
