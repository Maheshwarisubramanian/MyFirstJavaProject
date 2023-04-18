package Test;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		int pin = 12345;
		int balance = 45_00_000;
		int Addamount = 0;
		int TakeAmount =0;
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Pin Nmber: ");
		int password = scanner.nextInt();
		
		if(password ==pin)
		{
			System.out.println("Enter Your Name: ");
			name = scanner.nextLine();
			name+= scanner.nextLine();
			System.out.println("Welcome "+ name);
			
			while(true)
			{
				System.out.println("Press 1 to check Your balance");
				System.out.println("Press 2 to Add Amount");
				System.out.println("Press 3 to Take Amount");
				
				System.out.println("Press 4 to Take receipt");
				System.out.println("Press 5 to EXIT");
				
				int opt = scanner.nextInt();
				switch(opt)
				{
					case 1:
						System.out.println("Your Current Balance is "+balance);
						break;
					case 2:
						System.out.println("How much amount did you want to ADD Amount");
						Addamount = scanner.nextInt();
						System.out.println("Your Amount has Added");
						balance = Addamount + balance;
						break;
					case 3:
						System.out.println("How much Amount did you want to take amount");
						TakeAmount = scanner.nextInt();
						if(TakeAmount>balance)
						{
							System.out.println("Your balance is insufficient");
							System.out.println("Take less than your available balance");
						}
						else
						{
							System.out.println("successfully Taken");
							balance = balance - TakeAmount;
						}
						break;
					case 4:
						System.out.println("Welcome to MahiKrish ATM");
						System.out.println("Your Current Balance is "+balance);
						System.out.println("Amount Deposited "+TakeAmount);
						System.out.println("Thanks for Coming");
						break;
						
					default:
						System.out.println("Press the number Below 5");						
				}
				if(opt ==5)
				{
					System.out.println("Thanks for Coming");
					break;
				}
				
			}
			
		}
		else
		{
			System.out.println("Wrong Pin Number");
		}
		
	}
	
}



