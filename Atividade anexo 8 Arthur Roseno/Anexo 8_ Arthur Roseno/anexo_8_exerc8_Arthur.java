import java.util.Scanner;

public class anexo_8_exerc8_Arthur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 20) {
            System.out.println("Situação: Abaixo do peso.");
        } else if (imc < 25) {

            System.out.println("Situação: Peso Normal.");
        } else if (imc < 30) {

            System.out.println("Situação: Sobre Peso.");
        } else if (imc < 40) {

            System.out.println("Situação: Obeso.");
        } else {
            System.out.println("Situação: Obeso Mórbido.");
        }

        scanner.close();

        }

        }
