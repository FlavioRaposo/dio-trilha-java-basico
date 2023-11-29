package Modelos;

public class contaUsuario {

    //atributos
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    //construtores


    public contaUsuario(int numeroConta, String agencia, String nomeCliente, double saldo) {

    }

    public contaUsuario() {
        this.numeroConta = 1031;
        this.agencia = "067-8";
        this.nomeCliente = "Marcos Pereira";
        this.saldo = 257.62;

    }


    //getter e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //métodos



          }







