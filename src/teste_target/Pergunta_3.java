package teste_target;
import java.util.Arrays;

public class Pergunta_3 {

    public static void main(String[] args) {
        // Foi criado um Vetor com o faturamento diário equivalente a (30 dias), assumindo que valores 0 representam dias sem faturamento
        double[] faturamento = {
            1200.50, 0, 2500.00, 3000.00, 0, 5000.00, 7000.00,
            1000.25, 3500.50, 0, 4500.50, 1500.00, 0, 0,
            4000.25, 0, 0, 6000.50, 8000.00, 0, 0,
            5000.00, 6000.25, 0, 3000.00, 1200.00, 0, 10000.00, 0, 4000.25
        };

        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;

        
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        
        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        
        double mediaMensal = somaFaturamento / diasComFaturamento;

        
        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Resultados
        System.out.println("Menor faturamento: R$ " + menorFaturamento);
        System.out.println("Maior faturamento: R$ " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
