import java.util.Scanner;

public class systematic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int p = sc.nextInt();
        int arr[] = new int[p];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}