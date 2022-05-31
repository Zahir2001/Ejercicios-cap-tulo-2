import java.util.Scanner;

public class SeparacionDigitos
{
    public static void main(String[] args)
    {
        Scanner separar = new Scanner(System.in);

        int numero, digito1, digito2, digito3, digito4, digito5;

        System.out.print("Ingrese número de 5 digitos: ");
        numero = separar.nextInt();

        digito1 = numero / 10000;
        numero = numero % 10000;

        digito2 = numero / 1000;
        numero = numero % 1000;

        digito3 = numero / 100;
        numero = numero % 100;

        digito4 = numero / 10;
        numero = numero % 10;

        digito5 = numero;

        System.out.printf("El número: %s%n %d %d %d %d %d", ("" + digito1 + digito2 + digito3 + digito4 + digito5), digito1, digito2, digito3, digito4, digito5);
    }    
}
