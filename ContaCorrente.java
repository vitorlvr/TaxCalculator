public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos(double saldo) {
    
        return saldo*0.99;

    }
}
