package operacionesBasicas;

import java.util.Scanner;

public class calculadora {

  public static void main(String[] args) {
    Scanner inputData = new Scanner(System.in);

    System.out.println("Calculadora sencilla.");

    while(true) {
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

      // Comprobar la opción ingresada por el usuario

      if(option == 5) {
        System.out.println("Ha salido del programa.");
        break;
      }

      // Capturar los valores para hacer las operaciones
      System.out.println("Ingrese el primer número: ");
      double num1 = inputData.nextDouble();
      System.out.println("Ingrese el segundo número: ");
      double num2 = inputData.nextDouble();

      // Hacer la operación según la opción seleccionada por el usuario
      double result = 0;
      if (option == 1) {
        result = num1 + num2;
      } else if (option == 2) {
        result = num1 - num2;
      } else if (option == 3) {
        result = num1 * num2;
      } else if (option == 4) {
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("No es posible dividir entre 0.");
          continue;
        }
      } else {
        System.out.println("Esa no es una opción valida, favor ingrese una opción del menú.");
        continue;
      }

      System.out.println("El resultado es: " + result);

    }
    inputData.close();
  }
}
