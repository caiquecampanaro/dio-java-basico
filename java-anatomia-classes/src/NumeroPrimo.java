import java.util.Scanner;

public class NumeroPrimo {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int num;
    String resultado;

    // Entrada de dados
    System.out.println("Informe um número:\n");
    num = ler.nextInt();

    // Processamento de dados

    if (num == 2 || num == 1 || num > 0 && num % 2 != 0 && num % num == 0) {
      resultado = "primo";
    } else if (num % 2 == 0 && num != 2) {
      resultado = "não é primo";
    } else {
      resultado = "invalido";
    }
    // Saida de Dados

    System.out.println(resultado);

  }
}
