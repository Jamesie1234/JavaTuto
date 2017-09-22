package com.robino.java8;

import java.util.HashSet;
import java.util.Set;

public class SolutionDWP {
    public int solution(String S, String T) {
        // write your code in Java SE 8


        //for loop that increments by the minute
        int interesting = 0;
        if(uniqueDigits(S) <= 2){
            interesting ++;
        }
        int diff = diffSec(S, T);
        for (int i=0; i<diff; i++){
            String increment = increment(S);
            int uniqueD = uniqueDigits(increment);
            if(uniqueDigits(increment) <= 2){
                interesting++;
            }
            S = increment;
        }

        return interesting;
    }

    public static void main(String[] args){
//        System.out.println("uniqueDigits Answer is: " + new Solution().uniqueDigits("89:15:67"));
//        System.out.println("increment Answer is: " + new Solution().increment("15:15:01"));
        System.out.println("diffSec Answer is: " + new SolutionDWP().diffSec("22:22:21", "22:22:23"));
        System.out.println("Answer is: " + new SolutionDWP().solution("22:22:21", "22:22:23"));
    }

    public int uniqueDigits(String s){
        Set<Character> digits = new HashSet<Character>();

        for (char c: s.toCharArray()){
            digits.add(c);
        }
        return digits.size() - 1;

    }

    public String increment(String s){
        String sec = s.substring(s.lastIndexOf(":") + 1);
        String increment = String.valueOf(Integer.valueOf(sec) + 1);

        if(increment.length() == 1){
            increment = "0" + increment;
        }

        String result = s.substring(0, s.lastIndexOf(":") + 1) + increment;

        return result;
    }

    public int diffSec(String S, String T){

        String secS = S.substring(S.lastIndexOf(":") + 1);
        String secT = T.substring(T.lastIndexOf(":") + 1);

        return Integer.valueOf(secT) - Integer.valueOf(secS);

    }

}
