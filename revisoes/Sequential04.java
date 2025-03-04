package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Sequential04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Número do funcionário: ");
        int numero = sc.nextInt();
        System.out.print("Horas trabalhadas (mensal): ");
        double horas = sc.nextDouble();
        System.out.print("Valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.printf("Salário do funcionário n° %d: R$ %.2f%n", numero, salario);

        sc.close();
    }
}