import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;

public class Splitting {
    public static void main(String[] args) {
        String text = "My name is arfa." + " i am a student of BSE." + " i am Present in oop lab.";
        ArrayList<String> sentences = new ArrayList<>();
        sentences.addAll(List.of(text.split(" ")));
        for (String a : sentences)
            System.out.println(a);
        System.out.println("total words:");
        System.out.println(sentences.size());

        Set<String> set1 = new HashSet<>();
        set1.addAll(sentences);
        System.out.println("unique words");
        System.out.println(set1.size());

        ArrayList<String> lines =new ArrayList<>();
        lines.addAll(List.of(text.split("\\.")));
        System.out.println("total sentences:");
        System.out.println(lines.size());

        char words[]=text.toCharArray();
        System.out.println("total characters:");
        System.out.println(words.length);

        char charArray[]=text.toCharArray();
        HashSet<Character> unique=new HashSet<>();
        for (Character c: charArray)
            unique.add(c);
        System.out.println("unique characters:");
        System.out.println(unique.size());





    }
}
