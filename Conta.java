public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente\n");
        } else if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo\n");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double obterSaldo() {
        return this.saldo;
    }
}
