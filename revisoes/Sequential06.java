package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Sequential06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        System.out.print("C: ");
        double c = sc.nextDouble();

        double trianguloRetangulo = (a * c ) / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = (a + b) / 2.0 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("Triângulo retângulo: %.3f%n", trianguloRetangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}
