import java.util.Scanner;

// -------------------- Clase Auxiliar: Validador --------------------
class Validador {

    // Comprueba si la contraseña es segura (más de 8 caracteres)
    public static boolean esPasswordSegura(String pass) {
        return pass.length() > 8;
    }

    // Convierte la primera letra del nombre a mayúscula
    public static String formatearNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return nombre;
        }
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }

    // Comprueba si el email contiene '@'
    public static boolean esEmailValido(String email) {
        return email.contains("@");
    }

    // Muestra los requisitos cuando la validación falla
    public static void mostrarErrores() {
        System.out.println("Error en los datos ingresados:");
        System.out.println("- La contraseña debe tener más de 8 caracteres.");
        System.out.println("- El email debe contener '@'.");
    }
}

// -------------------- Clase Principal: RegistroUsuario --------------------
public class ejercicionotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        nombre = Validador.formatearNombre(nombre);

        // Pedir email
        System.out.print("Introduce tu email: ");
        String email = sc.nextLine();

        // Validación simple del email
        while (!Validador.esEmailValido(email)) {
            System.out.println("Email no válido.");
            Validador.mostrarErrores();
            System.out.print("Introduce un email válido: ");
            email = sc.nextLine();
        }

        // Pedir contraseña con do-while
        String password;
        do {
            System.out.print("Introduce una contraseña: ");
            password = sc.nextLine();

            if (!Validador.esPasswordSegura(password)) {
                System.out.println("Contraseña no válida.");
                Validador.mostrarErrores();
            }

        } while (!Validador.esPasswordSegura(password));

        System.out.println(" Registro completado: Usuario " + nombre +
                " registrado con email " + email);

        sc.close();
    }
}
