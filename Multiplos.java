import java.util.Scanner;

public class Multiplos
{
    public static void main(String[] args)
    {
        try (Scanner multi = new Scanner(System.in)) {
            int numero1;
            int numero2;

            System.out.print("Ingrese el primer número: ");
            numero1 = multi.nextInt();

            System.out.print("Ingrese el segundo número: ");
            numero2 = multi.nextInt();

            if (numero1 % numero2 ==0){
                System.out.println("El número: " + numero1 + ", es multiplo de: " + numero2);
            }
            else{
                System.out.println("El número: " + numero1 + ", no es multiplo de: " + numero2);
            }
        }
    }    
}
