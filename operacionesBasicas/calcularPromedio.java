package operacionesBasicas;

import java.util.Scanner;

public class calcularPromedio {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);

    System.out.println("Ingrese el primer número: ");
    int num1 = inputData.nextInt();

    System.out.println("Ingrese el segundo número: ");
    int num2 = inputData.nextInt();

    System.out.println("Ingrese el tercer número: ");
    int num3 = inputData.nextInt();

    System.out.println("Ingrese el cuarto número: ");
    int num4 = inputData.nextInt();

    System.out.println("Ingrese el quinto número: ");
    int num5 = inputData.nextInt();
    
    System.out.println("El promedio de estas cantidades es: " + (num1+num2+num3+num4+num5) / 5);
  }
}
