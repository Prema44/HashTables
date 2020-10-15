package datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedHashMapTest {

	/**
	 * Usecase2 for finding frequency of paranoid
	 */
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting paranoid  themselves " + "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> map = new MyLinkedHashMap<>();
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
		int frequency = map.get("paranoid");
		System.out.println(map);
		assertEquals(4, frequency);
	}
}
