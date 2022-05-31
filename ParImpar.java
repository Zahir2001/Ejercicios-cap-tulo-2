import java.util.Scanner;

public class ParImpar
{
    public static void main(String[] args)
    {
        try (Scanner determinar = new Scanner(System.in)) {
            int numero;

            System.out.print("Ingrese el número a evaluar: ");
            numero = determinar.nextInt();

            if(numero % 2 ==0){
                System.out.println(numero+" es un número par.");
            }
            else{
                System.out.println(numero+" es un número impar.");
            }
        }
    }    
}
