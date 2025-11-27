import java.sql.SQLOutput;
import java.util.Scanner;

public class ejerciciovoluntario6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra +  " se repite  " + contador + " veces en la palabra" + palabra);
                 }
}
