import java.util.Scanner;

public class ExerciciosWhile {
    
    //Modelo padrão disponibilizado pelo professor
    public static void main() {
      final double RATE = 5;
      final double INITIAL_BALANCE = 10000;
      double balance = INITIAL_BALANCE;

      System.out.print("Enter number of years: ");
      Scanner in = new Scanner(System.in);
      int nyears = in.nextInt();
      
      // Print the table of balances for each year

      for (int year = 1; year <= nyears; year++)
      {
         double interest = balance * RATE / 100;
         balance = balance + interest;
         System.out.printf("%4d %10.2f\n", year, balance);
      }
    }
    
    //Quantos anos são necessários para que o investimento triplique o valor inicial? 
    public static void Ex1() {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;
        final double META = 3*INITIAL_BALANCE;
        int nyears = 0;
      
        for (int i = 1; balance <= META; i++)
        {
            double interest = balance * RATE / 100;
            balance += interest;
            nyears = i;
        }
        
        System.out.printf("São necessários %d anos para triplicar o investimento.%n", nyears);
    }
    
    //Se o rendimento for 10% ao ano, quantos anos serão necessários para que o balanço duplique? O que é necessário mudar no programa? 
    public static void Ex2() {
        final double RATE = 10;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;
        final double META = 2*INITIAL_BALANCE;
        int nyears = 0;
      
        for (int i = 1; balance <= META; i++)
        {
            double interest = balance * RATE / 100;
            balance += interest;
            nyears = i;
        }
        
        System.out.printf("São necessários %d anos para duplicar o investimento.%n", nyears);
    }
    
    //Modifique o programa para que o mesmo imprima o balanço ao final de cada ano. O que você precisou alterar? 
    public static void Ex3() {
      final double RATE = 5;
      final double INITIAL_BALANCE = 10000;
      double balance = INITIAL_BALANCE;

      System.out.print("Enter number of years: ");
      Scanner in = new Scanner(System.in);
      int nyears = in.nextInt();

      for (int year = 1; year <= nyears; year++) {
         double interest = balance * RATE / 100;
         balance = balance + interest;
         System.out.printf("Balanço no ano %4d: R$%10.2f\n", year, balance);
      }
    }
    
    //Suponha que a condição de parada do laço while seja  diferente
    //Tive que mudar a variável de balance para balanco, e todas suas menções, e criar uma variável META
    public static void Ex4() {
        int year = 1;
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balanco = INITIAL_BALANCE;
        final double META = 3*INITIAL_BALANCE;

        System.out.print("Enter number of years: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();
      
        while (balanco <= META) {
            double interest = balanco * RATE / 100;
            balanco = balanco + interest;
            System.out.printf("%4d %10.2f\n", year, balanco);
            year++;
        }
    }
    
    //5. O que imprime
    public static void Ex5() {     
        int n = 1;
        while (n < 100)
        {
            n = 2 * n;
            System.out.print(n + " ");
        }
    }
    
    /*
        Escreva um laço que imprime:
        a. Todos os quadrados menores que n.
        b. Todos inteiros positivos que sejam divisíveis por 10 e menores que n.
        c. Todas as potências de 2 menores que n. Por exemplo, se n for 100, o programa imprime 1 2 4 8 16 32 64
    */
    public static void Ex6() {
        int n = 100;
        System.out.println("Escreva um valor: ");
        
        System.out.println();
        quadrados(n);
        
        System.out.println();
        multiplosDeDez(n);
        
        System.out.println();
        potenciasDeDois(n);
    }
    
    private static void quadrados(int n) {
        for (int i = 0; i < Math.sqrt(n); i++) {
            int resultado = (int)Math.pow(i, 2);
            System.out.print(resultado + " ");
        }
    }
    private static void multiplosDeDez(int n) {
        for (int i = 0; i < n; i++) {
            i *= 10;
            System.out.print(i + " ");
        }
    }
    private static void potenciasDeDois(int n) {}
    
    //7. O que é um laço infinito? Como você pode encerrar em seu programa um programa que entrou em laço infinito? 
    public static void Ex7() {
        while (true) { }
    }
    
    /*
        Escreva um programa que lê do teclado um número inteiro e faz uma contagem regressiva deste número simulando o lançamento de um foguete. Por exemplo, se o usuário digitar 5, o programa imprime a cada linha: 
        
        Faltam 5 segundos.
        Faltam 4 segundos.
        Faltam 3 segundos.
        Faltam 2 segundos.
        Falta 1 segundo.
    */
    public static void Ex8() {
        
    }
    
    //9. Adapte o programa DuplicaInvestimento para que ele solicite ao usuário o valor do saldo inicial, o rendimento anual e o saldo final desejado. 
    public static void Ex9DuplicaInvestimento(){
      final double RATE = 5;
      final double INITIAL_BALANCE = 10000;
      double balance = INITIAL_BALANCE;

      System.out.print("Enter number of years: ");
      Scanner in = new Scanner(System.in);
      int nyears = in.nextInt();
      
      // Print the table of balances for each year

      for (int year = 1; year <= nyears; year++)
      {
         double interest = balance * RATE / 100;
         balance = balance + interest;
         System.out.printf("%4d %10.2f\n", year, balance);
      }
    }
}
