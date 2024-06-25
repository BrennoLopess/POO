// Classe abstrata para representar um imposto genérico
public abstract class Imposto {
    protected double aliquota;

    public Imposto(double aliquota) {
        this.aliquota = aliquota;
    }

    public abstract double calcularImposto(double valor);
}
