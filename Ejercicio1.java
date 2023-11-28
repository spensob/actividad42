/**
 * Este programa pide una cadena de texto por teclado y devuelve cada uno de los caracteres por línea
 * 
 * @author Sergio Peña
 */

public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Introduce una cadena y te devuelvo cada carácter en una línea diferente.");
        String cadena = System.console().readLine();
        for(int i = 0; i < cadena.length(); i++){ // Itera tantas veces dependiendo de la longitud de la cadena
            System.out.println(cadena.charAt(i)); // Devuelvo el caracter segun la posicion de la cadena
        }
    }
}