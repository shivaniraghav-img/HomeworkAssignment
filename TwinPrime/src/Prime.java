// this program is to check and print twin prime number
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   for (int i = 2; i < 100; i++) //for loop to access twin primenumber
		   {

		       if (is_Prime(i) && is_Prime(i + 2)) 
		       {
		                System.out.printf("(%d, %d)\n", i, i + 2);
		                
		            }
		        }
		    }
	
		    public static boolean is_Prime(long n)//boolean method to check number is prime or not
		    {
                   if (n < 2) return false;

	        for (int i = 2; i <= n / 2; i++) 
	        {

	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	}



	


