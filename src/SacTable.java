import java.util.Scanner;

public class SacTable {
    public static void main(String[] args) {
    /*
    amortização = total_saldo_devedor / total_meses
    juros_mensal = saldo_devedor_atual x juros_ao_mes
    parcela_mensal = juros_mensal + amortizacao
    saldo_devedor_atual = saldo_devedor_atual - amortizacao

    Pergunte:
    * o valor de um empréstimo
    * tx de juros do empréstimo
    * tempo para pagamento

    Valor fixo da amortização: R$ 2500,00 | Saldo devedor total: R$ 30000,00 | Juros de 1,5% ao mês

    Parcela 1 | Juros: R$ 450,00 | Prestação R$ 2950,00 | Saldo devedor: R$ 27500,00
    Parcela 2 | Juros: R$ 412,50 | Prestação R$ 2912,50 | Saldo devedor: R$ 25000,00

    Total: Valor total pago R$ 32925,00 | Juros total pago: R$ 2925,00 | Amortização: R$ 30000,00
     */
        double loan, interestRate, amortization;
        int monthsToPay;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo: ");
        loan = scanner.nextDouble();

        System.out.println("Informe a taxa mensal de juros: ");
        interestRate = scanner.nextDouble();

        System.out.println("Informe em quanto meses deseja pagar: ");
        monthsToPay = scanner.nextInt();

        double interestSum = 0;
        double outstandingBalance = loan;
        amortization = loan / monthsToPay;

        System.out.printf("\nValor fixo da amortização: R$ %.2f | Saldo devedor total: R$ %.2f | Juros de %.1f por cento ao mês\n",
                amortization, loan, interestRate
                );

        for(int counter = 1; counter <= monthsToPay; counter++) {
            double interest = outstandingBalance * (interestRate/100);

            System.out.printf("\nParcela %d | Juros: R$ %.2f | Prestação R$ %.2f | Saldo devedor: R$ %.2f",
                    counter, interest, (amortization + interest), (outstandingBalance -= amortization)
                );

            interestSum += interest;

        }


        System.out.printf("\n\nTotal: Valor total pago R$ %.2f | Juros total pago: R$ %.2f | Amortização: R$ %.2f",
                loan + interestSum, interestSum, loan
            );
    }
}
