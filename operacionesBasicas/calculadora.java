package operacionesBasicas;

import java.util.Scanner;

public class calculadora {


  public static class Operaciones {
    public int suma(int a, int b) {
      return a + b;
    }

    public int resta(int a, int b) {
      return a - b;
    }

    public int multiplicacion(int a, int b) {
      return a * b;
    }

    public double division(int a, int b) {
      if (b != 0) {
        return (double) a / b;
      } else {
        throw new IllegalArgumentException("No se puede dividir entre cero.");
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Menú principal de calculadora.");
    int a;
    int b;

    Operaciones operacion = new Operaciones();
    Scanner inputData = new Scanner(System.in);
    String opcion;

    do {
      System.out.println("Seleccione la operación que quiere realizar: SUMA, RESTA, MULTIPLICACION, DIVISION, SALIR");
      opcion = inputData.nextLine().toUpperCase();

      if(!"SALIR".equals(opcion)) {

        System.out.println("Ingrese un valor:");
        a = inputData.nextInt();
        System.out.println("Ingrese un valor:");
        b = inputData.nextInt();
        
        switch (opcion) {
          case "SUMA":
            System.out.println("Suma: " + operacion.suma(a, b));
            break;
          case "RESTA":
            System.out.println("Resta: " + operacion.resta(a, b));
            break;
          case "MULTIPLICACION":
            System.out.println("Multiplacion: " + operacion.multiplicacion(a, b));
            break;
          case "DIVISION":
            System.out.println("Division: " + operacion.division(a, b));
            break;
          default:
            System.out.println("Opción desconocida, escriba otra tecla");
            break;
        }
      }
    } while (!"SALIR".equals(opcion));
    
    inputData.close();
  }
}
