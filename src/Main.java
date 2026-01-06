import java.util.Scanner;

public class Main {
    public  static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Olá, seja bem vindo ao programa de cadastro");

            System.out.println("Digite seu nome completo : " );
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.println("Digite seu cpf : " );
            scanner.nextLine();
            String cpf = scanner.nextLine();

            System.out.println("Digite seu idade : " );
            int idade = scanner.nextInt();

            System.out.println("Digite seu altura : " );
            double altura = scanner.nextDouble();

            System.out.println("Digite seu peso : " );
            double peso = scanner.nextDouble();

            System.out.println("Digite seu estado civil : " );
            scanner.nextLine();
            String estCivil = scanner.nextLine();

                System.out.println("O seu nome é: " + nome +'\n'
                    +"O seu cpf é: " + cpf + '\n'
                    +"A sua idade é de: " + idade + " anos" + '\n'
                    + "A sua altura é de: " + altura + "m" + '\n'
                    + "O seu peso é de: " + peso + "Kg" + '\n'
                    + "O seu estado civil é: " + estCivil);

    }
}
