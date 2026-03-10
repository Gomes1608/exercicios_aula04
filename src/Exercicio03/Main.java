package Exercicio03;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilheteUnico;

    static {
        System.out.println("Digite seu número de usuario: ");
        String usuario= sc.nextLine();
        System.out.println("Digite seu tipo de tarifa: normal / professor / estudante");
        String tipoTarifa= sc.next();
        bilheteUnico = new BilheteUnico(usuario,tipoTarifa);
    }


    public static void main(String[] args) {


        int opcao=0;

        do {
            System.out.println("Digite o número referente a sua ação desejada: ");
            System.out.println("------------------------------");
            System.out.println("1 - Carregar bilhete");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Passar na Catraca");
            System.out.println("4 - Finalizar");
            System.out.println("------------------------------");
            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Digite o valor que deve ser adicionado: ");
                    double valor=0;
                    valor= sc.nextDouble();
                    bilheteUnico.carregar(valor);
                    break;

                case 2:
                    System.out.println(bilheteUnico.saldo +" R$");
                    break;

                case 3:
                    System.out.println("Você passou pela catraca e o valor foi descontado do seu saldo");
                    bilheteUnico.passarNaCatraca();
                    break;

                case 4:
                    System.out.println("Obrigado por usar nosso sistema :D");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao!=4);
    }
}
