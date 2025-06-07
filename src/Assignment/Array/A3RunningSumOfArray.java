package Assignment.Array;

public class A3RunningSumOfArray {

    static int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] newArray = new int[n];

        if (n > 0) {
            newArray[0] = arr[0];
            for (int i = 1; i < n; i++) {
                newArray[i] = newArray[i - 1] + arr[i];
            }
        }

        /*
        int[] newArray = new int[n + 1];
        newArray[0] = 0;
        for (int i = 0; i < n; i++) {
            newArray[i + 1] = newArray[i] + arr[i];
        }
         */

        return newArray;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = runningSum(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

