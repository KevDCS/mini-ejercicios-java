package operacionesBasicas;

/**
 * operacionesBasicas
 */
public class operacionesBasicas {
  public static void main(String[] args) {

    int num1 = 5;
    int num2 = 15;
  
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicar = num1 * num2;
    int dividir = num1 / num2;
    int modulo = num1 % num2;
    double resultado = Math.pow(5, 2);

    System.out.println("La suma de las variables " + num1 + " y " + num2 + " es: " + suma);
    System.out.println("La resta de las variables " + num1 + " y " + num2 + " es: " + resta);
    System.out.println("La muktiplicación de las variables " + num1 + " y " + num2 + " es: " + multiplicar);
    System.out.println("La división de las variables " + num1 + " y " + num2 + " es: " + dividir);
    System.out.println("La diferencia de las variables " + num1 + " y " + num2 + " es " + modulo);
    System.out.println("10 elevado a la potencia de 2 es " + resultado);
  }
}