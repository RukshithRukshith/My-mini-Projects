import java.util.Scanner;
public class DoWhileLoop
{
    public static void main(String[]args)
    {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();

        int i =1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
