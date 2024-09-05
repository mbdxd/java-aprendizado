package JUnit;

public class Conta {
    private String titular;
    private int saldo;

    // Construtor
    public Conta(String titular, int saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo da conta
    public int getSaldo() {
        return saldo;
    }

    // Método para realizar um saque
    public void sacar(int valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }

    // Método para realizar um depósito
    public void depositar(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        saldo += valor;
    }

    // Método para obter o nome do titular
    public String getTitular() {
        return titular;
    }
}
