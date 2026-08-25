import java.util.Scanner;
public class programaArthur2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("soma: " + (numero1 + numero2));
        System.out.println("subtração: " + (numero1 - numero2));
        System.out.println("multiplicação: " + (numero1 * numero2));

        if (numero2 != 0) {
         System.out.println("divisão: " + (numero1 / numero2));
        } else {
        System.out.println("Não é possível concluir esta divisão");

        entrada.close();
         }
         }
         }
