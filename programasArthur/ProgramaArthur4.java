import java.util.Scanner;

public class ProgramaArthur4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, rendimento, valorFinal;

        System.out.print("Digite o valor depositado: ");
        valor = entrada.nextDouble();
        rendimento = valor * 0.007;
        valorFinal = valor + rendimento;

        System.out.println("Rendimento após um mês: R$ " + rendimento);
        System.out.println("Valor após um mês: R$" + valorFinal);

        entrada.close();
    }
}
