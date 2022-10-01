import java.util.Scanner;
public class org{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the symbol to print : ");
		String s=obj.nextLine();
		System.out.print("enter the no of rows : ");
		int n=obj.nextInt();
		int i=0;
		for(;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
		for(int k=i-2;k>=0;k--){
			for(int j=0;j<=k;j++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
