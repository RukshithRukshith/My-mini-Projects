import java.util.Scanner;
public class GreatestOfThreeNumbers
{
    public static void main(String[]args)
    {
        Scanner Input = new Scanner(System.in);
            System.out.print("Enter Value of a: ");
        int a = Input.nextInt();
            System.out.print("Enter Value of b: ");
        int b = Input.nextInt();
            System.out.print("Enter Value of c: ");
        int c = Input.nextInt();


        int max = a;
            if(b>max){
                max = b;
            }
            if(c>max){
                max = c;
            }
            System.out.println("The Greatest Value is:" +max);
    }
}
