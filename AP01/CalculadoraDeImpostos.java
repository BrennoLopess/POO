public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        // Dados fixos de exemplo
        double valorProduto = 200.0;  // valor do produto
        double valorServico = 100.0;  // valor do serviço

        // Criação dos objetos de imposto
        ISS iss = new ISS();
        ICMS icms = new ICMS();
        IPI ipi = new IPI();

        // Cálculo dos impostos
        double impostoISS = iss.calcularImposto(valorServico);
        double impostoICMS = icms.calcularImposto(valorProduto + valorServico);
        double impostoIPI = ipi.calcularImposto(valorProduto);

        // Cálculo do valor total com impostos
        double totalISS = valorServico + impostoISS;
        double totalICMS = valorProduto + valorServico + impostoICMS;
        double totalIPI = valorProduto + impostoIPI;

        // Saída de dados
        System.out.println("Valor original do serviço: " + valorServico);
        System.out.println("Imposto ISS: " + impostoISS);
        System.out.println("Total com ISS: " + totalISS);

        System.out.println("\nValor original do produto e serviço: " + (valorProduto + valorServico));
        System.out.println("Imposto ICMS: " + impostoICMS);
        System.out.println("Total com ICMS: " + totalICMS);

        System.out.println("\nValor original do produto: " + valorProduto);
        System.out.println("Imposto IPI: " + impostoIPI);
        System.out.println("Total com IPI: " + totalIPI);
    }
}
