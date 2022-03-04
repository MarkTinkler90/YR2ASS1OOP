package cashMachine;
import java.util.Scanner;
public class cashMachine {
    
    private static int pin = 1324;
    private static int balance = 2400;
    public static void main(String[] args) {
        Scanner trypin = new Scanner(System.in);
        int pintry;
        int attempts = 0;
        
        System.out.println("Insert PIN: ");
        pintry = trypin.nextInt();
        
        while (pintry != pin)
        {
            attempts++;
            if (attempts == 3)
            {
                System.exit(0);
            }
            System.out.println("Incorrect PIN");
            System.out.println("Insert PIN(Attempts remaining: "+(3-attempts)+"): ");
            pintry = trypin.nextInt();
            if (attempts == 3)
            {
                System.exit(0);
            }
        }
        task(0);
        
    }
    public static void task(int action){
        Scanner act = new Scanner(System.in);
        Scanner amount = new Scanner(System.in);
        int cash;
        
        System.out.println("Please select:\n1. Display balance\n2. Withdraw cash\n3. Deposit cash\n4. Exit\nAction: ");
        action = act.nextInt();
        
        switch (action){
            case 1 -> {
                System.out.println("Current balance: "+balance);
                task(0);
            }
            case 2 -> {
                System.out.println("Amount to withdraw: ");
                cash = amount.nextInt();
                if (cash>balance)
                {
                    System.out.println("Insufficient Funds");
                    task(0);
                }
                do{
                    if (cash < 0)
                    {
                        System.out.println("Select positive amount");
                        System.out.println("Amount to withdraw: ");
                        cash = amount.nextInt();
                    }
                }while (cash < 0);
                balance -= cash;
                task(0);
            }
            case 3 -> {
                System.out.println("Amount to deposit: ");
                cash = amount.nextInt();
                do{
                    if (cash < 0)
                    {
                        System.out.println("Select positive amount");
                        System.out.println("Amount to withdraw: ");
                        cash = amount.nextInt();
                    }
                }while (cash < 0);
                balance += cash;
                task(0);
            }
            case 4 -> System.exit(0);
            default -> {
                    System.out.println("Invalid Value");
                    task(0);
            }
        }
    }
}