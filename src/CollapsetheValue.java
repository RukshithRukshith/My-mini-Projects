import java.util.Scanner;

public class CollapsetheValue
{
    public static void main (String[]args)
    {
       Scanner Input = new Scanner(System.in);
       System.out.println("Enter Value of X : ");
       int x = Input.nextInt();

       System.out.println("Enter Value of Y : ");
       int y = Input.nextInt();

       int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
    }
}