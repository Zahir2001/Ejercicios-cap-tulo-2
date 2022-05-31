import java.util.Scanner;

public class ComparacionEnteros
{
    public static void main(String[] args)
    {
        try (Scanner comparar = new Scanner(System.in)){
            int numero1;
            int numero2;

            System.out.print("Ingrese el primer numero: ");
            numero1 = comparar.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            numero2 = comparar.nextInt();

            if(numero1 > numero2){
                System.out.printf("El numero %d",numero1);
                System.out.print(" es mas grande");
            }

            if(numero1 < numero2){
                System.out.printf("El numero %d",numero2);
                System.out.print(" es mas grande");
            }

            if(numero1 == numero2){
                System.out.print("Estos numeros son iguales");
            }
        }
    }
}
