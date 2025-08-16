package DialyProgrammingChallenge;

public class Day2 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] arr = {1,2,4,5};
//        int[] arr = {2,3,4,5};
        int[] arr = {1};
        int ans = missingElement(arr);
        System.out.println(ans);
    }

    static int missingElement(int[] arr){
        int sum = 0;
        int n = arr.length+1;
        for(int element: arr){
            sum += element;
        }
        int expectedSum = n * (n+1) / 2;
        return (expectedSum - sum);
    }
}
