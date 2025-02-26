import java.util.Scanner;
import java.util.Locale;

public class question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.printf("Área: %.4f%n", area);

        sc.close();
    }
}