public class SeguroDeVida extends Conta implements Tributavel {
    public SeguroDeVida(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos(double saldo) {
        return saldo-42;
    }
}
