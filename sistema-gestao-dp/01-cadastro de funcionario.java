import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" SISTEMA DE GESTÃO DE DP");
        System.out.println("=================================");

        System.out.println("\n--- Cadastro de Funcionário ---");

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("CPF: ");
        String cpf = entrada.nextLine();

        System.out.print("Cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Salário: ");
        double salario = entrada.nextDouble();

        System.out.println("\n--- Funcionário cadastrado ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);

        entrada.close();
    }
}
