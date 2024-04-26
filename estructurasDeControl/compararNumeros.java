// Escribe un programa que use `if` para comparar dos números e imprimir cuál es mayor o si son iguales.

package estructurasDeControl;
import java.util.Scanner;

public class compararNumeros {
  
  public static void main(String[] args) {
    Scanner inputData = new Scanner(System.in);

    System.out.println("Ingrese un número: ");
    int num1 = inputData.nextInt();

    System.out.println("Ingrese otro número: ");
    int num2 = inputData.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " es mayor que " + num2);
    } else {
      System.out.println(num2 + " es mayor que " + num1);
    }

    inputData.close();
  }
}
