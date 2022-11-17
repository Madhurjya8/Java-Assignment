
public class Q4 {
	public static void countSymbols(String str) {
		int vowels = 0, consonents = 0, digits = 0, specialChars = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				ch = Character.toLowerCase(ch);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				} else {
					consonents++;
				}
			} else if(ch>='0' && ch<='9') {
				digits++;
			} else {
				specialChars++;
			}
		}
		
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonents: "+consonents);
		System.out.println("Digits: "+digits);
		System.out.println("Special characters: "+specialChars);
	}
	
	public static void main(String[] args) {
		// WAP to count the number of consonants, vowels, special characters in a String.
		String str = "iNeuron101@gmail.com";
		countSymbols(str);
	}

}
