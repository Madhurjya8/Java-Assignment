
public class Q5 {
	static int numberOfChars = 256;
	public static boolean checkAnagrams(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		
		boolean flag = true;
		
		int[] freq = new int[numberOfChars];
		
		for(int i=0; i<str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			freq[(int)ch1]++;
			freq[(int)ch2]--;
		}
		
		for(int i=0; i<numberOfChars; i++) {
			if(freq[i] != 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	

	public static void main(String[] args) {
		// WAP to implement Anagram Checking least inbuilt methods being used.
		String str1 = "cafe";
		String str2 = "face";
		if(checkAnagrams(str1, str2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
