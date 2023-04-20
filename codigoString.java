import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("string para ser invertida: ");
        String string = scanner.nextLine();
        String invertido = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            invertido += string.charAt(i);
        }

        System.out.println("A string invertida é: " + invertido);
      
    }
}