package Controle;

import Database.Db;
import Modelos.contaUsuario;
import java.util.Scanner;
import java.util.List;




public class ControleUsuario {

    public static void inserir() {
        System.out.println("Cadastro de Conta");

        Scanner scan = new Scanner(System.in);
        contaUsuario conta = new contaUsuario();

        System.out.println("Digite o nome do cliente");
        String nome = scan.next();
        conta.setNomeCliente(nome);

        System.out.println("Digite o número da Agência");
        String agencia = scan.next();
        conta.setAgencia(agencia);

        System.out.println("Digite o número da conta");
        int numeroConta = scan.nextInt();
        conta.setNumeroConta(numeroConta);

        conta.setSaldo(1000.00);

        System.out.println("Você ganhou um bônus de R$1000,00");

        Db.contas.add(conta);

        System.out.println("Cadastro efetuado com sucesso");
    }

    public static void menuTerminal() {
        System.out.println("1 - Criar Conta\n" +
                "2 - Acessar Conta\n" +
                "3 - Sair\n");
        System.out.print("Digite a opção");
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                inserir();
                break;
            case 2:
                System.out.println("acessarconta");
                break;
            case 3:
                if (escolha == 3) {
                    System.out.println("sair");
                    ;
                }
                break;
            default:
                while (escolha > 3) {
                    menuTerminal();
                }
        }
    }
}
