/*
		a
		bc
		d f
		g  j
		klmno
*/
import java.util.Scanner;
class patterns23{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			char ch = 97;
			for(int j = 1;j <= num;j++)
			{
				if(j == 1 || i == 5 || i == j)
					System.out.print(ch);
				else 
					System.out.print(" ");
				ch++;
			}
		System.out.println();
		}
	}
}
