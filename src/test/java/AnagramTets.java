
//import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
//import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class AnagramTets {
	private Anagram a;
	private ArrayList<String> singleStr;
	private ArrayList<String> multStr;
	private ArrayList<String> multStr2;

	@Before
	public void setup() {
		a = new Anagram();
		singleStr = new ArrayList<String>();
		singleStr.add("lit");
		multStr = new ArrayList<String>();
		multStr.add("it");
		multStr.add("is");
		multStr.add("lit");
		multStr.add("nope");
		multStr2 = new ArrayList<String>();
		multStr2.add("it");
		multStr2.add("is");
		multStr2.add("lit");
		multStr2.add("otter");
	}

	@Test
	public void testAnagramReturnsAnagram() {
		assertThat(a.isAnagram("list", singleStr)).containsOnly("lit");
	}

	@Test
	public void testAnagramReturnsAngrams() {
		assertThat(a.isAnagram("list", multStr)).containsOnly("it", "is", "lit");
	}

	@Test
	public void testAnagramDiplicateLetters() {
		assertThat(a.isAnagram("lottery", multStr2)).containsOnly("otter");
	}

}
