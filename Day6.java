package DialyProgrammingChallenge;

import java.util.ArrayList;
import java.util.List;

public class Day6 {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,3,-1,2};
        List<int[]> subarrays = findSubarrays(arr);

        for(int[] pair: subarrays){
            System.out.println("(" + pair[0] + ", "+ pair[1]+")");
        }
    }

    static List<int[]> findSubarrays(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        List<int[]> result = new ArrayList<>();

        prefix[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if(prefix[i] == 0) result.add(new int[]{0,i});

            for(int j = 0; j < i; j++){
                if(prefix[i] == prefix[j])
                    result.add(new int[]{j+1, i});
            }
        }
        return result;
    }
}
