package DialyProgrammingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11 {
    public static void main(String[] args) {
        System.out.println(permuteUnique("abc"));
        System.out.println(permuteUnique("aab"));
        System.out.println(permuteUnique("aaa"));
        System.out.println(permuteUnique("a"));
        System.out.println(permuteUnique("abcd"));
    }
    public static List<String> permuteUnique(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtrack(result, new StringBuilder(), chars, new boolean[chars.length]);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder temp, char[] chars, boolean[] used) {
        if (temp.length() == chars.length) {
            result.add(temp.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            temp.append(chars[i]);
            backtrack(result, temp, chars, used);
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
    }
}
