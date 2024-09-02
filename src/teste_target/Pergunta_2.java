package teste_target;
import java.util.Scanner;

public class Pergunta_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        
        int fib1 = 0;
        int fib2 = 1;
        
        int fibAtual = 0;

        
        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            
            while (fibAtual < numero) {
                fibAtual = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibAtual;
            }
            
            
            if (fibAtual == numero) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        }
        
        
        scanner.close();
    }
}
