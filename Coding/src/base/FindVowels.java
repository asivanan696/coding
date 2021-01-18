package base;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="Hello";
		s=s.toLowerCase();
		
		char[] charA = s.toCharArray();
		
		for(int i=0;i<=charA.length-1;i++) {
			char c = charA[i];
			if(c == 'a' || c == 'e'||c == 'i' || c == 'o'||c == 'u'  ) {
				count++;
				
			}
				
				
		}
		System.out.println("count of vowels " +count);
	}

}
