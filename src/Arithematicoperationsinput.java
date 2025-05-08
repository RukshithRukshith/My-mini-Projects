import java.util.Scanner;

public class Arithematicoperationsinput
{
    public static void main (String[]args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = Input.nextInt();

        System.out.print("Eter Value of B : ");

        int b = Input.nextInt();

        System.out.println("Addition of A & B is : "+(a+b));
        System.out.println("Subtraction of A & B is : "+(a-b));
        System.out.println("Multiplication of A & B is : "+(a*b));
        System.out.println("Division of A & B is : "+(a/b));
    }
}