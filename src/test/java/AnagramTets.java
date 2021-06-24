import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class AnagramTets {
	private Anagram a;
	private ArrayList<String> singleStr;

	@Before
	public void setup() {
		a = new Anagram();
		singleStr = new ArrayList<String>();
		singleStr.add("lit");
	}

	@Test
	public void testAnagramReturnsAnagram() {
		assertThat(a.isAnagram("list", singleStr)).containsExactlyInAnyOrder("lit");
	}

}
