import java.util.Scanner;

public class ForLoop
{
    public static void main(String[]args)

    {
        /*
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter Number:");
    int num = Input.nextInt();

    for(;num<=100;num+=22){
        System.out.println(num);
    }
    */

   Scanner Input = new Scanner(System.in);
   int i = Input.nextInt();
   for(int num=1;num<=i;num++){
       System.out.println(num);
   }
}
}