import java.util.Scanner;
class Main { 
    static void fizzbuzz(int n){
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5==0){
                System.out.println("Fizzbuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(Integer.toString(i));
            }
        }
    }
  
    public static void main(String args[]) 
    { 
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fizzbuzz(n);
    } 
}
