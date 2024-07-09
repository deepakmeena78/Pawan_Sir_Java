import java.util.Scanner;

public class Greater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter Number");
            num[i] = sc.nextInt();
        }

        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.print(max);
    }
}
