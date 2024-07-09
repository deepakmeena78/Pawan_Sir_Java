class TwoSortedArray2 {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 1, 4, 5 };
        int brr[] = { 1, 2, 3, 6 };
        int temp[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < brr.length; i++) {
            for (int j = i + 1; j < brr.length; j++) {
                if (brr[i] == brr[j]) {
                    brr[j] = -1;
                }
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != -1) {
                temp[j] = brr[i];
                j++;
            }
        }

        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(temp[i]);
        }
    }
}