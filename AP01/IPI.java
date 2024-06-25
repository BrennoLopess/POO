public class IPI extends Imposto {
    public IPI() {
        super(0.25);  // 25% de IPI
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * aliquota;
    }
}
