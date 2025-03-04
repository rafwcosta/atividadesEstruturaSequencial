package revisoes;

import java.util.Scanner;
import java.util.Locale;

public class Sequential01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite A: ");
        int a = sc.nextInt();
        System.out.print("Digite B: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}