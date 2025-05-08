import java.util.Scanner;
public class NestedIforSwitchCase
{
    public static void main (String[]args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.println("Available Fruits are :(1) Apple , (2) Banana , (3) Grapes , (4) Mango");

        System.out.print("Enter the Fruit Choice Number : ");
        int fruit = Input.nextInt();

        switch(fruit)
        {
            case 1:
                System.out.println("APPLE");
                System.out.println("A Red Color Fruit.");
                System.out.println("50rs/per kg");
                System.out.println("Good For Health");
                break;
            case 2:
                System.out.println("BANANA");
                System.out.println("A Yellow Color Fruit.");
                System.out.println("60rs/per kg");
                System.out.println("Good For Skin");
                break;

            case 3:
                System.out.println("GRAPES");
                System.out.println("A Green Color Fruit.");
                System.out.println("70rs/per kg");
                System.out.println("Good For Blood");
                break;

            case 4:
                System.out.println("MANGO");
                System.out.println("A Pale Green Color Fruit.");
                System.out.println("80rs/per kg");
                System.out.println("Good For Digestion");
                break;

            default:System.out.println("Enter the Valid Fruit Name !!!");
        }
        System.out.println();
        System.out.println("Available Vegetables are :(5) Tomato , (6) Potato , (7) Coconut , (8) Pumpkin");

        System.out.print("Enter The Vegetable Choice Number : ");
        int vegetable = Input.nextInt();

        switch(vegetable)
        {
            case 5:
                System.out.println("TOMATO");
                System.out.println("A Pale Red Color Vegetable.");
                System.out.println("20rs/per kg");
                System.out.println("Good For Kidney");
                break;

            case 6:
                System.out.println("POTATO");
                System.out.println("A Brown Color Vegetable.");
                System.out.println("30rs/per kg");
                System.out.println("Good For Stomach");
                break;

            case 7:
                System.out.println("COCONUT");
                System.out.println("A Reddish Color Vegetable.");
                System.out.println("40rs/per piece");
                System.out.println("Good For Chest");
                break;

            case 8:
                System.out.println("PUMPKIN");
                System.out.println("A Yellowish Color Vegetable.");
                System.out.println("50rs/per kg");
                System.out.println("Good For Body Cooling");
                break;

            default:System.out.println("Enter the Valid Vegetable Name !!!");

        }
    }
}