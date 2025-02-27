import java.util.Scanner;
import java.util.Locale;

public class question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Número do funcionário: ");
        int numeroDoFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas (mensalmente): ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.print("Valor que recebe por hora: ");
        double valorQueRecebePorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorQueRecebePorHora;

        System.out.println("Número: " + numeroDoFuncionario);
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();
    }
}