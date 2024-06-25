public class BombaDeCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaDeCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente disponível.");
        } else {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecidos " + litros + " litros de " + tipoCombustivel + ".");
            System.out.println("Total a pagar: R$ " + valor);
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente disponível.");
        } else {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecidos " + litros + " litros de " + tipoCombustivel + ".");
            System.out.println("Total a pagar: R$ " + valor);
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
    }
}