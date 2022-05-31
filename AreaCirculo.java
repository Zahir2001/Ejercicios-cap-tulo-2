import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        try (Scanner circulo = new Scanner(System.in)) {
            int radio, diametro;
            float circunferencia, area;

            System.out.print("Ingrese el valor de radio: ");
            radio = circulo.nextInt();

            System.out.printf("%nEl diámetro es = %d%n", radio * 2);
            System.out.printf("La circunferencia es = %.3f%n", 2 * (Math.PI) * radio);
            System.out.printf("El área es = %.3f%n", (Math.PI) * radio * radio);
        }
    }
}
