import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Augusto", "Paulo"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }


        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando){
                    tentativasRealizadas++;
                }else{
                    System.out.println("contato realizado com sucesso");
                }
            }while(continuarTentando && tentativasRealizadas< 3);
                if (atendeu) {
                    System.out.println("Conseguimos contato " + candidato + " na " + tentativasRealizadas + " tentativas");
                } else {
                    System.out.println("Não conseguimos contato com o " + candidato + " numero maximo de tentativas " + tentativasRealizadas + " realizadas");
                }

            }

    //metodo auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }
        static void analisarCandidato(double salarioPretendido){
                double salarioBase = 2000.0;
             if (salarioBase > salarioPretendido){
                 System.out.println("Ligar para o candidato");
             } else if (salarioBase == salarioPretendido){
                 System.out.println("Ligar para o candidato com contra proposta");
             }else{
                 System.out.println("aguardando resposta dos demais candidato");
             }
        }

        static void imprimirSelecionados(){
            String[] candidatos = {"Felipe", "Marcia", "Julia", "Augusto", "Paulo"};

            System.out.println("Imprimindo Lista de candidatos pelo índice dos elementos");

            for (int indice = 0; indice < candidatos.length;indice++){
                System.out.println("O candidato de nº " + indice + " é "+ candidatos[indice]);
            }
            System.out.println("forma abreviada de interação por for each");

            for (String candidato : candidatos){
                System.out.println("os candidatos selecionados foi: " + candidato);
            }
        }
    }
