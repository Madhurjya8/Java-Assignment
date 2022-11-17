
public class Q8 {
	static int numberOfChars = 256;
	static char checkMaxOccuringChar(String str) {
		int[] freq = new int[numberOfChars];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			freq[(int)ch]++;
		}
		int maxFreq = Integer.MIN_VALUE;
		char ans = '$';
		
		for(int i=0; i<numberOfChars; i++) {
			if(freq[i] > maxFreq) {
				maxFreq = freq[i];
				ans = (char) i;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		// WAP to find the maximum occurring character in a String.
		String str = "Madhurjya Saha";
		char ch = checkMaxOccuringChar(str);
		System.out.println("Maximum occuring character is: " + ch);
	}

}
