import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastrar empregado assalariado:");
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.print("CPF: ");
        String CPF = in.nextLine();
        System.out.print("Salário: ");
        double salario = in.nextDouble();
        in.nextLine();

        AtvDozeAssalariado empregadoAssalariado = new AtvDozeAssalariado(nome, sobrenome, CPF, salario);

        System.out.println("\nCadastrar empregado comissionado:");
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = in.nextLine();
        System.out.print("CPF: ");
        CPF = in.nextLine();
        System.out.print("Total de vendas: ");
        double totalVendas = in.nextDouble();
        System.out.print("Taxa de comissão: ");
        double taxaComissao = in.nextDouble();
        in.nextLine();

        AtvDozeComissionado empregadoComissionado = new AtvDozeComissionado(nome, sobrenome, CPF, totalVendas, taxaComissao);

        System.out.println("\nCadastrar empregado horista:");
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = in.nextLine();
        System.out.print("CPF: ");
        CPF = in.nextLine();
        System.out.print("Preço da hora: ");
        double precoHora = in.nextDouble();
        System.out.print("Horas trabalhadas: ");
        double horasTrabalhadas = in.nextDouble();
        in.nextLine();

        AtvDozeHorista empregadoHorista = new AtvDozeHorista(nome, sobrenome, CPF, precoHora, horasTrabalhadas);

        System.out.println("\nInformações dos empregados:");
        System.out.println("Assalariado:");
        System.out.println(empregadoAssalariado.getNome() + " " + empregadoAssalariado.getSobrenome() + " - Salário: R$" + empregadoAssalariado.getSalario());
        System.out.println("Comissionado:");
        System.out.println(empregadoComissionado.getNome() + " " + empregadoComissionado.getSobrenome() + " - Comissão: R$" + empregadoComissionado.calcularSalario());
        System.out.println("Horista:");
        System.out.println(empregadoHorista.getNome() + " " + empregadoHorista.getSobrenome() + " - Salário: R$" + empregadoHorista.calcularSalario());

        in.close();
    }
}
