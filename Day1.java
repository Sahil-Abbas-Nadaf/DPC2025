package DialyProgrammingChallenge;

import java.util.Arrays;

public class Day1 {
    static int k = 0;
    public static void main(String[] args) {
        //InPut:
        int[] arr = {0,1,2,1,0,2,1,0};

        int count0 = count(arr,0); // 3
        int count1 = count(arr,1); // 3
        int count2 = count(arr,2); // 2

        result(arr, count0,0);
        result(arr, count1,1);
        result(arr, count2,2);
        // OutPut:
        System.out.println(Arrays.toString(arr));
    }

    static void result(int[] arr, int count,int element){
        for (int i = 0; i < count; i++) {
            arr[k] = element;
            k++;
        }
    }

     static int count(int[] arr, int target) {
        int count = 0;
        for(int element: arr){
            if(target == element){
                count++;
            }
        }
        return count;
    }
}
