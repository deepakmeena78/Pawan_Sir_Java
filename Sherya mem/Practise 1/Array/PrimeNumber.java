import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];// User Size in Array

        for (int i = 0; i < size; i++) {// Declartion Array
            arr[i] = sc.nextInt();
        }

    }
    