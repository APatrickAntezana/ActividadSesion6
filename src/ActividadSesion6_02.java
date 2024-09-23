import java.util.Scanner;

public class ActividadSesion6_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        // Bucle while para contar números positivos
        System.out.println("Ingrese un número (negativo para detener): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            contador++;
            System.out.println("Ingrese otro número (negativo para detener): ");
            numero = scanner.nextInt();
        }

        // Mostrar el resultado
        System.out.println("Cantidad de números positivos ingresados: " + contador);

        // Cerrar el Scanner
        scanner.close();
    }
}
