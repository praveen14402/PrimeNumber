import java.util.*;

public class PrimeNumber
{
public static void main(String args[])
{
	int num,flag =0,i=1,ch ;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	num =sc.nextInt();
          
	for(i=1;i<=num;i++)                          
                                                          
	{                                       
		if(num%i==0)
	        	flag=flag+1;
	}
	if(flag==2)
	{
	System.out.println("is Prime Number");
	}
	else{
	System.out.println("not a Prime Number");
	}
      }
}
	

	 

	
	
