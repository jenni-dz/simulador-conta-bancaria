package br.com.acoesconta;

public class Saldo {
    private double saldo;

    public Saldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {  
        this.saldo = saldo;
    }
    public void exibirSaldo() {
        System.out.printf("SaLdo atual da sua conta corrente: R$ %.2f%n", saldo);
    }  
}