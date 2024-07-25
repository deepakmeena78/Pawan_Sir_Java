import java.util.Scanner;;

public class Pattern94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= 1; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
