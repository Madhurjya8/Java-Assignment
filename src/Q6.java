
public class Q6 {
	static boolean isPangram(String str) {
		boolean[] isPresent = new boolean[26];
		
		for(int i=0; i<str.length(); i++) {
			int index = 0;
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				index = ch - 'A';
			} else if(ch>='a' && ch<='z') {
				index = ch - 'a';
			} else {
				continue;
			}
			isPresent[index] = true;
		}
		
		for(int i=0; i<26; i++) {
			if(!isPresent[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// WAP to implement Pangram Checking with least inbuilt methods being used.
		String str = "The quick brown fox jumps over the lazy dog";
		if(isPangram(str)) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}
	}

}
