/**
 * Este programa pide por teclado el nombre y los dos apellidos y devuelve las 3 primeras letras del nombre, del primer apellido y del segundo apellido y lo devuelve en mayúsculas
 * 
 * @author Sergio Peña
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Pido los datos por teclado
        System.out.println("Introduce tu nombre:");
        String nombre = System.console().readLine();
        System.out.println("Introduce tu primer apellido:");
        String apellido1 = System.console().readLine();
        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = System.console().readLine();

        String cadenaFinal = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3); // Almaceno las 3 cadenas en una variable y de cada variable cojo solo las 3 primeras letras

        System.out.println(cadenaFinal.toUpperCase()); // Muestro la cadena en mayusculas
    }
}
