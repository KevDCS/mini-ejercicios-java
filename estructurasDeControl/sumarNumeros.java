// Desarrolla un programa que pida al usuario un número y utilice un bucle `do-while` para sumar todos los números hasta ese número.

package estructurasDeControl;
import java.util.Scanner;

public class sumarNumeros {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num1 = inputData.nextInt();
    int suma = 0;
    int counter = 0;

    do {
      suma += counter;
      counter++;
    }
    while(counter <= num1);

    System.out.println("La suma de todos los números hasta " + num1 + " es " + suma);

    inputData.close();
  }
}
