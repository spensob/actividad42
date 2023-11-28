/**
 * Este programa pide dos cadenas por teclado y compara si son iguales ó no si tener en cuenta las mayúsculas
 * 
 * @author Sergio Peña
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Escribe la primera cadena");
        String cadena1 = System.console().readLine();
        System.out.println("Escribe la segunda cadena");
        String cadena2 = System.console().readLine();

        if(cadena1.equalsIgnoreCase(cadena2)){ // Uso equalsIgnoreCase en vez de equals para ignorar las mayúsculas y minúsculas
            System.out.println("Las dos cadenas son iguales");
        }
        else{
            System.out.println("Las dos cadenas no son iguales");
        }
    }
}
