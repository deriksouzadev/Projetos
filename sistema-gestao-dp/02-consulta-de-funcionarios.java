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

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pedro";
        funcionario.cpf = "12345678900";
        funcionario.cargo = "Auxiliar Administrativo";
        funcionario.salario = 3000;

        funcionarios.add(funcionario);


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma opção: ");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Listando funcionários.");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.println("CPF: " + funcionarios.get(i).cpf);
                System.out.println("Cargo: " + funcionarios.get(i).cargo);
                System.out.println("Salário: " + funcionarios.get(i).salario);
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
    class Funcionario {

        String nome;
        String cpf;
        String cargo;
        double salario;
    }



