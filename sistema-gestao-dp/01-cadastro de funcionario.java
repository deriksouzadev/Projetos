import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" SISTEMA DE GESTÃO DE DP");
        System.out.println("=================================");

        System.out.println("--- Cadastro de Funcionário ---");

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        while (nome.isEmpty()) {
            System.out.println("Erro: o nome não pode ficar vazio.");
            System.out.print("Digite o nome novamente: ");
            nome = entrada.nextLine();
        }

        System.out.print("CPF: ");
        String cpf = entrada.nextLine();

        while (cpf.isEmpty()) {
            System.out.println("Erro: o CPF não pode ficar vazio.");
            System.out.print("Digite o CPF novamente: ");
            cpf = entrada.nextLine();
        }

        System.out.print("Cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Salário: ");
        double salario = entrada.nextDouble();

        if (salario < 0) {
            System.out.println("Erro: o salário não pode ser negativo.");
        }

        while (salario<0){
            System.out.print("Digite o salario novamente: ");
            salario = entrada.nextDouble();
        }
        
        System.out.println("\n--- Funcionário cadastrado ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);

        entrada.close();
    }
}
