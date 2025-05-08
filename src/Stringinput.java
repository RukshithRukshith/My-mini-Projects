import java.util.Scanner;

public class Stringinput
{
    public static void main(String[]args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = Input.nextLine();

        System.out.print("Enter Roll no : ");
        String num = Input.nextLine();


        System.out.print("Enter Class : ");
        String dept = Input.nextLine();

        System.out.print("Enter Grade : ");
        String grade = Input.nextLine();

        System.out.println("Your Name is : "+name);
        System.out.println("Your Roll Number is : "+num);
        System.out.println("Your Class is : "+dept);
        System.out.println("Your Grade is : "+grade);
    }
}
