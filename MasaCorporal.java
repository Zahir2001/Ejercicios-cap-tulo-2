import java.util.Scanner;

public class MasaCorporal
{
    public static void main(String[] args)
    {
        Scanner mc = new Scanner(System.in);

        float kg, mts, imc, x;

        System.out.print("Ingrese su peso(kg): ");
        kg = mc.nextFloat();

        System.out.print("Ingrese su altura(mts): ");
        mts = mc.nextFloat();

        imc = mts * mts;
        x = kg / imc;

        System.out.println("Su indice de masa corporal es: " + x);

        if(x<=18.5){
            System.out.println("Bajo peso");
        }
        
        else if(x>=18.5 && x<=24.9){
            System.out.println("Peso normal");
        }

        else if(x>=25 && x<=29.9){
            System.out.println("Sobrepeso");
        }

        else if(x>=30){
            System.out.println("Obeso");
        }

    }    
}
