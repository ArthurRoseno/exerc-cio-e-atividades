import java.util.Scanner;
public class ProgramaArthur3 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double distancia, combustivel, consumo;
    System.out.print("Digite a distancia percorrida: ");
    distancia = entrada.nextDouble();

    System.out.print("Digite o combústivel gasto: ");
    combustivel = entrada.nextDouble();

    consumo = distancia / combustivel;
    System.out.println("o consumo médio foi de: " + consumo + "km/L");

    entrada.close();
    }
    }
