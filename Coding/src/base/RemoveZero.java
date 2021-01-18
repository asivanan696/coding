package base;

public class RemoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "00000001230569"; 
		
		int i=0;
		while(str.charAt(i)== '0')
			i++;
		
		
		StringBuffer s=new StringBuffer(str);
		
		
			
			
			s.replace(0, i,"");
//			i++;
		
			System.out.println( "Heklkko : "  +s.toString());

	}
		
}
