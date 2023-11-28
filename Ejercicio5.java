/**
 * Programa que pide una frase por teclado y comprueba si es palíndromo
 * 
 * @author Sergio Peña
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Pido por teclado la cadena
        System.out.println("Escribe una frase:");
        String cadena = System.console().readLine();
        String cadenaReversa = "";

        for(int i = cadena.length(); i >= 1; i--){ // Empiezo a contar desde el último carácter de la cadena
            cadenaReversa += cadena.substring(i - 1, i); // Añado a la cadena reversa desde el último carácter de la cadena hasta el primero
        }

        if(cadena.replace(" ", "").equalsIgnoreCase(cadenaReversa.replace(" ", ""))){ // Quito los espacios vacíos y comparo ambas cadenas ignorando las mayúsculas y minúsculas
            System.out.println("Es palíndromo");
        }
        else{
            System.out.println("No es palíndromo");
        }
    }
}
