import java.util.Scanner;

public class anexo_8_exerc5_Arthur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, * ou /): ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        double resultado;

        if (operacao == '+') {
            resultado = A + B;
        } else if (operacao == '-') {
            resultado = A - B;
        } else if (operacao == '*') {
            resultado = A * B;
        } else if (operacao == '/') {
            resultado = (double) A / B;
        } else {
            System.out.println("Operação inválida!");
            scanner.close();
            return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();

        }

        }
