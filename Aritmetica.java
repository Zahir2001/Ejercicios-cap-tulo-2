import java.util.Scanner;

public class Aritmetica
{
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero1;
            int numero2;
            int suma;
            int producto;
            int diferencia;
            int cociente;

            System.out.print("Escriba el primer entero: ");
            numero1 = entrada.nextInt();

            System.out.print("Escriba el primer entero: ");
            numero2 = entrada.nextInt();

            suma = numero1 + numero2;
            producto = numero1 * numero2;
            diferencia = numero1 - numero2;
            cociente = numero1 / numero2;

            System.out.printf("\nLa suma es %d%n", suma);
            System.out.printf("\nEl producto es %d%n", producto);
            System.out.printf("\nLa diferencia es %d%n", diferencia);
            System.out.printf("\nEl cociente es %d%n", cociente);
        }
    }    
}
