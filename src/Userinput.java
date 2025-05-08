import java.util.Scanner;

public class Userinput
{
    public static void main (String []args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Number:");
        int num = Input.nextInt();
        System.out.println("Roll number is:" +num);
    }
}