// Usa un bucle `while` para realizar una cuenta regresiva desde 10 hasta 1.

package estructurasDeControl;

public class cuentaRegresiva {

  public static void main(String[] args) {
    int i = 10;
    do {
      System.out.println(i);
      i--;
    } while (i > 0);
  }
}