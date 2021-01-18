package base;

public class Firstrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="Welcome!  to Resideo";
		char[] char1 = s.toCharArray();
		firstloop:
		for(int i=0;i<=char1.length-1;i++) {
			
			for(int j=i+1;j<=char1.length-1;j++) {
				if(char1[i]==char1[j]) {
					System.out.println("This is repeated   ------>" + char1[j]);
					break firstloop ;
					
				}
				
	}

}
}
}