package capgemini21;
import java.util.Scanner;
public class Atm_interface { 
	 
	    public static void main(String args[] )  
	    { 
	    	String Bank_name="kotak";
	       String account_name="Venkat Neelapala";
	      long Account_no=1235678090;
	      String IFSC_code="ktk1234567";
	        int balance = 100000, withdraw, deposit;  
	          
	   
	        Scanner sc = new Scanner(System.in);  
	        
	        	while(true)
	        	{
	        
	            System.err.println("---------<WELCOME TO OUR ATM MACHINE>------------"); 
	            System.err.println("choose 0 check account details");
	            System.err.println("Choose 1 for Withdraw");  
	            System.err.println("Choose 2 for Deposit");  
	            System.err.println("Choose 3 for Check Balance");  
	            System.err.println("Choose 4 for EXIT");  
	            System.err.print("Choose the operation you want to perform:");  
	              
	     
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	            case 0:
	            {
        System.out.println("BANK NAME::"+Bank_name+"\n"+"ACCOUNT NAME::"+account_name+"\n"+"ACCOUNT_NO::"+Account_no+"\n"+"IFSC_code::"+IFSC_code);          
	      System.out.println("MY ACCOUNT BALANCE::"+balance);    
	            break;
	            }
	                case 1:
	        System.out.print("Enter money to be withdrawn:");  
	                      
	        withdraw = sc.nextInt();  
	                      
	   
	        if(balance >= withdraw)  
	        {  
	                 
	        	System.out.println("Please collect your money");
	            System.out.println("MY ACCOUNT BALANCE::"+balance);     
	            
	        }  
	        else  
	        {  
	       
	            System.out.println("Insufficient Balance");  
	        }  
	        System.out.println("");  
	        break;  
	   
	                case 2:  
	                      
	        System.out.print("Enter money to be deposited:");  
	                      
	  
	        deposit = sc.nextInt();  
	                      
	   
	        balance = balance + deposit;  
	        System.out.println("Your Money has been successfully deposited");  
	        System.out.println("MY ACCOUNT BALANCE::"+balance);     
            
	        break;  
	   
	                case 3:   
	        System.out.println("Balance : "+balance);  
	        System.out.println("");  
	        break;  
	               
	                	
	                case 4:  
	   System.out.println("THANK YOU FOR VISITING");  
	        System.exit(0);  
	            }  
	        }  
	    }   
}