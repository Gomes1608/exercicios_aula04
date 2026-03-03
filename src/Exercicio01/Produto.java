package Exercicio01;

public class Produto {
    String nome;
    double valor;
    int qtd;

    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }
    public void aumentarValor(double porcentagem){
        valor *= (1+porcentagem/100);
    }
}
