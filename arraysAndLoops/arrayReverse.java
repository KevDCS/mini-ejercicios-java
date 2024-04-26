// Modifica el array anterior para que imprima todos los valores al revés.

package arraysAndLoops;

public class arrayReverse {
  public static void main(String[] args) {
    
    int[] numbers = {10,20,30,40,50};

    System.out.println("Este es el array al revés:");
    for (int i = numbers.length - 1; i >= 0; i--){
      System.out.println(numbers[i]);
    }
  }
}