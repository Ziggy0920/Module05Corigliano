/*
 * Jonas Corigliano - jbcorigliano@dmacc.edu
 * CIS171 Thur Afternoon
 * Date: 10/1/2026
 * Operating System: Windows 11
 * IDE: IntelliJ IDEA
 * Program Description(short): Analyzes the word lengths and determines two grades based off the amount of long
 *                             words and the average number of characters in each word.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used:  (AI, websites, YouTube, peers, etc)
 */

package driver;
import java.util.Scanner;

public class WordLengthAnalyzerCorigliano{
    static void main() {
        final int LONG_WORD_MIN_LENGTH = 5;
        Scanner input = new Scanner(System.in);
        int wordCount = 0;
        boolean validInput = false;
        int totalChars = 0;
        double avgLength;
        String longestWord = "";
        int longWordCount = 0;
        String complexityLevel;
        String vocabRating;

        while(!validInput){
            System.out.print("How many words would you like to enter?: ");
            if(input.hasNextInt()){
                wordCount = input.nextInt();
                if(wordCount > 0){
                    validInput = true;
                    input.nextLine();
                } else{
                    System.out.println("\nPlease enter a positive and non-zero integer.");
                }
            } else{
                input.nextLine();
                System.out.println("\nPlease enter a positive and non-zero integer.");
            }
        }

        String[] words = new String[wordCount];

        for(int i = 0; i < wordCount; i++){
            System.out.print("Enter word " + (i + 1) +": ");
            words[i] = input.nextLine();
            words[i].replaceAll("\\d", "");
            totalChars += words[i].length();
            if(words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
            if(words[i].length() > LONG_WORD_MIN_LENGTH){
                longWordCount++;
            }
        }

        avgLength = getAvgWordLength(words);
        complexityLevel = determineComplexityLevel(avgLength);
        vocabRating = determineVocabularyRating(longWordCount);

        System.out.println("\nRESULTS\n--------------------------------");
        System.out.println("Total characters: " + totalChars);
        System.out.println("Average word length: " + avgLength);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Words longer than " + LONG_WORD_MIN_LENGTH + " characters: " + longWordCount);
        System.out.println("\nWriting Complexity Level: " + complexityLevel);
        System.out.println("Advanced Vocabulary Rating: "  + vocabRating);
    }

    // determineComplexityLevel - returns the complexity level of submitted words' lengths
    // double -> String
    public static String determineComplexityLevel(double avgWordLength){
        if(Double.compare(avgWordLength, 4) < 0){
            return "Simple";
        } else if(Double.compare(avgWordLength, 6) < 0){
            return "Basic";
        }else if(Double.compare(avgWordLength, 8) < 0){
            return "Intermediate";
        }else{
            return "Advanced";
        }
    }

    // determineVocabularyRating - determines the vocab rating based on how many long words were submitted
    // int -> String
    public static String determineVocabularyRating(int longWordAmt){
        if(longWordAmt >= 0 && longWordAmt <= 2){
            return "Limited";
        } else if(longWordAmt >= 3 && longWordAmt <= 5){
            return "Moderate";
        } else if(longWordAmt >= 6 && longWordAmt <= 8){
            return "Strong";
        } else if(longWordAmt > 8){
            return "Extensive";
        }
        return "Rating not found";
    }

    // getAvgWordLength - takes a list of words and calculates the words' average character count
    // String[] -> double
    public static double getAvgWordLength(String[] wordList){
        double avgLength = 0;
        int wordCount = wordList.length;
        for (String word : wordList) {
            avgLength += word.length();
        }
        avgLength /= wordCount;
        return avgLength;
    }
}
