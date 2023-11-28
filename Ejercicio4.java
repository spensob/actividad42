/**
 * Programa que pide una cadena por teclado y devuelve la cantidad de veces que se repite cada vocal (a, e, i, o, u).
 * 
 * @author Sergio Peña
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Pido los datos por teclado
        System.out.println("Escribe un texto:");
        String cadena = System.console().readLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0; // Variables para almacenar cada vocal

        for(int j = 0; j < cadena.length(); j++){
            if(cadena.charAt(j) == 'a'){
                a++;
            }
            else if(cadena.charAt(j) == 'e'){
                e++;
            }
            else if(cadena.charAt(j) == 'i'){
                i++;
            }
            else if(cadena.charAt(j) == 'o'){
                o++;
            }
            else if(cadena.charAt(j) == 'u'){
                u++;
            }
        }

        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
    }
}
