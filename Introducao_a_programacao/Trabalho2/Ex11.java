/**
11. Escreva um programa que imprime uma tabuada até o 10 × 10. 
 */
public class Ex11
{
    public static void main() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\tx\t%d\t=\t%d%n", i, j, i*j);
            }
            System.out.println("------------------------------------");
        }
    }
}
