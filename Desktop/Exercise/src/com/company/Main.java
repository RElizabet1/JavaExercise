package com.company;
public class Main {
    public static int RepetitionChar(String word) {
        int flagRepetitionTrue = 0;
        int flagRepetitionInSeriesTrue = 0;
        int flagRepetitionInSeriesFalse = 0;
        int finalFlag = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if ((word.charAt(i) == word.charAt(j) && (i != j))) {
                    if (((j + 1) <= word.length()) && ((i + 1) <= word.length()) && (j == (i + 1) || i == (j + 1)))
                        flagRepetitionTrue = 1;
                     else flagRepetitionInSeriesTrue = 1;
                    if (word.charAt(j) != word.charAt(j - 1))
                        flagRepetitionInSeriesFalse = 1;
                }
            }
            if (flagRepetitionInSeriesTrue == 1 && flagRepetitionInSeriesFalse == 1) {
                return finalFlag = 0;
            }
            return finalFlag = 1;
        }
        return finalFlag;
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        String oneWord = words[0];
        String twoWord = words[1];
        if (oneWord.length() == twoWord.length()) {
            if (RepetitionChar(oneWord) == 0 || RepetitionChar(twoWord) == 0)
                System.out.println("0");
             else System.out.println("1");
        } else
            System.out.println("0");
    }
}