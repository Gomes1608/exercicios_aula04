package Exercicio03;

import java.util.Random;

public class BilheteUnico {

    int nmrBilhete;
    double saldo;
    double tarifaBase = 5.40;
    String tipoTarifa;
    Usuario usuario;


    public BilheteUnico(Usuario usuario){
        Random r = new Random();
        this.tipoTarifa=tipoTarifa;
        this.saldo=0;
        this.nmrBilhete = r.nextInt(1000,9999);
    }

    public void carregar(double valor){
        if (valor<=0){
            return ;
        }
        saldo+=valor;
    }
    public double calcularTarifa(){
        double valor = tarifaBase;
        if (usuario.tipoTarifa.equalsIgnoreCase("estudante")||(usuario.tipoTarifa.equalsIgnoreCase("professor"))){
            valor = tarifaBase/2;
        }
        return valor;
    }

    public boolean passarNaCatraca(){
        double valor = calcularTarifa();
        if (tipoTarifa.equalsIgnoreCase("professor") || tipoTarifa.equalsIgnoreCase("estudante")){
            valor = valor/2;
        }
        if (saldo<valor){
            return false;
        }

        saldo = saldo-valor;
        return true;
    }
}
