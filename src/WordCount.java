import java.util.HashSet;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        String text = "My name is arfa." + " i am a student of BSE." + " i am currently in oop lab.";

        String[] words = text.split("\\s+");

        Set<String> uniqueWord = new HashSet<>();
        for (String word : words) {
            uniqueWord.add(word);
        }


        int[] frequencies = new int[uniqueWord.size()];
        String[] uniqueWordArray = uniqueWord.toArray(new String[0]);
        for (int i = 0; i < uniqueWordArray.length; i++) {
            for (String word : words) {
                if (uniqueWordArray[i].equals(word)) {
                    frequencies[i]++;
                }
            }
        }
        System.out.println("Word frequencies:");
        for (int i = 0; i < uniqueWordArray.length; i++) {
            System.out.println(uniqueWordArray[i] + ": " + frequencies[i]);
        }
    }
}