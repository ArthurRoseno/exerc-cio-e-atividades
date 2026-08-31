import java.util.Scanner;

public class anexo_8_exerc1_Arthur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        if (A + B < C) {
        System.out.println("A soma de A + B é menor que C! ");

        } else {
        System.out.println("A soma de A + B é maior que C! ");

        }

        scanner.close();

        }

        }
