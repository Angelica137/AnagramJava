import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	public List<String> isAnagram(String str, ArrayList<String> wordList) {
		ArrayList<String> answer = new ArrayList<String>();
		// for each word in the list
		for (int i = 0; i < wordList.size(); i++) {
			// if the word is the same length as the word to compare
			if (wordList.get(i).length() == str.length()) {
				// see if the characters match
				char[] sortWord = wordList.get(i).toCharArray();
				char[] sortStr = str.toCharArray();

				Arrays.sort(sortWord);
				Arrays.sort(sortStr);

				// if they do, add them to the answer array
				if (Arrays.equals(sortWord, sortStr)) {
					answer.add(wordList.get(i));
				}
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Anagram a;
		a = new Anagram();
		ArrayList<String> multStr3;
		multStr3 = new ArrayList<String>();
		multStr3.add("it");
		multStr3.add("is");
		multStr3.add("enlist");
		multStr3.add("booo");
		multStr3.add("to");

		a.isAnagram("listen", multStr3);
	}
}
