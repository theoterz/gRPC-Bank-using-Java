import java.util.Scanner;

public class Protocol {

    Scanner usr = new Scanner(System.in);

    public int getInput()
    {
        int input =  usr.nextInt();
        while( !(input>0 && input<5) )
        {
            System.out.println("Choose Action(1-4)");
            input = usr.nextInt();
        }

        return input;
    }

    public void printMenu()
    {
        System.out.println("Choose Action(1-4)");
        System.out.println("\n=======================");
        System.out.println("1.Withdrawal");
        System.out.println("2.Deposit");
        System.out.println("3.Show Balance");
        System.out.println("4.Close");
        System.out.println("=======================\n");
    }
    
}
