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

}
