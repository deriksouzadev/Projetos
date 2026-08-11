import java.util.Scanner;
import java.util.ArrayList;

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

        while (salario < 0) {
            System.out.print("Digite o salario novamente: ");
            salario = entrada.nextDouble();
        }

            Funcionario funcionario = new Funcionario();

            funcionario.nome = nome;
            funcionario.cpf = cpf;
            funcionario.cargo = cargo;
            funcionario.salario = salario;

            ArrayList<Funcionario> funcionarios = new ArrayList<>();

            funcionarios.add(funcionario);

            for (int i = 0; i < funcionarios.size(); i++) {

                System.out.println("Nome: " + funcionarios.get(i).nome);
                System.out.println("CPF: " + funcionarios.get(i).cpf);
                System.out.println("Cargo: " + funcionarios.get(i).cargo);
                System.out.println("Salário: " + funcionarios.get(i).salario);
            }
        }
        }

        class Funcionario {

            String nome;
            String cpf;
            String cargo;
            double salario;

        }
