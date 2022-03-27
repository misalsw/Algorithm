package com.algorithm;


public class PermutationOfString {

    private static void swap(char[] ch, int i, int j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
    }

    private static void permutations(char[] ch, int currenIndex) {
        if (currenIndex == ch.length - 1){
            System.out.println(String.valueOf(ch));
        }

        for (int i = currenIndex; i < ch.length; i++) {
            swap(ch, currenIndex, i);
            permutations(ch, currenIndex + 1);
            swap(ch, currenIndex, i);
        }
    }

    public static void main(String[] args) {
        String str = "Swapnil";
        permutations(str.toCharArray(), 0);
    }

}
