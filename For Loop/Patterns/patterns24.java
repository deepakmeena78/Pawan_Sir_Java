/*
		*
		* *
		* @ *
		* @ @ *
		* * * * *
*/
import java.util.Scanner;
class patterns24{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				if(j == 1 || i == num || i == j)
					System.out.print(" *");
				
				else
					System.out.print(" @");
			}
		System.out.println();
		}
	}
}
