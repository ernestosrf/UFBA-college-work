
public class Aluguel {
  private Fita fita;
  private int diasAlugada;

  public Aluguel(Fita fita, int diasAlugada) {
    this.fita = fita;
    this.diasAlugada = diasAlugada;
  }

  public Fita getFita() {
    return fita;
  }

  public int getDiasAlugada() {
    return diasAlugada;
  }

  public double calcularValor() {

    double valor = 0.0;

    switch(getFita().getCodigoDePreco()) {
      case Fita.NORMAL:
        valor += 2;
        if(getDiasAlugada() > 2) {
          valor += (getDiasAlugada() - 2) * 1.5;
        }
        break;
      case Fita.LANCAMENTO:
        valor += getDiasAlugada() * 3;
        break;
      case Fita.INFANTIL:
        valor += 1.5;
        if(getDiasAlugada() > 3) {
          valor += (getDiasAlugada() - 3) * 1.5;
        }
        break;
    } // fim do switch
    return valor;
  }

}

