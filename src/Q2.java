
public class Q2 {
	public static void printDuplicates(String str) {
		String temp = new String();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(temp.indexOf(ch) < 0) {
				temp += ch;
			} else {
				System.out.println(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		// WAP to print Duplicates characters from the String.
		String str = "abcabc";
		System.out.println("The duplicate characters are: ");
		printDuplicates(str);
	}

}
