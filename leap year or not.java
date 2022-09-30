import java.util.*;

public class leap{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		try{	
			System.out.println("Enter the year to be checked :");
			int year=s.nextInt();
			if(year>=1000)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("Leap Year.....");
					}
					else{
						System.out.println("Non Leap year....");
					}
				}
				else if(year%4==0){
					System.out.println("Leap Year....");
				}
				else{
					System.out.println("Non leap Year....");
				}

			for(int i=year+1;i>0;i++)
			{
				if(i%100==0)
				{
					if(i%400==0)
					{
						System.out.println("Next Leap Year.....:"+i);
						break;
					}
				}
				else if(i%4==0){
					System.out.println("Next Leap Year....:"+i);
					break;
				}
				else continue;
			}
			for(int i=year+1;i>0;i--)
			{
				if(i%100==0)
				{
					if(i%400==0)
					{
						System.out.println("Previous Leap Year.....:"+i);
						break;
					}
				}
				else if(i%4==0){
					System.out.println("Previous Leap Year....:"+i);
					break;
				}
				else continue;
			}
			}
			else{
				System.out.println("....Invalid Year.....");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input...");
		}
	}
}
