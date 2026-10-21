import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Calculadora...%nSelecione uma operação:%n[1] Adição%n[2] Subtração%n[3] Divisão%n[4] Multiplicação%n");

        System.out.print("Escolha: ");
        byte escolhaOperacao = scanner.nextByte();

        System.out.print("Escolha o 1° número: ");
        double num01 = scanner.nextDouble();

        System.out.print("Escolha o 2° número: ");
        double num02 = scanner.nextDouble();

        double resultado;

        switch (escolhaOperacao) {
            case 1:
                resultado = num01 + num02;
                break;

            case 2:
                resultado = num01 - num02;
                break;

            case 3:
                if (num02 != 0) {
                    resultado = num01 / num02;
                } else {
                    System.out.println("ERRO!: DIVISÃO POR 0");
                    scanner.close();
                    return;
                }
                break;

            case 4:
                resultado = num01 * num02;
                break;

            default:
                System.out.println("OPERAÇÃO INVÁLIDA!");
                scanner.close();
                return;
        }
        System.out.println("Resultado: " + resultado);

        scanner.close();

    }
}
