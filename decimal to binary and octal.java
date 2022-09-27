import java.util.*;
public class Main 
{
    public static void main(String[]args)
    {   Scanner sc= new Scanner(System.in);     
        System.out.print("\nEnter the decimal number=");  
         int a= sc.nextInt();
        System.out.println("\ndecimal to binary=");
        System.out.println(Integer.toBinaryString(a));
        System.out.println("\ndecimal to octal=");
        System.out.println(Integer.toOctalString(a));  
    }
}
