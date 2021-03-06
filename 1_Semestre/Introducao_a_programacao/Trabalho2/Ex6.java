//6.Como você alteraria o programa para imprimir as potências de x⁰ até x⁵? Quantos valores foram impressos na tela agora? 
public class Ex6 {
    private static void exemplo() {
        final int NMAX = 5;
        final double XMAX = 10;
        
        // Imprime o cabeçalho da tabela
        for (int n = 1; n <= NMAX; n++) {
            System.out.printf("%10d", n);
        }
        System.out.println();
        for (int n = 1; n <= NMAX; n++) {
            System.out.printf("%10s", "x ");
        }
        System.out.println("\n__________________________________________________________");
        
        // Imprime o corpo da tabela

        for (int x = 1; x <= XMAX; x++) {
            // Imprime uma linha da tabela
            
            for (int n = 1; n <= NMAX; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
    }
    public static void main() {
        exemplo();
        System.out.println("Basta alterar a constante 'NMAX' de 4 para 5");
        System.out.println("Foram impressos 50 valores desta vez.");
    }
}
