import java.util.Scanner;

public class Evaluacion
{
    public static void main(String[] args)
    {
        try (Scanner orden = new Scanner(System.in)){
            int x;
            int numero;
            
            System.out.print("Que valor de x escoje etre 1,2 y 3: ");
            numero = orden.nextInt();

            if(numero == 1){
                x = 7 + 3 * 6 / 2 - 1;

                System.out.printf("El valor de x es: %d%n", x);
            }

            else if(numero == 2){
                x = 2 % 2 + 2 * 2 - 2 / 2;

                System.out.printf("El valor de x es: %d%n", x);
            }

            else if(numero == 3){
                x = (3 * 9 * (3 + (9 * 3 / (3))));

                System.out.printf("El valor de x es: %d%n", x);
            }

            else{
                System.out.print("Numero no encontrado");
            }
        }
    }   
}
