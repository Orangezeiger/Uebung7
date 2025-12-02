package p2;

import java.util.Arrays;

public class LetterGame {
    public static String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!", word = "";
    public static int[] a;
    public static void main(String[] args) {

        int[] arr = {0,1,2,43};
        setWord(arr);
        System.out.println(word);
        word = "";
        arr = new int[]{6, 7, 23, 7};
        setWord(arr);
        System.out.println(word);
        word = "";
        arr = new int[]{14, 2, 0, 0,19,19};
        setWord(arr);
        System.out.println(word);
        System.out.println();

        findCode("FRAU");
        System.out.println(Arrays.toString(a));
    }

    public static void setWord(int[] a) {
        char[] chars = keyString.toCharArray();
        for (int i = 0; i < a.length; i++) {
            word += chars[a[i]];
        }
    }

    public static void findCode(String word) {
        a = new int[word.length()];
        char[] charsWord = word.toCharArray();
        char[] charsSentence = keyString.toCharArray();
        for (int i = 0; i < charsWord.length; i++) {
            for (int j = 0; j < charsSentence.length; j++) {
                if (charsWord[i] == charsSentence[j]) {
                    a[i] = j;
                    break;
                }
            }
        }
    }
}
