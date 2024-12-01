package leetcode.easy;

/*
you are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.
 */
public class Leetcode3110 {
        public int scoreOfString(String s) {
            int score = 0;
            int n = s.length();
            for(int i=0;i<n-1;i++){
                score += Math.abs(s.charAt(i) - s.charAt(i+1));
            }
            return score;
        }
}
/*
 * This program is used to find the absolute difference between adjacent character
 * example-: "hello"
 * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 */