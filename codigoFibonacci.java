import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int numero = scanner.nextInt();
        boolean pertence = false;
        int primeiro = 0;
        int segundo = 1;

        if (numero == primeiro || numero == segundo) {
            pertence = true;
        } else {
            int proximo = primeiro + segundo;
            while (proximo <= numero) {
                if (proximo == numero) {
                    pertence = true;
                    break;
                }
                primeiro = segundo;
                segundo = proximo;
                proximo = primeiro + segundo;
            }
        }

        if (pertence) {
            System.out.println("O numero " + numero + " pertence a sequencia de fibonacci.");
        } else {
            System.out.println("O numero " + numero + " nao pertence a sequencia de fibonacci.");
        }

    }
}