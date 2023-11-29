import Controle.ControleUsuario;
import Controle.ListarContas;
import Modelos.contaUsuario;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;
import Database.Db;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        contaUsuario conta1031 = new contaUsuario();

        System.out.println("Seja bem vindo ao nosso terminal");
        System.out.println("Digite o numero da agencia");
        int numeroAgencia = scan.nextInt();

        if (numeroAgencia == 1031){
            System.out.println("Olá "+ conta1031.getNomeCliente() + " obrigado por criar uma conta em nosso banco,\n" +
                    "sua agência é "+conta1031.getAgencia()+ ", conta: " + conta1031.getNumeroConta()+ " e seu saldo de " + conta1031.getSaldo()+"\n" +
                            "já está disponível para saque.");

        }else{
            System.out.println("Não foi possivel acessar os dados");
        }


        }


}
