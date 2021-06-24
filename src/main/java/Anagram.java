import java.util.ArrayList;
import java.util.List;

public class Anagram {
	public List<String> isAnagram(String word, ArrayList<String> words) {
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			boolean isFound = words.get(i).indexOf(word) != 1 ? true : false;
			if (isFound) {
				System.out.println("true");
				answer.add(words.get(i));
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Anagram a = new Anagram();
		ArrayList<String> singleStr = new ArrayList<String>();
		singleStr.add("lit");
		a.isAnagram("list", singleStr);
	}
}
