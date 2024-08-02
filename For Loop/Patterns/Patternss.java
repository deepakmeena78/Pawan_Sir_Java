import java.util.Scanner;
public class Patternss{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		
		for(int i = 1;i <= 7;i++){
			for(int j = 1;j <= 7;j++){
				if(j + i == 5 || j + i == 11){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}