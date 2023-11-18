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

        int lines = (number - 1) / 2;
        int spacesInLine = lines;
        int symbols = 1;

        for(int numberOfLines = lines; numberOfLines >= 0; numberOfLines--) {
            for(int numberOfSpaces = spacesInLine; numberOfSpaces > 0; numberOfSpaces--) {
                System.out.print(" ");
            }

            for(int numberOfSymbols = 0; numberOfSymbols < symbols; numberOfSymbols++) {
                System.out.print("*");
            }

            spacesInLine--;
            symbols+=2;
            
            System.out.print("\n");
        }
    }
}
