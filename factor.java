//Author   : Deepansh Dubey.
//Date       : 17/10/2020.
//Purpose: Printing factors of entered number.


import java.io.*;
class factor
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long a,b,c,i;
System.out.println("Input a number");
a=Long.parseLong(br.readLine());
System.out.println("\nOUTPUT:");
for(i=2;i<=a;i++)
{
for(a=a;a%i==0;a=a/i)
{
System.out.println(i);
}
}
}
}