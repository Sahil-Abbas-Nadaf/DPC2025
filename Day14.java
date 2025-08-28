package DialyProgrammingChallenge;

public class Day14 {
    public static void main(String[] args) {
        System.out.println(countSubstrings("pqpqs", 2));
        System.out.println(countSubstrings("aabacbebebe", 3));
        System.out.println(countSubstrings("a", 1));
        System.out.println(countSubstrings("abc", 3));
        System.out.println(countSubstrings("abc", 2));
    }

    public static int countSubstrings(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    private static int atMostK(String s, int k) {
        if (k <= 0) return 0;
        int[] freq = new int[26];
        int left = 0, distinct = 0, res = 0;
        for (int right = 0; right < s.length(); right++) {
            int r = s.charAt(right) - 'a';
            if (freq[r] == 0) distinct++;
            freq[r]++;
            while (distinct > k) {
                int l = s.charAt(left) - 'a';
                freq[l]--;
                if (freq[l] == 0) distinct--;
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }
}
