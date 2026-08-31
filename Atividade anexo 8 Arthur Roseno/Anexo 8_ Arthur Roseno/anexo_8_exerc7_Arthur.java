import java.util.Scanner;

public class anexo_8_exerc7_Arthur {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");

        } else {
            System.out.println("O número não está no intervalo entre 100 e 200.");
        }

        scanner.close();

        }

        }
