import java.util.Scanner;

public class CarPayment {
    public static void main(String[] args) {
        /*
        Dado o valor de um carro, informar em quantas vezes ele pode ser parcelado, considerando que o valor mínimo da
        parcela é R$ 1000,00

        O valor do carro deve ser informado pelo usuário via Scanner
         */

        Scanner scanner = new Scanner(System.in);

        double carPrice, installmentValue;
        int financingTerm;

        System.out.println("Informe o valor do carro que deseja adquirir: R$ ");
        carPrice = scanner.nextDouble();

        System.out.println("Qual valor aproximado deseja pagar de parcela, a partir de R$ 1000,00 (mil reais)?");
        installmentValue = scanner.nextDouble();

        while (installmentValue < 1000) {
            System.out.println("Valor de parcela informado é inferior ao mínimo permitido de mil reais.\nInforme um valor a partir de R$ 1000,00");
            installmentValue = scanner.nextDouble();
        }

        financingTerm = (int) carPrice / (int)installmentValue;
        installmentValue = carPrice / financingTerm;

        System.out.printf("\nConsiderando o valor total do veículo e o valor desejado para parcela, o prazo de financiamento será de %d meses em parcelas fixas de R$ %.2f",
                financingTerm, installmentValue
            );

    }
}
