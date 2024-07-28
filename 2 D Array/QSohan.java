import java.util.Scanner;

public class QSohan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int num2 = sc.nextInt();

        int arr[][] = new int[num2][num1];

        for (int i = 0; i < num2; i++) {
            System.out.print("Enter " + num1 + " elements of row" + (i + 1) + " :");
            for (int j = 0; j < num1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = 0;
                sum = sum + arr[i][j];
                System.out.print(sum + " :");
                System.out.print(arr[i][j]);
            }
        }
    }
}
