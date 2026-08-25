import java.util.Scanner;
public class programaArthur6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custo, percentual, acrescimo, venda;

        System.out.print("Digite o preço de custo: ");
        custo = entrada.nextDouble();

        System.out.print("Digite o valor do acréscimo: ");
        percentual = entrada.nextDouble();

        acrescimo = custo * percentual / 100;
        venda = custo + acrescimo;

        System.out.println("O preço de venda: R$ " + venda);

        entrada.close();

    }
}
