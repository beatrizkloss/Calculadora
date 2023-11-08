import java.util.Scanner;

public class CalculadoraJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
            System.out.println("***CALCULADORA***");
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            if (operacao == '+') {
                System.out.println("Resultado: " + (num1 + num2));
            } else if (operacao == '-') {
                System.out.println("Resultado: " + (num1 - num2));
            } else if (operacao == '*') {
                System.out.println("Resultado: " + (num1 * num2));
            } else if (operacao == '/') {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            } else {
                System.out.println("Operação inválida.");
            }

            System.out.println("Deseja continuar? (1 para sim, 0 para não): ");
            continuar = scanner.nextInt();
        }

        scanner.close();
    }
}