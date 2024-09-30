import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("Escolha uma operação (+, -, *, /): ");
            char operador = scanner.next().charAt(0);
            
            double resultado = 0;
            
            switch(operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro! Divisão por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }
            
            System.out.println("O resultado é: " + resultado);
            
            System.out.println("Deseja continuar? (S/N)");
            continuar = scanner.next().charAt(0);
            
        } while (continuar == 'S' || continuar == 's');
        
        System.out.println("Calculadora encerrada.");
    }
}