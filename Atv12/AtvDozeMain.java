package Atv12;
import java.util.ArrayList;
import java.util.Scanner;

public class AtvDozeMain {
    private static ArrayList<Object> listaEmpregados = new ArrayList<Object>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar um novo empregado");
            System.out.println("2 - Consultar dados de um empregado");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarEmpregado(scanner);
                    break;
                case 2:
                    consultarEmpregado(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarEmpregado(Scanner scanner) {
        System.out.println("Selecione o tipo de empregado:");
        System.out.println("1 - Assalariado");
        System.out.println("2 - Comissionado");
        System.out.println("3 - Horista");

        int tipoEmpregado = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do empregado:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do empregado:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o CPF do empregado:");
        String CPF = scanner.nextLine();

        switch (tipoEmpregado) {
            case 1:
                System.out.println("Digite o salário do empregado:");
                double salario = scanner.nextDouble();

                AtvDozeAssalariado assalariado = new AtvDozeAssalariado(nome, sobrenome, CPF, salario);
                System.out.println("Assalariado cadastrado com sucesso: " + assalariado.getNome());
                listaEmpregados.add(assalariado);
                break;
            case 2:
                System.out.println("Digite o total de vendas do empregado:");
                double totalVendas = scanner.nextDouble();

                System.out.println("Digite a taxa de comissão do empregado:");
                double taxaComissao = scanner.nextDouble();

                AtvDozeComissionado comissionado = new AtvDozeComissionado(nome, sobrenome, CPF, totalVendas,
                        taxaComissao);
                System.out.println("Comissionado cadastrado com sucesso: " + comissionado.getNome());
                listaEmpregados.add(comissionado);
                break;
            case 3:
                System.out.println("Digite o preço por hora do empregado:");
                double precoHora = scanner.nextDouble();

                System.out.println("Digite as horas trabalhadas do empregado:");
                double horasTrabalhadas = scanner.nextDouble();

                AtvDozeHorista horista = new AtvDozeHorista(nome, sobrenome, CPF, precoHora, horasTrabalhadas);
                System.out.println("Horista cadastrado com sucesso: " + horista.getNome());
                listaEmpregados.add(horista);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    private static void consultarEmpregado(Scanner scanner) {
        System.out.println("Digite o CPF do empregado:");
        String CPF = scanner.nextLine();

        AtvDozeEmpregado empregado = encontrarEmpregadoPorCPF(CPF);

        if (empregado != null) {
            System.out.println("Nome completo: " + empregado.getNomeCompleto());
            System.out.println("CPF: " + empregado.getCPF());

            if (empregado instanceof AtvDozeAssalariado) {
                AtvDozeAssalariado assalariado = (AtvDozeAssalariado) empregado;
                System.out.println("Tipo: Assalariado");
                System.out.println("Salário: " + assalariado.getSalario());
            } else if (empregado instanceof AtvDozeComissionado) {
                AtvDozeComissionado comissionado = (AtvDozeComissionado) empregado;
                System.out.println("Tipo: Comissionado");
                System.out.println("Total de vendas: " + comissionado.getTotalVendas());
                System.out.println("Taxa de comissão: " + comissionado.getTaxaComissao());
            } else if (empregado instanceof AtvDozeHorista) {
                AtvDozeHorista horista = (AtvDozeHorista) empregado;
                System.out.println("Tipo: Horista");
                System.out.println("Preço por hora: " + horista.getPrecoHora());
                System.out.println("Horas trabalhadas: " + horista.getHorasTrabalhadas());
            }
        } else {
            System.out.println("Empregado não encontrado.");
        }
    }

    private static AtvDozeEmpregado encontrarEmpregadoPorCPF(String CPF) {
        for (Object empregado : listaEmpregados) {
            AtvDozeEmpregado convertedEmpregado = (AtvDozeEmpregado) empregado;
            if (convertedEmpregado.getCPF().equals(CPF)) {
                return convertedEmpregado;
            }
        }
        return null;
    }
}