package Exercicio02;

public class SenhaAtendimento {
    int senha;
    String paciente;

    static int controle=0;

    public SenhaAtendimento(String paciente){
        this.paciente = paciente;
        this.senha = controle++;
    }

    public String getDados(){
        return "Paciente: "+paciente+" | Senha #"+ senha;
    }
}
