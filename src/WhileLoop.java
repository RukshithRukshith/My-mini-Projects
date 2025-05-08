import java.util.Scanner;
public class WhileLoop
{
    public static void main(String[]args)
    {
        Scanner Input = new Scanner(System.in);
        int i = Input.nextInt();

        int num =1;
        while(num<=i){
            System.out.println(num);
            num++;
        }

    }
}