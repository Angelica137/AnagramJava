import java.util.ArrayList;
import java.util.List;

public class Anagram {
	public List<String> isAnagram(String word, ArrayList<String> words) {
		ArrayList<String> answer = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			System.out.println("first loop i " + i);
			System.out.println("word is: " + words.get(i));

			// check each character in it
			// second loop
			int count = 0;
			for (int j = 0; j < words.get(i).length(); j++) {
				System.out.println("second loop j " + j);
				System.out.println(words.get(i).charAt(j));
				System.out.println(word.charAt(j));
				// against characters in the original word

				for (int k = 0; k < word.length(); k++) {
					System.out.println("third loop k " + k);
					System.out.println(words.get(i).charAt(j));
					System.out.println(word.charAt(k));

					if (words.get(i).charAt(j) == word.charAt(k)) {
						count++;
						System.out.println("count " + count);
						break;
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

	public static void main(String[] args) {
		Anagram a = new Anagram();
		ArrayList<String> singleStr = new ArrayList<String>();
		singleStr.add("lit");
		singleStr.add("otter");
		a.isAnagram("lottery", singleStr);

		// ArrayList<String> multStr = new ArrayList<String>();
		// multStr.add("it");
		// multStr.add("is");
		// multStr.add("lit");
		// multStr.add("nope");
		// a.isAnagram("list", multStr);

		// ArrayList<String> multStr2 = new ArrayList<String>();
		// multStr2.add("it");
		// multStr2.add("is");
		// multStr2.add("lit");
		// multStr2.add("otter");
		// a.isAnagram("lottery", multStr2);
	}
}
