//Author   : Deepansh Dubey.
//Date     : 17/10/2020.
//Purpose  : Printing prime factors of entered number.


import java.io.*;
class prime_factor
{	
	public static void main(String args[])throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num, i;
		String cont, factor = "";

		while(true)
		{    
			System.out.println("\nInput a number or 0 to exit : ");
			num = Long.parseLong(br.readLine());
			
			if(num == 1)
			{
				System.out.println("1 = 1");
				continue;
			}
			else if(num == 0)
			{
				break;
			}
			
			// Factors of numbers greater than 1
			System.out.print(num + " = ");
			factor = "";
			
			for(i = 2; i <= num; i++)
			{
				while(num % i == 0)
				{
					factor += " x " + Long.toString(i);
					num = num / i;
				}
			}
			
			System.out.println(factor.substring(3));
		}
	}
}
