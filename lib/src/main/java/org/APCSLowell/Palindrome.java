package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String sWord) {
        String s = sWord.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return (reverse(s).equals(s));
    }
    public String reverse(String sWord) {
        String s = "";
        for (int i = sWord.length() - 1; i >= 0; i--) {
            s += sWord.charAt(i);
        }
        return s;
    }
}
