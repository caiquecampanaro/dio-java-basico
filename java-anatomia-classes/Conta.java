public class Conta {

  // variavel da classe conta
  double saldo = 10.0;

  public void sacar(Double valor) {

    // variavel local do método
    double novoSaldo = saldo - valor;
  }

  public void imprimirSaldo() {

    // disponível em toda classe
    System.out.println(saldo);
    // somente o método sacar conhece essa variavel ( não consegue utilizar)
    System.out.println(novoSaldo);
  }
}
