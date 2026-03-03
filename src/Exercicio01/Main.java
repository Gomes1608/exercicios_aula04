package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int qtd;
        double porcentagem;

        System.out.println("Nome do produto: ");
        nome = sc.next();
        System.out.println("Valor do produto em R$: ");
        valor = sc.nextDouble();
        System.out.println("Quantidade inicial em estoque: ");
        qtd = sc.nextInt();

        Produto produto = new Produto(nome,valor,qtd);
        System.out.println("Qual a porcentagem do aumento? ");
        porcentagem=sc.nextDouble();

        produto.aumentarValor(porcentagem);
    }
}
