public class Array {
    public static void main(String[] args) {

        int temp1 = 0, temp2 = 0, sum = 0;
        int arr[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp1 = arr[j];
                    if (arr[i] < arr[j] && temp1 < arr[j]) {
                        temp2 = arr[j];
                    }
                }
            }
        }
        System.out.println("M : " + temp1);
        System.out.println("S : " + temp2);
        System.out.println(temp1 + temp2);
    }
}
