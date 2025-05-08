import java.util.Scanner;
public class ElseIf
{
    public static void main(String[]args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter Value of x : ");
        int x = Input.nextInt();

        System.out.print("Enter Value of y : ");
        int y = Input.nextInt();

        if (x>y)
        {
            System.out.println("X is Greater than Y");
        }
        else if (y>x)
        {
            System.out.println("Y is Greater than X");
        }
        else if (x==y)
        {
            System.out.println("X is Equal to Y");
        }
    }
}