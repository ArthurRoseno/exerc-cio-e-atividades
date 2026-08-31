import java.util.Scanner;

public class anexo_8_exerc2_Arthur {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Digite o seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("CASADA") ||estadoCivil.equalsIgnoreCase("CASADO")){

        System.out.print("Digite o tempo de casada(o) (anos): ");
        int tempoCasada = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Tempo de casada: " + tempoCasada + " anos");

        }

        scanner.close();

        }

        }








