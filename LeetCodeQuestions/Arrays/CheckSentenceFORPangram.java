package LeetCodeQuestions.Arrays;

public class CheckSentenceFORPangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        String sentence1 ="stephen";
       boolean ans = check(sentence);
        System.out.println(ans);
    }
    public static boolean check(String sentence){
        boolean[] seen = new boolean[26];

        // Iterate through each character in the sentence
        for (char ch : sentence.toCharArray()) {
            // If the character is a lowercase letter, mark it as seen
            if (Character.isLowerCase(ch)) {
                int index = ch - 'a'; // Determine the index in the seen array
                seen[index] = true;   // Mark the letter as seen
            }
        }

        // Check if all letters have been seen at least once
        for (boolean isSeen : seen) {
            if (!isSeen) {
                // If any letter has not been seen, return false
                return false;
            }
        }

        // If all letters have been seen, return true
        return true;
    }
}
