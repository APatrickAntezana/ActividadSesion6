public class ActividadSesion6_01 {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;

        // Bucle while para sumar los números del 1 al 10
        while (numero <= 10) {
            suma += numero;  // Agregar el valor de numero a suma
            numero++;        // Incrementar el valor de numero
        }

        // Mostrar el resultado
        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}
