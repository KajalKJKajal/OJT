import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String start, String end, List<String> dict) {
        List<List<String>> result = new ArrayList<>();
        Set<String> dictSet = new HashSet<>(dict);
        dictSet.add(end);
        Queue<List<String>> queue = new LinkedList<>();
        queue.add(Arrays.asList(start));
        Set<String> visited = new HashSet<>();
        visited.add(start);
        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            Set<String> currentLevelVisited = new HashSet<>();
            for (int i = 0; i < size; i++) {
                List<String> path = queue.poll();
                String lastWord = path.get(path.size() - 1);
                if (lastWord.equals(end)) {
                    result.add(new ArrayList<>(path));
                    found = true;
                } else {
                    for (int j = 0; j < lastWord.length(); j++) {
                        char[] chars = lastWord.toCharArray();
                        for (char c = 'a'; c <= 'z'; c++) {
                            chars[j] = c;
                            String nextWord = new String(chars);
                            if (dictSet.contains(nextWord) && !visited.contains(nextWord)) {
                                List<String> newPath = new ArrayList<>(path);
                                newPath.add(nextWord);
                                queue.add(newPath);
                                currentLevelVisited.add(nextWord);
                            }
                        }
                    }
                }
            }
            visited.addAll(currentLevelVisited);
        }

        return result;
    }

    public static void main(String[] args) {
        WordLadderII solver = new WordLadderII();
        String start = "hit";
        String end = "cog";
        List<String> dict = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> result = solver.findLadders(start, end, dict);
        for (List<String> ladder : result) {
            System.out.println(ladder);
        }
    }
}
