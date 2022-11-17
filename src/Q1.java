
public class Q1 {
	public static void removeDuplicates(String str) {
		String temp = new String();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(temp.indexOf(ch) < 0) {
				temp += ch;
			}
		}
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		// WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
		String str = "abcabc";
		System.out.print("The string after removing duplicates: ");
		removeDuplicates(str);
	}

}
