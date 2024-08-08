import java.util.Scanner;

public class SortedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size ");
        int s = sc.nextInt();
        String arr[] = new String[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int temp = 0;
        int s1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                char ch = arr[i].charAt(j);
                char ch1 = arr[i].charAt(j + 1);
                System.out.print(ch);
            }
        }
    }
}
