import java.util.Scanner;

public class ParOuImpar {
  
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int num = 0;
    String resultado;

    // Entrada de dados

    System.out.println("Informe o número:\n");
    num = ler.nextInt();

    // Processamento de dados

    if (num % 2 == 0 ) {
      resultado = "par";
    } else if (num % 2 != 0) {
      resultado = "impar"; 
    } else {
      resultado = "negativo";
    }

    // Saída de dados

    System.out.println("O número é: " + resultado);

  }
}
