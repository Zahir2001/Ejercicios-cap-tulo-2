public class Instrucciones
{
    public static void main(String[] args)
    {
        int x;
        int y;

        x = 2;
        y = 3;

        System.out.printf("\nx = %d%n", x);

        System.out.printf("\nEl valor de %d + %d es %d%n", x, x, (x + x));

        System.out.printf("\nx =\n");

        System.out.printf("\n%d = %d%n", (x + y), (y + x));
    }    
}
