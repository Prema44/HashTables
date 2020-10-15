package datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyHashMapTest {

	/**
	 * Usecase1 for finding frequency
	 */
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> map = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = map.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			map.add(word, value);
		}
		int frequency = map.get("to");
		System.out.println(map);
		assertEquals(2, frequency);
	}
}
