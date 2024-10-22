package seleniumPractice;

public class StringWithoutVowels {

	public static void main(String[] args) {
		// Program to remove vowels from a given string
		
		remVowel();
		System.out.println(removeVowels("This is Testing environmnet"));

	}
	
	public static String removeVowels(String str)
	{
		String strWithoutVowels=str.replaceAll("[aeiouAEIOU]", "");
		return strWithoutVowels.replaceAll(" ", "");
	}

	public static void remVowel() {
		
		String str1 = "Testing is a domain";

		// converting string to a characters array
		char[] ch = str1.toCharArray();

		// creating blank array to store new characters array without vowels
		char[] chWithoutVowels = new char[ch.length];

		int j = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A'
					&& ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
				chWithoutVowels[j] = ch[i];
				j++;
			}
		}
		
		String str = new String(chWithoutVowels);
		String str2 = str.replaceAll(" ", "");
		System.out.println("String with vowels: " + str1);
		System.out.println("String without vowels: " + str2);
	}

}
