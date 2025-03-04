package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Sequential05 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Código da peça 1: ");
        int codigoPecaUm = sc.nextInt();
        System.out.print("Número de peças 1: ");
        double numeroPecaUm = sc.nextDouble();
        System.out.print("Valor de cada peça 1: ");
        double valorPecaUm = sc.nextDouble();
        System.out.print("Código da peça 2: ");
        int codigoPecaDois = sc.nextInt();
        System.out.print("Número de peças 2: ");
        double numeroPecaDois = sc.nextDouble();
        System.out.print("Valor de cada peça 2: ");
        double valorPecaDois = sc.nextDouble();

        double total = (numeroPecaUm * valorPecaUm) + (numeroPecaDois * valorPecaDois);

        System.out.printf("Valor total a ser pago: R$ %.2f%n", total);

        sc.close();
    }
}