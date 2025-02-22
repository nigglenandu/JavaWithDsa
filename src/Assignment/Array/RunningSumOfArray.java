package Assignment.Array;

public class RunningSumOfArray {

    static int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] newArray = new int[n];

        if (n > 0) {
            newArray[0] = arr[0];
            for (int i = 1; i < n; i++) {
                newArray[i] = newArray[i - 1] + arr[i];
            }
        }
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
