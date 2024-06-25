import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaDeCombustivel bomba = new BombaDeCombustivel("Gasolina", 5.59, 1000.0);

        System.out.println("Bem-vindo à bomba de combustível!");
        System.out.println("1 - Abastecer por valor");
        System.out.println("2 - Abastecer por litro");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Informe o valor a ser abastecido: R$ ");
            double valor = scanner.nextDouble();
            bomba.abastecerPorValor(valor);
        } else if (opcao == 2) {
            System.out.print("Informe a quantidade de litros: ");
            double litros = scanner.nextDouble();
            bomba.abastecerPorLitro(litros);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}