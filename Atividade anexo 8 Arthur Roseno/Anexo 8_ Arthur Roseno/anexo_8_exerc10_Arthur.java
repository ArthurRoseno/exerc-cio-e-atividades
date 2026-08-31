import java.util.Scanner;

public class anexo_8_exerc10_Arthur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do financiamento: ");
        double financiamento = scanner.nextDouble();

        if (financiamento <= salario * 5) {
            System.out.println("Financiamento Concedido");
        } else {
            System.out.println("Financiamento Negado");
        }

        scanner.close();

        }

        }
