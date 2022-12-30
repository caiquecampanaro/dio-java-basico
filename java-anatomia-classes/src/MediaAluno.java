import java.util.Scanner;

public class MediaAluno {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double mediaAluno;
    int nota = 0;
    int contador;
    String resultado;
    int soma = 0;

    for (contador = 1; contador < 4; contador++) {

      // Entrada de dados

      System.out.println("Informe a nota:\n");
      nota = ler.nextInt();
      soma += nota;

    }
    // Processamento dados

    contador = contador - 1;
    mediaAluno = soma / contador;

    if (mediaAluno < 6) {
      resultado = "reprovou";
    } else if (mediaAluno == 6) {
      resultado = "passou na média";
    } else {
      resultado = "passou de boas";
    }
    // Saída de dados
    System.out.println("O aluno " + resultado);
  }
}
