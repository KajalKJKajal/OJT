import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                char[] charArray = currentWord.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char originalChar = charArray[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                        charArray[j] = c;
                        String newWord = new String(charArray);
                        if (newWord.equals(endWord)) return level + 1;
                        if (dict.contains(newWord)) {
                            queue.offer(newWord);
                            dict.remove(newWord);
                        }
                    }
                    charArray[j] = originalChar;
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int length = ladderLength(beginWord, endWord, wordList);
        System.out.println("Length of shortest transformation sequence: " + length);
    }
}
