import java.util.Scanner;

public class convertidorGrados {
  public static void main(String[] args) {
    Scanner inputData = new Scanner(System.in);

    // Se imprime la orden al usuario para que ingrese una cantidad para ser convertida de Celsius a Fahrenheit
    System.out.println("Ingresa un temperatura en Celsius: ");
  
    // Se captura el input del usuario para la temperatura en Celsius
    int celsius = inputData.nextInt();

    // Esta variable es para la formula para convertir de Celsius a Farenheit
    double celsiusToFarenheit = (celsius * 9/5) + 32;

    // Imprime la cantidad de Celsius en Farenheit
    System.out.println("La temperatura de " + celsius + " grados Celsius es " + celsiusToFarenheit + " en grados Fahrenheit");

    // Se imprime la orden al usuario para que ingrese una cantidad para ser convertida de Fahrenheit a Celsius
    System.out.println("Ingresa un temperatura en Fahrenheit: ");

    // Se captura el input del usuario para la temperatura en Celsius
    int farenheit = inputData.nextInt();

    // Esta variable es para la formula para convertir de Fahrenheit a Celsius, y convertir el valor de la variable de integer a double, ya que la temperatura en fahrenheit lleva decimales.
    double farenheitToCelsius = (int) ((farenheit - 32) * 5/9) + 0.5;

    // Imprime la cantidad de Celsius en Farenheit
    System.out.println("La temperatura de " + farenheit + " grados Fahrenheit es " + farenheitToCelsius + " en grados Celsius");

    inputData.close();
  }
}
