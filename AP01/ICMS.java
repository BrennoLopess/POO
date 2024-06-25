public class ICMS extends Imposto {
    public ICMS() {
        super(0.17);  // 17% de ICMS
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * aliquota;
    }
}
