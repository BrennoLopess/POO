public class ISS extends Imposto {
    public ISS() {
        super(0.046);  // 4.6% de ISS
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * aliquota;
    }
}
