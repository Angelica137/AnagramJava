import java.util.ArrayList;
import java.util.List;

public class Anagram {
	public List<String> isAnagram(String word, ArrayList<String> words) {
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			int count = 0;
			for (int j = 0; j < words.get(i).length(); j++) {
				for (int k = 0; k < word.length(); k++) {
					if (words.get(i).charAt(j) == word.charAt(k)) {
						count++;
					}
				}
			}
			if (count == words.get(i).length()) {
				answer.add(words.get(i));
			}
		}
		System.out.println(answer);
		return answer;
	}
}
