import java.util.Scanner;

public class Ifelse
{
    public static void main (String []args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter Value of X : ");
        int x = Input.nextInt();

        System.out.println("Enter Value of Y : ");
        int y = Input.nextInt();

        if (x>y)
        {
            System.out.println("X is Greater than Y");
        }
        else
        {
            System.out.println("Y is Greater than X");
        }

    }
}