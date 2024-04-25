import java.util.Scanner;

/**
 * HelloApp
 */
public class HelloApp {

  public static void main(String[] args) {

    // Recibe el input del nombre del usuario
    Scanner inputText = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");

    // Imprime el saludo al usuario
    String userName = inputText.nextLine();
    System.out.println("Hola " + userName);

    // Recibe el input del estado del usuario
    System.out.println("Como estás?");
    String greet = inputText.nextLine();

    // Imprime el nombre del usuario, seguido del estado que se ingreso.
    System.out.println(userName + " se encuentra " + greet);

    // Repetidor de saludo con ciclo while
    int contadorSaludo = 0;

    while (contadorSaludo < 3) {
      System.out.println("Hola, " + userName + " (vez " + (contadorSaludo + 1) + ")");
      contadorSaludo++;
    }

    inputText.close();
  }
}