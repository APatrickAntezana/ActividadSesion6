import java.util.Scanner;

public class ActividadSesion6_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        int i = 1;

        // Bucle while para mostrar la tabla de multiplicar
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;  // Incrementar el contador
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
