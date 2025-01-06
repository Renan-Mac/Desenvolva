import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha;

        // Validar a senha digitada pelo usuário
        while (true) {
            System.out.println("Informe uma senha com quatro dígitos positivos:");
            if (entrada.hasNextInt()) { // Verifica se a entrada é um número
                senha = entrada.nextInt();
                if (senha >= 1 && senha <= 9999) { // Verifica se está no intervalo válido
                    break;
                } else {
                    System.out.println("A senha deve ser positiva e ter exatamente 4 dígitos!");
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números!");
                entrada.next(); // Descarta a entrada inválida
            }
        }

        long inicio = System.currentTimeMillis(); // Marca o início do processo

        int tentativas = 0;

        // Testa todas as combinações de 0000 a 9999
        for (int i = 0; i <= 9999; i++) {
            tentativas++;
            if (i == senha) { // Compara a tentativa com a senha
                System.out.println("Senha localizada: " + String.format("%04d", i)); // Formata com 4 dígitos
                break;
            }
        }

        long fim = System.currentTimeMillis(); 
        long tempoExecucao=fim - inicio; // Tempo total em milissegundos

        // Exibe os resultados
        System.out.println("Tentativas realizadas: " + tentativas);
        System.out.println("Tempo total gasto: " + tempoExecucao + " ms");

        entrada.close();
    }
}
