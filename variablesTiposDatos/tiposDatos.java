/**
 * tiposDatos
 */
public class tiposDatos {
  public static void main(String[] args) {

  int edad = 33;
  String nombre = "Kevin Cruz";
  double estatura =  1.79;
  
  // Imprime las variables declaradas arriba
  System.out.println("nombre: " + nombre + " -> Dato tipo String");
  System.out.println("edad: " + edad + " -> Dato tipo Integer");
  System.out.println("estatura: " + estatura + " -> Dato tipo Double");

  // Hace casting de las variables y se imprime

  // Para convertir el número integer a Double no es necesario asignar una nueva variable.
  System.out.println("Edad convertida de Integer a Double: " + (double)edad);

  // Para convertir el número Double a Integer, se debe crear una nueva variable en la que se pase el nuevo tipo, mas el valor de 0.5 para poder redondearlo al siguiente número entero más cercano, y luego se imprime esta nueva variable.
  int estaturaInt = (int) (estatura + 0.5);
  System.out.println("Estatura redondeada al número más cercano hacia arriba, convertido de Double a Integer: " + estaturaInt);
  }
}