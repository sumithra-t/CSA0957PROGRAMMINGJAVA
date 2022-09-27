import java.util.*;
public class Main {
 public Static Void main(Stringargs[]){
 Scanner Input = new Scanner(System.in);
 System.out.println("Enter the String:");
 String Value = input.next();
 try{
 int num = Integer.parseInt(value);
 int rev = 0,rem,num2=num;
 while(num!=0){
 rem = num%10;
 rev = rev*10+rem;
 num = num/10;
 }
 if(num2==rev)
 System.out.println("the number is palindrome");
 else
 System.out.println("the number is not palindrome");
 }
 catch(Exception e){
 StringBuffer s1 = new StringBuffer(value);
 s1.reverse();
 string s2 = s1.toString();
 if(value.equals(s2))
 System.out.println("the Strings are palindrome");
 else
 System.out.println("the Strings are not palindrome");
 }
 }
}
