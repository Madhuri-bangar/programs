
		// Find frequency of vowels in a string using HashMap
		//String str = "ppeeuuuuuaaabnnee"
		//		Output : 
		//		e : 4
		//		u : 5
		//		a : 3
		//interview question 
	import java.util.HashMap;

public class VowelFrequency {
    public static void main(String[] args) {
        String str = "ppeeuuuuuaaabnnee";
        str = str.toLowerCase();

        HashMap<Character, Integer> vowelCount = new HashMap<>();
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);

        for (char ch : str.toCharArray()) {
            if (vowelCount.containsKey(ch)) {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }

        for (char vowel : vowelCount.keySet()) {
            int count = vowelCount.get(vowel);
            if (count > 0) {
                System.out.println(vowel + " : " + count);
            }
        }
    }
}
	
		
		 

		
		
	



