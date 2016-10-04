
package cecs220_a3_p1;
import java.util.Scanner;




public class AccountMain 
{
    public static void main(String[] args)
    {
        final double fee = 2;
        double thisBalance = 1000;
        double deposit;
        double withdrawal;
        
        Account customer = new Account("Smith",123456,thisBalance);
        
        System.out.println("Your account balance is $1000");
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter your deposit amount: ");
        deposit = scan.nextDouble();
        customer.deposit(deposit);
        
        System.out.println("Enter your withdrawal amount: ");
        withdrawal = scan.nextDouble();       
        customer.withdraw(withdrawal, fee);
        
      
        
        
        
    }
}
