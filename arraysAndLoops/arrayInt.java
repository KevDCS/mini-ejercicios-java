// Crea un array de enteros y usa un bucle para sumar todos los valores del array.

package arraysAndLoops;

/**
 * arrayInt
 */
public class arrayInt {

  public static void main(String[] args) {
    int[] numbers = {10,20,30,40,50};

    int sum = 0;

    for(int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    System.out.println("La suma del array es " + sum);
  }
}