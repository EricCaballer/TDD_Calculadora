package controlador;
//Superclasse que deriva als mètodes de la calculadora

public class OperacionAritmetica {
  protected float valor1;
  protected float valor2;
  protected float resultado;

  public OperacionAritmetica() {
    super();
    valor1 = 0;
    valor2 = 0;
    resultado = 0;
  }

  public float getValor1() {return valor1;}

  public float getValor2() {return valor2;}

  public float getResultado() {return resultado;}

  public void setValor1(float x) {valor1 = x;}

  public void setValor2(float x) {valor2 = x;}

  public void setResultado(float x) {resultado = x;}

}



