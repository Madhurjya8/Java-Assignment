
public class Q7 {
	static boolean checkUnique(String str) {
		String temp = new String();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(temp.indexOf(ch) < 0) {
				temp += ch;
			} else {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// WAP to find if String contains all unique characters.
		String str = "abcdef";
		if(checkUnique(str)) {
			System.out.println("unique");
		} else {
			System.out.println("Not unique");
		}

	}

}
