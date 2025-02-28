import java.util.Scanner;
import java.util.Locale;

public class Question05 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Código da peça 1: ");
        double codigo01 = sc.nextDouble();
        System.out.print("Quantidade: ");
        double quantidade01 = sc.nextDouble();
        System.out.print("Valor da peça 1: ");
        double valor01 = sc.nextDouble();
        System.out.print("Código da peça 2: ");
        double codigo02 = sc.nextDouble();
        System.out.print("Quantidade: ");
        double quantidade02 = sc.nextDouble();
        System.out.print("Valor da peça 2: ");
        double valor02 = sc.nextDouble();

        double total = (quantidade01 * valor01) + (quantidade02 * valor02);

        System.out.printf("Valor a ser pago: R$ %.2f%n", total);

        sc.close();
    }
}