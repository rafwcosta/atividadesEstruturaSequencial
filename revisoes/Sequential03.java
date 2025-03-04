package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Sequential03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite A: ");
        int a = sc.nextInt();
        System.out.print("Digite B: ");
        int b = sc.nextInt();
        System.out.print("Digite C: ");
        int c = sc.nextInt();
        System.out.print("Digite D: ");
        int d = sc.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("Diferença: " + diferenca);

        sc.close();
    }
}
