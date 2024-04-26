package estructurasDeControl;

import java.util.Scanner;

public class calculadoraSwitch {

  public static void main(String[] args) {
    System.out.println("Menú principal de calculadora.");
    Scanner inputData = new Scanner(System.in);

    while (true) {

      // Se muestra un menú de opciones al usuario en consola
      System.out.println("Por favor elija que operación desea hacer: ");
      System.out.println("1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Salir");

      // Se captura la opción elegida por el usuario
      System.out.println("Opción: ");
      int option = inputData.nextInt();

      if (option == 5) {
        System.out.println("Ha salido del programa.");
        break;
      }

      // Capturar los valores para hacer las operaciones
      System.out.println("Ingrese el primer número: ");
      double num1 = inputData.nextDouble();
      System.out.println("Ingrese el segundo número: ");
      double num2 = inputData.nextDouble();

      // Se crea la variable result para almacenar el resultado de cada operación.
      double result = 0;
      switch (option) {
        // Sumar
        case 1:
          result= num1 + num2;
          System.out.println("La suma de " + num1 + " y " + num2 + " es " + result);
          break;
        // Restar
        case 2:
          result= num1 - num2;
          System.out.println("La resta de " + num1 + " y " + num2 + " es " + result);
          break;
        // Multiplicar
        case 3:
          result= num1 * num2;
          System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + result);
          break;
        // Dividir
        case 4:
          if (num2 != 0) { // Se hace un if para verificar que el usuario no ingresa un 0 en el segundo número
            result= num1 / num2;
          } else {
            System.out.println("No es posible dividir entre 0.");
            continue;
          }
          System.out.println("La division de " + num1 + " y " + num2 + " es " + result);
          break;
        case 5:
          System.out.println("Salir del programa");
          break;
        default:
          System.out.println("Opción no valida.");
      }
    }
    inputData.close();
  }
}
