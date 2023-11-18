import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        /*
        Criei uma branch separada para publicar a resolução do terceiro exercício que foi concluída FORA DO PRAZO
        A resolução PARCIAL dentro do prazo está no código publicado na main branch
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número ímpar entre 11 e 31:");
        int number = scanner.nextInt();

        while(number % 2 == 0 || number < 11 || number > 31) {
            System.out.println("Número informado não está de acordo com as regras permitidas.\nInforme um número ímpar entre 11 e 31");
            number = scanner.nextInt();
        }

        int treeHeight = (number - 1) / 2;
        int spacesToPrint = treeHeight;
        int symbolsToPrint = 1;

        for(int numberOfLines = treeHeight; numberOfLines >= 0; numberOfLines--) {
            for(int i = spacesToPrint; i > 0; i--) {
                System.out.print(" ");
            }

            for(int i = 0; i < symbolsToPrint; i++) {
                if (numberOfLines % 2 != 0) {
                    System.out.print("*");
                } else {
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("@");
                    }
                }
            }

            spacesToPrint--;
            symbolsToPrint+=2;

            System.out.print("\n");
        }

        int trunkHeight = (treeHeight / 2) / 2;
        int trunkWidth;

        if (number > 21) {
            trunkWidth = 7;
        } else if (number > 15){
            trunkWidth = 5;
        } else {
            trunkWidth = 3;
        }

        spacesToPrint = (number - trunkWidth) / 2;

        for(int numberOfLines = trunkHeight; numberOfLines >= 0; numberOfLines--) {
            for(int i = spacesToPrint; i > 0; i--) {
                System.out.print(" ");
            }

            for(int i = 0; i < trunkWidth; i++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
