package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Sequential02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.printf("Área do círculo: %.4f%n", area);

        sc.close();
    }
}
