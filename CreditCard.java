
import java.util.*;

public class CreditCard {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking card holder name
		System.out.println("Enter Card Holder Name");
		String name = sc.nextLine();
		
		//Taking card no making sure it does not exceed 16 digits
		System.out.println("Eneter the Card no please");
		String card_num = sc.nextLine();
		
		//Taking Cvv and making sure it does not exceed 3 digits
		System.out.println("Enter the cvv");
		int cvv[] = new int[4];
		for(int i = 0;i<10;i++)
		{
			cvv[i] = sc.nextInt();
		}
		
		CreditCardValidation(card_num);
		
		
		
	}
	
	private static void CreditCardValidation(String cardnum) {
		
		
		//checking for valid characters
		if(validChar(cardnum)) 
		{
		
			//checking the length of the number
			if(CardLengthVal(cardnum)) 
			{
		
				//converting the number into int
				int intcardnum[] = new int[cardnum.length()];
		
				for(int i =0; i<cardnum.length(); i++ )
				{
					intcardnum[i] = Integer.parseInt(cardnum.substring(i,i+1));
			
				}
		
		
				//Multiplying the even no digits by 2
				for(int i = 14; i>=0; i=i-2) 
				{
					int tempVal = intcardnum[i];
					tempVal = tempVal*2;
			
			
					//if the product is greater than 9 the we split the digts and them
					if(tempVal>9)
					{
						tempVal = tempVal % 10 +1;
					}
			
					intcardnum[i] = tempVal;
				}
		
				//Adding up the numbers
				int total = 0;
				for(int i =0; i<16;i++)
				{
					total = total + intcardnum[i];
			
				}
				//3333333333333333333333333333333333333333333333333
				System.out.println(total);
				//###########################################
		
				if(total %10 ==0)
				{
					System.out.println("Valid Card");
				}
		
				else
				{
					System.out.println("Invalid Card");
				}
			}
		
			else {
				System.out.println("Invalid length");
			}
		
		}
		else {
			System.out.println("Invalid characters");
		}
		
		
	}
	
	
	public static boolean CardLengthVal(String cardnum)
	
	{
		if(cardnum.length()==16) {
		return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean validChar(String cardnum) {
		
		int count =0;
		
		for(int i = 0; i<cardnum.length();i++) 
		{
			if(cardnum.charAt(i)!='1' && cardnum.charAt(i)!='2' && cardnum.charAt(i)!='3' && cardnum.charAt(i)!='4' && cardnum.charAt(i)!='5' 
					&& cardnum.charAt(i)!='6' && cardnum.charAt(i)!='7' && cardnum.charAt(i)!='8' && cardnum.charAt(i)!='9' && cardnum.charAt(i)!='0')
			{
				count++;
			}
		}
		
		if(count>0) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	
	
}
