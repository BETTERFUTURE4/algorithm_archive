import java.util.HashMap;

public class WordDictionary {
    private static HashMap<String,String> dictionary = new HashMap<>();

    public static void addWord(String englishWord, String koreanWord) {
        dictionary.put(englishWord.toLowerCase(),koreanWord);
    }

    public static String find(String englishWord) {
        return dictionary.get(englishWord.toLowerCase());
    }
}
