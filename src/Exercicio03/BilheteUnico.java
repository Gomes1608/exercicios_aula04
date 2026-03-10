package Exercicio03;

import java.util.Random;

public class BilheteUnico {

    int nmrBilhete;
    String usuario;
    double saldo;
    final static double TARIFABASE = 5.40;
    String tipoTarifa;

    public BilheteUnico(String usuario, String tipoTarifa){
        Random r = new Random();
        this.usuario=usuario;
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

    public boolean passarNaCatraca(){
        double valor = TARIFABASE;
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
