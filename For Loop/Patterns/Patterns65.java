
/*              *
               ***
              *****
             ******* 
            *********
 */
import java.util.Scanner;

public class Patterns65 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - 1 + i; j++) {
                if (j >= num + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
