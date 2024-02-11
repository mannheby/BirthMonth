import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        System.out.print("Enter your Birth Month: ");
        birthMonth = in.nextInt();
        if (birthMonth < 0)
            System.out.println("You entered an incorrect month value: " + birthMonth);
        if (birthMonth > 12)
            System.out.println("You entered an incorrect month value: " + birthMonth);
        else
            System.out.println("Your birth month is: " + birthMonth);
    }
}