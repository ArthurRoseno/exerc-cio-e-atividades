import java.util.Scanner;
public class programaArthur5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra, prestacao;

        System.out.print("Digite o valor da compra: ");
        compra = entrada.nextDouble();
        prestacao = compra / 5;

        System.out.println("5x de R$ " + prestacao);
        entrada.close();



    }
}
