package Controle;
import Database.Db;
import Modelos.contaUsuario;

public class ListarContas {

    public static void listar() {
            System.out.format("%60s \n", "Listagem de clientes");
            //impressão com formatação de tabulação
            System.out.printf("%-15s%-20s%-14s%-14s%-20s%-20s%-20s%-20s%n","Nome","CPF","RG","Data Nascim","Telefone","Cidade","Estado","idade");


        if (Db.contas == null) {
                return;
            }
            // for each responsavel pela repetição dos dados inseridos da classe ClienteInsert
            for (contaUsuario func : Db.contas) {

                System.out.format("%-15s%-20s%-14s%-14s%-20s%-20s%-20s%-20d%n", func.getNomeCliente() , func.getNumeroConta(), func.getAgencia(), func.getSaldo());
            }

        }
}
