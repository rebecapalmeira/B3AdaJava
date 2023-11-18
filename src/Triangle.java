import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número ímpar entre 5 e 11:");
        int number = scanner.nextInt();

        while(number % 2 == 0 || number < 5 || number > 11) {
            System.out.println("Número informado não está de acordo com as regras permitidas.\nInforme um número ímpar entre 5 e 11");
            number = scanner.nextInt();
        }

        int startingSpaces = (number - 1) / 2;
        String spaces = " ";
        String symbol = "*";
        int spacesInLine = startingSpaces;
        int symbols = 1;

        for(int numberOfLines = startingSpaces; numberOfLines > 0; numberOfLines--) {//4
            for(int numberOfSpaces = spacesInLine; numberOfSpaces > 0; numberOfSpaces--) {
                System.out.print(spaces);
            }



            for(int symbolsInLine = symbols; symbolsInLine <= symbols; symbolsInLine+=2) {
                System.out.print("*");
            }
            spacesInLine--;

            System.out.print("\n");
        }

    }
}
