import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /*
        Criei uma branch separada para publicar a resolução do terceiro exercício que foi concluída FORA DO PRAZO
        A resolução PARCIAL dentro do prazo está no código publicado na main branch
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número ímpar entre 5 e 11:");
        int number = scanner.nextInt();

        while(number % 2 == 0 || number < 5 || number > 11) {
            System.out.println("Número informado não está de acordo com as regras permitidas.\nInforme um número ímpar entre 5 e 11");
            number = scanner.nextInt();
        }

        int linesToPrint = (number - 1) / 2;
        int spacesToPrint = linesToPrint;
        int symbolsToPrint = 1;

        for(int numberOfLines = linesToPrint; numberOfLines >= 0; numberOfLines--) {
            for(int i = spacesToPrint; i > 0; i--) {
                System.out.print(" ");
            }

            for(int i = 0; i < symbolsToPrint; i++) {
                System.out.print("*");
            }

            spacesToPrint--;
            symbolsToPrint+=2;
            
            System.out.print("\n");
        }

        spacesToPrint = 0;
        symbolsToPrint = number;

        for(int numberOfLines = linesToPrint; numberOfLines >= 0; numberOfLines--) {
            for(int i = 0; i < spacesToPrint; i++) {
                System.out.print(" ");
            }

            for(int i = symbolsToPrint; i > 0; i--) {
                System.out.print("*");
            }


            spacesToPrint++;
            symbolsToPrint-=2;

            System.out.print("\n");
        }
    }
}
