import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class OptionMenu extends Accounts{
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'Rs'###,##0.00");
    HashMap<Integer,Integer> data =new HashMap<>();

    public void getLogin() throws IOException
    {
        int x=1;
        do {
            try {
                data.put(378500121, 1234);
                data.put(378500122, 1235);
                data.put(378500123, 1236);
                System.out.println("Welcome To SBI ATM");
                System.out.print("Enter your Customer Number :");
                 setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your Pin Number");
                 setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character.Only Numbers" + "\n");
                x=2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
                    getAccountType();
            }
            System.out.println("\n" + " Wrong Customer Number or Pin Number."+" \n");
        }while(x==1);
    }
    public void getAccountType()
    {
        System.out.println("Select the Account you want to Access");
        System.out.println("Type 1 :Current Account");
        System.out.println("Type 2 :Saving Account");
        System.out.println("Type 3 : Exit");
        System.out.print("Choice :");
        int selection =menuInput.nextInt();

        switch(selection)
    {
        case 1:
        getCurrent();
        break;
        case 2:
        getSaving();
        break;
        case 3:
        System.out.println("Thank You for using this ATM,Bye.");
        break;
        default:
            System.out.println("\n" + "Invalid Choice." + "\n");
            getAccountType();
    }
    }
    public void getCurrent()
    {
        System.out.println("Current Account");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 1 : Withdraw Funds");
        System.out.println("Type 1 : Deposits Funds");
        System.out.println("Type 1 : Exit");
        System.out.println("Choice");
        int selection =menuInput.nextInt();

        switch(selection)
        {
                case 1:
                System.out.println("Current Account Balance : "+ moneyFormat.format(getCurrentBalance())+ "\n");
                getAccountType();
                break;
                case 2:
                    getCurrentWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thnak You for Visiting this ATM,Bye.");
                break;
            default:
                System.out.println("\n"+ "Invalid Choice"+ "\n");
                getCurrent();

        }
    }
    public void getSaving()
    {
        System.out.println("Saving Account");
        System.out.println("Type 1 : View Balance");
        System.out.println("Type 2 : Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
        System.out.println("Choice : ");

        int selection=menuInput.nextInt();
        switch (selection)
        {
            case 1:
                System.out.println("Current Account Balance : "+ moneyFormat.format(getSavingBalance())+ "\n");
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thnak You for Visiting this ATM,Bye.");
                break;
            default:
                System.out.println("\n"+ "Invalid Choice"+ "\n");
                getSaving();

        }
    }


}
