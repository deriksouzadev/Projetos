import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" SISTEMA DE GESTÃO DE DP");
        System.out.println("=================================");

        System.out.println("--- Consulta de Funcionários ---");

        System.out.println("1 - Listar funcionários");
        System.out.println("2 - Buscar funcionário");
        System.out.println("3 - Voltar");

        ArrayList<String> funcionarios = new ArrayList<>();

        funcionarios.add("Pedro");
        funcionarios.add("Maria");
        funcionarios.add("Lucas");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma opção: ");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Listando funcionários.");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println(funcionarios.get(i));
            }
        } else if (opcao == 2) {
            System.out.println("Buscando funcionários.");
        } else if (opcao == 3) {
            System.out.println("Voltando...");
        }else {
            System.out.println("Opção inválida.");
        }
    }
}

