public class ContaPoupanca extends Conta implements Tributavel {
    public ContaPoupanca(double saldo) {
        // Uso do super para chamar o construtor da classe Conta
        super(saldo);
    }

    // Uso do Override para sobrescrever o método calculaTributos da interface Tributavel
    @Override
    public double calculaTributos(double saldo) {
        return saldo;
    }
}