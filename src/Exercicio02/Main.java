package Exercicio02;

public class Main {
    public static void main(String[] args) {

        SenhaAtendimento senha1 = new SenhaAtendimento("Paciente0");
        SenhaAtendimento senha2 = new SenhaAtendimento("Paciente1");
        SenhaAtendimento senha3 = new SenhaAtendimento("Paciente2");

        System.out.println(senha1.getDados());
        System.out.println(senha2.getDados());
        System.out.println(senha3.getDados());


    }
}
